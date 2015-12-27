package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q022 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		String line2 = br.readLine();

		int val1 = Integer.parseInt(line1);
		int val2 = Integer.parseInt(line2);

		System.out.println(180 - (val1 + val2));
	}

}
