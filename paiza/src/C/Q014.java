package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q014 {
	public static void main(String[] args) throws IOException {

		System.out.println("入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] readLineArray = line.split(" ");

		int boxCount = Integer.parseInt(readLineArray[0]);
		int r = Integer.parseInt(readLineArray[1]);
		String[][] box = new String[boxCount][];
		for (int i = 0; i < boxCount; i++) {
			box[i] = br.readLine().split(" ");
		}

		for (int i = 0; i < boxCount; i++) {
			int min = getMinimum(box[i][0], box[i][1], box[i][2]);
			if (r * 2 <= min) {
				System.out.println(i + 1);
			}
		}

	}

	public static int getMinimum(String a, String b, String c) {
		String min;
		if (Integer.parseInt(a) <= Integer.parseInt(b)) {
			min = a;
			if (Integer.parseInt(a) <= Integer.parseInt(c)) {
				min = a;
			} else {
				min = c;
			}
		} else {
			min = b;
			if (Integer.parseInt(b) <= Integer.parseInt(c)) {
				min = b;
			} else {
				min = c;
			}
		}
		return Integer.parseInt(min);
	}
}
