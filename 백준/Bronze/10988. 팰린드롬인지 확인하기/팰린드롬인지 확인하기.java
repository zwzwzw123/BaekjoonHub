import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		//문자열 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		StringBuilder sb = new StringBuilder(s);
		br.close();

		if(s.equals(sb.reverse().toString())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

		
		
	}

}
