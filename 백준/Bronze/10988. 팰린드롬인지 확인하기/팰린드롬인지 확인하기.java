import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		//문자열 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();

		//팰린드롬 확인 변수
		int ans = 1;
		
		//반복문으로 확인
		for(int i =0;i<str.length()-1;i++) {
			char c = str.charAt(i);
			
			if(c!= str.charAt(str.length()-i-1)) {
				ans=0;
				break;
			}
		}
		System.out.println(ans);

	}

}
