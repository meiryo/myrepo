package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q024 {

	public static void main(String[] args) throws IOException {

		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l1 = br.readLine();
		int max = Integer.parseInt(l1);

		int variable1 = 0;
		int variable2 = 0;
		for (int i = 0; i < max; i++) {
			String[] target = br.readLine().split(" ");
			String order = target[0];

			switch (order) {
			case "ADD":
				variable2 = variable1 + Integer.parseInt(target[1]);
				break;

			case "SET":
				if (target[1].equals("1")) {
					variable1 = Integer.parseInt(target[2]);
				}
				if (target[1].equals("2")) {
					variable2 = Integer.parseInt(target[2]);
				}
				break;

			case "SUB":
				variable2 = variable1 - Integer.parseInt(target[1]);
				break;

			default:
				break;
			}
		}
		System.out.print(variable1 + " ");
		System.out.println(variable2);
	}

}
