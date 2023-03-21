import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 검은 영역의 넓이
		int total = 0;
		int n = Integer.parseInt(br.readLine());// 색종이 갯수
		boolean[][] arr = new boolean[101][101];// 도화지 크기

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			// (x,y)부터 (x+9, y+9)까지의 영역을 하나씩 체크한 후 총 넓이에 더해줌
			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					if (!arr[j][k]) {
						arr[j][k] = true;
						total++;
					}

				}
			}
		}
		System.out.println(total);
	}
}
