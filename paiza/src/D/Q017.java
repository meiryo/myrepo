package D;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q017 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] numArray = new int[5];
		int max = 0;
		int min = 99;
		for (int i = 0; i < 5; i++) {
			String line = br.readLine();
			numArray[i] = Integer.parseInt(line);

			if (max < numArray[i]) {
				max = numArray[i];
			}
			if (min > numArray[i]) {
				min = numArray[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
