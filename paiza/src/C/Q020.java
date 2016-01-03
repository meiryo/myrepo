package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q020 {
	@SuppressWarnings("boxing")
	public static void main(String[] args) throws IOException {

		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		String[] input = target.split(" "); //$NON-NLS-1$
		Double[] num = new Double[3];
		for (int i = 0; i < input.length; i++) {
			num[i] = Double.parseDouble(input[i]);
		}

		double price = num[0] * (100 - num[1]) / 100 * (100 - num[2]) / 100;

		System.out.println(price);

	}
}
