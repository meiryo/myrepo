package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q020 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		String searchWord = "A"; //$NON-NLS-1$

		int num = (target.length() - target.replaceAll(searchWord, "").length()) / searchWord.length(); //$NON-NLS-1$

		System.out.println(num);
	}

}
