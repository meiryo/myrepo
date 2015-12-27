package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q005 {
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] readArray = line.split(" "); //$NON-NLS-1$

		int value = Integer.parseInt(readArray[0]);
		int sub = Integer.parseInt(readArray[1]);

		System.out.print(value + " "); //$NON-NLS-1$

		for (int i = 2; i <= 10; i++) {
			value += sub;
			if (i == 10) {
				System.out.print(value);
				break;
			}
			System.out.print(value + " "); //$NON-NLS-1$

		}
	}
}
