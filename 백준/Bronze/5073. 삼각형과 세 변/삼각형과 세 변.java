import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			// 0,0,0 일떄 break
			if (a == 0 && b == 0 && c == 0)
				break;

			// Invalid : 삼각형의 조건을 만족하지 못한 경우
			int max = Math.max(Math.max(a, b), c);

			if (max == a) {
				int sum = b + c;

				if (a >= sum) {
					System.out.println("Invalid");
					continue;
				}
			}
			if (max == b) {
				int sum = a + c;

				if (b >= sum) {
					System.out.println("Invalid");
					continue;
				}
			}
			if (max == c) {
				int sum = a + b;

				if (c >= sum) {
					System.out.println("Invalid");
					continue;
				}
			}

			// Scalene : 세변의 길이가 모두 다른 경우
			if (a != b && a != c && b != c) {
				System.out.println("Scalene");
				continue;
			}

			// Equilateral : 세변의 길이가 모두 같은 경우
			if (a == b && a == c && b == c) {
				System.out.println("Equilateral ");
				continue;
			}

			// Isosceles : 두변의 길이만 같은 경우
			if (a == b || a == c || b == c) {
				System.out.println("Isosceles");
				continue;
			}
		}
	}

}
