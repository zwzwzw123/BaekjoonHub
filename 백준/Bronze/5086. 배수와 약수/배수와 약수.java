import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.chrono.ThaiBuddhistEra;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		
		String f = "factor\n";
		String m = "multiple\n";
		String n = "neither\n";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			if(first == 0 && second == 0) break;
			
			//첫번째 수, 두번째 수 약수 일때
			if(second % first == 0) sb.append(f);
			
			//첫번째 수, 두번째 수 배수 일때
			else if(first % second == 0) sb.append(m);
			
			//약수, 배수가 아닐 때
			else sb.append(n);
		}
		
		System.out.println(sb);
		
	}

}
