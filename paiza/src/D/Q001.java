package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q001 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] readArray = line.split(" "); //$NON-NLS-1$

		int val1 = Integer.parseInt(readArray[0]);
		int val2 = Integer.parseInt(readArray[1]);

		if (val1 > val2) {
			System.out.println(val1);
		} else if (val1 < val2) {
			System.out.println(val2);
		} else {
			System.out.println("eq"); //$NON-NLS-1$
		}

	}

}
