package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q016 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		int max = Integer.parseInt(br.readLine());

		System.out.println(line1.substring(0, max));
	}

}
