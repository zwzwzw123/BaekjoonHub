import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 문자를 가르킬 배열
		int[] arr = new int[26];

		// 배열을 모두 -1로 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		// 문자열 입력
		String S = br.readLine();

		// 각 문자열 검사
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);

			// 아스키코드이기때문에
			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}

		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
