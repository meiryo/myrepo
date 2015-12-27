package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q007 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int num = Integer.parseInt(line);

		if (num % 2 == 0) {
			System.out.println("even"); //$NON-NLS-1$
		} else {
			System.out.println("odd"); //$NON-NLS-1$
		}

	}

}
