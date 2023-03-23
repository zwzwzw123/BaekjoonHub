import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			//-1 입력 시 종료
			if(n == -1) break;
			
			int[]arr = new int[n]; //약수 담을 배열
			int sum = 0; //약수의 합
			int index =0;
			
			for(int i =1; i < n ; i++) {
				if(n % i == 0) {
					arr[index++] = i;
					sum += i;
				}
			}
			
			if(sum != n) {
				System.out.println(n+" is NOT perfect.");
				continue;
			}
			
			System.out.print(n+" = ");
			for(int i = 0 ; i < index ; i++) {
				System.out.print(arr[i]);
				if(i+1 != index) System.out.print(" + ");
			}
			System.out.println();
		}
	}
}
