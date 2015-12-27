package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q018 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] readArray = line.split(" "); //$NON-NLS-1$

		String str = readArray[0];
		int val2 = Integer.parseInt(readArray[1]);

		System.out.println(str.substring(val2 - 1, val2));

	}

}
