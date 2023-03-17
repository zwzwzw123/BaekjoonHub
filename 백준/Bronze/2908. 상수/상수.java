import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader rs = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(rs.readLine());
		
		//toString() : StringBuilder타입을 문자열로 변환
		//Integer.parseInt() : 위의 문자열을 int값으로 변환
		int A =Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B =Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(A>B?A:B);
		
	}
}
