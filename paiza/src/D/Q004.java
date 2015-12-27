package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author 文字列の結合
 *
 */
public class Q004 {
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		System.out.print("Hello "); //$NON-NLS-1$

		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String readLine = br.readLine();
			readLine = readLine.trim();

			if (i == N - 1) {
				System.out.print(readLine + "."); //$NON-NLS-1$
				break;
			}

			System.out.print(readLine + ',');
		}
	}
}
