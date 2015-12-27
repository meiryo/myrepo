package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q005 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {
			String readLine = br.readLine();
			readLine = readLine.trim();
			System.out.println(checkIP(readLine));
		}
	}

	public static String checkIP(String str) {
		int param = (str.length() - str.replaceAll(".", "").length())/".".length(); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		if (param != 3) {
			return "False"; //$NON-NLS-1$
		}

		String[] block = str.split("."); //$NON-NLS-1$
		for (int i = 0; i < block.length; i++) {
			if (0 > Integer.parseInt(block[i]) || Integer.parseInt(block[i]) > 255) {
				return "False"; //$NON-NLS-1$
			}
		}

		return "True"; //$NON-NLS-1$
	}

}
