package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q022 {

	public static void main(String[] args) throws IOException {

		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len = Integer.parseInt(str);

		String[][] input = new String[len][];
		int first = 0;
		int end = 0;
		int min = 999999;
		int max = 0;
		for (int i = 0; i < len; i++) {
			String target = br.readLine();
			input[i] = target.split(" "); //$NON-NLS-1$
			if (i == 0) {
				first = Integer.parseInt(input[i][0]);
			}
			if (i == len - 1) {
				end = Integer.parseInt(input[i][1]);
			}
			if (max < Integer.parseInt(input[i][2])) {
				max = Integer.parseInt(input[i][2]);
			}
			if (Integer.parseInt(input[i][3]) < min) {
				min = Integer.parseInt(input[i][3]);
			}
		}

		System.out.println(first + " " + end + " " + max + " " + min);
	}
}
