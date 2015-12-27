package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q017 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] parent = br.readLine().split(" "); //$NON-NLS-1$
		int first = Integer.parseInt(parent[0]);
		int second = Integer.parseInt(parent[1]);

		String target = br.readLine();
		int max = Integer.parseInt(target);
		String[][] rog = new String[max][];
		for (int i = 0; i < max; i++) {
			rog[i] = br.readLine().split(" "); //$NON-NLS-1$
		}

		for (int i = 0; i < max; i++) {
			String result = "High"; //$NON-NLS-1$
			int childFirst = Integer.parseInt(rog[i][0]);
			int childSecond = Integer.parseInt(rog[i][1]);
			if (childFirst == first) {
				if (childSecond < second) {
					result = "Low"; //$NON-NLS-1$
				}
			} else if (childFirst > first) {
				result = "Low"; //$NON-NLS-1$
			}
			System.out.println(result);
		}

	}

}
