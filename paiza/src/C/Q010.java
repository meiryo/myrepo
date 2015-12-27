package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q010 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] readArray = line.split(" "); //$NON-NLS-1$
		int x = Integer.parseInt(readArray[0]);
		int y = Integer.parseInt(readArray[1]);
		int R = Integer.parseInt(readArray[2]);

		String line2 = br.readLine();
		int max = Integer.parseInt(line2);

		int[] arrayX = new int[max];
		int[] arrayY = new int[max];
		for (int i = 0; i < max; i++) {
			String[] zahyou = br.readLine().split(" "); //$NON-NLS-1$
			arrayX[i] = Integer.parseInt(zahyou[0]) - x;
			arrayY[i] = Integer.parseInt(zahyou[1]) - y;
		}

		for (int j = 0; j < max; j++) {
			int siki = arrayX[j] * arrayX[j] + arrayY[j] * arrayY[j];
			if (R * R <= siki) {
				System.out.println("silinet"); //$NON-NLS-1$
			} else {
				System.out.println("noisy"); //$NON-NLS-1$
			}
		}

	}
}
