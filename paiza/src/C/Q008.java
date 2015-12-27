package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q008 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		System.out.println(line.substring(0, 4));
		System.out.println(line.substring(3, 9));
	}

}
