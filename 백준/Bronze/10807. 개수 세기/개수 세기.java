import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] arr = new int[a];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < a; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int searchNum = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = 0; i < a; i++) {
			if (arr[i] == searchNum) {
				cnt++;
			}
		}
		System.out.println(cnt);
		br.close();

	}

}
