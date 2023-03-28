import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 1.인풋 값 받기
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		String[] board = new String[N];
		for (int i = 0; i < N; i++)
			board[i] = br.readLine();

		// 2. 체스판 자르기
		int sol = Integer.MAX_VALUE;
		for (int i = 0; i <= N - 8; i++) {
			for (int j = 0; j <= M - 8; j++) {
				// 3.현 체스판의 최소비용 구하기
				int curSol = find(i, j, board);
				//4. 전체 최적의 값과 비교해 갱신하기
				if (sol > curSol)
					sol = curSol;
			}
		}
		System.out.println(sol);
	}

	public static int find(int startRow, int startCol, String[] board) {
		// 정답지 : 정답지와 비교를 위해
		String[] orgBoard = { "WBWBWBWB", "BWBWBWBW" };
		int whiteSol = 0;
		for (int i = 0; i < 8; i++) {
			int row = startRow + i;
			for (int j = 0; j < 8; j++) {
				int col = startCol + j;
				if (board[row].charAt(col) != orgBoard[row % 2].charAt(j))
					whiteSol++;
			}
		}
		return Math.min(whiteSol, 64 - whiteSol);
	}

}
