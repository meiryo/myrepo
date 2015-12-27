package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q019 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String line2 = br.readLine();

		if (line.equals(line2)) {
			System.out.println("Yes"); //$NON-NLS-1$
		} else {
			System.out.println("No"); //$NON-NLS-1$
		}
	}

}
