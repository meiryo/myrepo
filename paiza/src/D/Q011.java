package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q011 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //$NON-NLS-1$

		int answer = str.indexOf(line);

		System.out.println(answer + 1);
	}

}
