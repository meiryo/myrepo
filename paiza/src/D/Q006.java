package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q006 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] readArray = line.split(" "); //$NON-NLS-1$

		int num = Integer.parseInt(readArray[0]);
		String unit = readArray[1];

		switch (unit) {
		case "km": //$NON-NLS-1$
			System.out.println(num * 1000000);
			break;
		case "m": //$NON-NLS-1$
			System.out.println(num * 1000);
			break;
		case "cm": //$NON-NLS-1$
			System.out.println(num * 10);
			break;
		default:
			System.out.println("入力形式が異なります。"); //$NON-NLS-1$
			break;
		}

	}

}
