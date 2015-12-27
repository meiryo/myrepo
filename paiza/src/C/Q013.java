package C;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q013 {

	public static void main(String[] args) throws Exception {
		// 自分の得意な言語で
		// Let's チャレンジ！！
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String iya = br.readLine();
		int roomCount = Integer.parseInt(br.readLine());
		String[] rooms = new String[roomCount];

		int hitCount = 0;
		for (int i = 0; i < roomCount; i++) {
			String room = br.readLine();
			if (room.indexOf(iya) == -1) {
				rooms[i] = room;
				hitCount++;
			}
		}

		if (hitCount == 0) {
			System.out.println("none");
		} else {
			for (int j = 0; j < roomCount; j++) {
				if (rooms[j] != null) {
					System.out.println(rooms[j]);
				}
			}

		}
	}
}
