package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q006 {
	@SuppressWarnings("boxing")
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String line2 = br.readLine();

		String[] str = line1.split(" "); //$NON-NLS-1$
		int countN = Integer.parseInt(str[0]);
		int countM = Integer.parseInt(str[1]);
		int K = Integer.parseInt(str[2]);

		String[] M = line2.split(" "); //$NON-NLS-1$

		Double[] sum = new Double[countM];
		int[] rank = new int[countM];
		for (int i = 0; i < countM; i++) {
			sum[i] = 0.0;
			String readLine = br.readLine();
			String[] N = readLine.split(" "); //$NON-NLS-1$
			for (int j = 0; j < countN; j++) {
				sum[i] += Double.parseDouble(M[j]) * Double.parseDouble(N[j]);
			}
			rank[i] = (int) Math.round(sum[i]);
		}

		Arrays.sort(rank);
		for (int i = countM - 1; i >= countM - K; i--) {
			System.out.println(rank[i]);
		}

	}
}
