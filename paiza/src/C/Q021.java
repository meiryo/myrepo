package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q021 {
	public static void main(String[] args) throws IOException {

		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		String[] input = target.split(" "); //$NON-NLS-1$
		int[] num = new int[4];
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}

		int max = Integer.parseInt(br.readLine());
		int[] x = new int[max];
		int[] y = new int[max];
		for (int i = 0; i < max; i++) {
			String[] zahyo = br.readLine().split(" ");
			x[i] = Integer.parseInt(zahyo[0]);
			y[i] = Integer.parseInt(zahyo[1]);
		}

		for (int i = 0; i < max; i++) {
			System.out.println(result(x[i], y[i], num));
		}
	}

	public static String result(int x, int y, int[] hani) {
		int xc = hani[0];
		int yc = hani[1];
		int r1 = hani[2];
		int r2 = hani[3];

		int xy = (x - xc) * (x - xc) + (y - yc) * (y - yc);

		if (r1 * r1 <= xy && xy <= r2 * r2) {
			return "yes";
		}
		return "no";
	}
}
