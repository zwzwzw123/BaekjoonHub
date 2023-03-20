import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[]args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0;i<testcase;i++) {
			st = new StringTokenizer(br.readLine());
			
			//입력 받을 학생수
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			//성적 누적 합 변수
			double sum =0;
			
			//성적 입력부분
			for(int j =0;j<N;j++) {
				//성적 저장
				int val = Integer.parseInt(st.nextToken());
				arr[j] =val;
				sum+= val;//성적 누적 합
			}
			
			double mean = (sum/N);
			double count =0;// 평균을 넘는 학생 수
			
			//평균 넘는 학생 비율
			for(int j=0;j<N;j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
			
		}
	}
}
