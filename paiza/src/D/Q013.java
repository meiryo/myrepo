package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q013 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] readArray = line.split(" "); //$NON-NLS-1$

		int val1 = Integer.parseInt(readArray[0]);
		int val2 = Integer.parseInt(readArray[1]);

		System.out.print(val1 / val2 + " "); //$NON-NLS-1$
		System.out.println(val1 % val2);

	}

}
