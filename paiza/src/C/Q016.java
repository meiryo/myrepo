package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q016 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();

		char[] before = { 'A', 'E', 'G', 'I', 'O', 'S', 'Z' };
		char[] after = { '4', '3', '6', '1', '0', '5', '2' };

		for (int i = 0; i < before.length; i++) {
			if (target.indexOf(before[i]) != -1) {
				target = target.replace(before[i], after[i]);
			}
		}
		System.out.println(target.toString());
	}

}
