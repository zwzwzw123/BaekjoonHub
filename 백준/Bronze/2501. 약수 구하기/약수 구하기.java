import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//두개의 입력값 받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int count = 0;
		int result = 0;
		
		//약수구하기
		for(int i = 1;i<=N;i++) {
			
			//k번째 값 출력하기
			if(N % i ==0) count++;
			if(count ==K) {
				result =i;
				break;
			}
		}
		System.out.println(result);
	}
}
