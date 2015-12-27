package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q028 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		int minutes = Integer.parseInt(line);

		System.out.println(minutes * 60);

	}

}
