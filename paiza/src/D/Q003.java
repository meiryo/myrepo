package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q003 {
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int num = Integer.parseInt(line);

		for (int i = 1; i < 9; i++) {
			System.out.print(num * i + " "); //$NON-NLS-1$
		}

		System.out.println(num * 9);
	}
}
