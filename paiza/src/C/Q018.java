package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q018 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target1 = br.readLine();
		int max1 = Integer.parseInt(target1);
		String[][] rog1 = new String[max1][];
		for (int i = 0; i < max1; i++) {
			rog1[i] = br.readLine().split(" "); //$NON-NLS-1$
		}

		String target2 = br.readLine();
		int max2 = Integer.parseInt(target2);
		String[][] rog2 = new String[max2][];
		for (int i = 0; i < max2; i++) {
			rog2[i] = br.readLine().split(" "); //$NON-NLS-1$
		}

		int set = 100;
		boolean flag = false;
		for (int i = 0; i < max1; i++) {
			for (int j = 0; j < max2; j++) {
				if (rog1[i][0].equals(rog2[j][0])) {
					int num = Integer.parseInt(rog2[j][1]) / Integer.parseInt(rog1[i][1]);
					if (num < set && num != 0) {
						set = num;
					}
					if (i == max1 - 1) {
						flag = true;
					}
					break;
				}
			}

		}
		if (flag) {
			System.out.println(set);
		} else {
			System.out.println("0"); //$NON-NLS-1$
		}

	}

}
