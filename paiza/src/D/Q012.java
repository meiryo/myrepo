package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q012 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		double num = Double.parseDouble(line);

		int avs = (int) Math.abs(num);

		System.out.println(avs);
	}

}
