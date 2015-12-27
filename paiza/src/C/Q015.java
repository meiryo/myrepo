package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q015 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		int max = Integer.parseInt(target);
		String[][] rog = new String[max][];
		for (int i = 0; i < max; i++) {
			rog[i] = br.readLine().split(" ");
		}

		int point = 0;
		for (int i = 0; i < max; i++) {
			if (rog[i][0].indexOf("5") != -1) {
				int cal = (int) (Integer.parseInt(rog[i][1]) * 0.05);
				point += cal;
				continue;
			}
			if (rog[i][0].indexOf("3") != -1) {
				int cal = (int) (Integer.parseInt(rog[i][1]) * 0.03);
				point += cal;
				continue;
			}
			point += Integer.parseInt(rog[i][1]) * 0.01;
		}
		System.out.println(point);
	}

}
