package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q015 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int num = Integer.parseInt(line);

		while (num > 0) {
			System.out.println(num);
			num--;
		}
	}

}
