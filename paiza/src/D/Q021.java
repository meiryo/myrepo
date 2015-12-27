package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q021 {
	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int num = Integer.parseInt(line);
		System.out.println(6 * num * num);
	}
}
