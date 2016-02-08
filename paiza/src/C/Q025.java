package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q025 {

	public static void main(String[] args) throws IOException {

		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l1 = br.readLine();
		int maxTake = Integer.parseInt(l1);

		String l2 = br.readLine();
		int faxCount = Integer.parseInt(l2);

		String[] hour = new String[faxCount];
		String[] minutes = new String[faxCount];
		String[] num = new String[faxCount];

		for (int i = 0; i < faxCount; i++) {
			String ln = br.readLine();
			String[] str = ln.split(" ");
			hour[i] = str[0];
			minutes[i] = str[1];
			num[i] = str[2];
		}

		int curryCount = 0;
		int subCount = 0;
		int sum = 0;
		for (int i = 0; i < faxCount - 1; i++) {
			if (i == 0) {
				sum = Integer.parseInt(num[i]);
			} else if (hour[i].equals(hour[i + 1])) {
				sum += Integer.parseInt(num[i]);
				if (i == faxCount - 1) {
					sum += Integer.parseInt(num[i + 1]);
				}
			} else {
				sum += Integer.parseInt(num[i]);
				subCount = Integer.parseInt(num[i]);
				if (sum % maxTake != 0) {
					curryCount += sum / maxTake + 1;
				} else {
					curryCount += sum / maxTake;
				}
				sum = subCount;
				if (i == faxCount - 1) {
					subCount = Integer.parseInt(num[i+1]);
					if (subCount % maxTake != 0) {
						curryCount += subCount / maxTake + 1;
					} else {
						curryCount += subCount / maxTake;
					}
				}
			}
		}
		System.out.println(curryCount);

	}

}
