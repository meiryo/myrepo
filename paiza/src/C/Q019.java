package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q019 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		int max = Integer.parseInt(target);
		int[] numArray = new int[max + 1];
		for (int i = 1; i <= max; i++) {
			numArray[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 1; i <= max; i++) {
			String result = "neither"; //$NON-NLS-1$
			int count = 0;
			for (int j = 1; j < numArray[i]; j++) {
				if (numArray[i] % j == 0) {
					count += j;
				}
			}
			if (numArray[i] == count) {
				result = "perfect"; //$NON-NLS-1$
			}
			if (numArray[i] <= count && count - numArray[i] == 1) {
				result = "nearly"; //$NON-NLS-1$
			}
			if (numArray[i] > count && numArray[i] - count == 1) {
				result = "nearly"; //$NON-NLS-1$
			}
			System.out.println(result.toString());
		}

	}
}
