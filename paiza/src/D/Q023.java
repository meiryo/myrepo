package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q023 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int size = line.length();

		for (int i = size; i < 3; i++) {
			line = "0" + line; //$NON-NLS-1$
		}
		System.out.println(line);
	}

}
