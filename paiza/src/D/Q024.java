package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q024 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int resCount = 0;
		for (int i = 0; i < 7; i++) {
			String line = br.readLine();
			if (line.equals("no")) { //$NON-NLS-1$
				resCount++;
			}
		}
		System.out.println(resCount);
	}

}
