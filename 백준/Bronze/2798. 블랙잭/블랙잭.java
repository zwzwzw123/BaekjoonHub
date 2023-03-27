import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[]arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int result = search(arr,N,M);
		System.out.println(result);
	}

	 static int search(int[] arr, int N, int M) {
		 int result = 0;
		 
		 //첫번째카드는 3개를 고르기 때문에 N-2까지 순회
		 for(int i = 0;i<N-2;i++) {
			 
			 //두번째카드는 첫번째카드 다음부터 N-1까지 순회
			 for(int j =i+1;j<N-1;j++) {
				 
				 //
				 for(int k = j+1;k<N;k++) {
					 
					 int temp = arr[i] + arr[j] +arr[k];
					 
					 if(M ==temp) return temp;
					 
					 //세 카드의 합이 이전 합보다 크면서 M보다 작을 경우 result 갱신
					 if(result < temp && temp <M) result = temp;
				 }
			 }
		 }
		return result;
	}
}
