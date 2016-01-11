package C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q023 {

	public static void main(String[] args) throws IOException {

		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l1 = br.readLine();
		String[] atari = l1.split(" ");
		String l2 = br.readLine();
		int max = Integer.parseInt(l2);

		for(int i = 0;i < max ; i++){
			String[] target = br.readLine().split(" ");
			int hitCount = 0;
			for(int j = 0; j < 6; j++){
				if(atari[0].equals(target[j])){
					hitCount++;
				}
				if(atari[1].equals(target[j])){
					hitCount++;
				}
				if(atari[2].equals(target[j])){
					hitCount++;
				}
				if(atari[3].equals(target[j])){
					hitCount++;
				}
				if(atari[4].equals(target[j])){
					hitCount++;
				}
				if(atari[5].equals(target[j])){
					hitCount++;
				}
			}
			System.out.println(hitCount);
		}
	}

}
