import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//출력값의 상대오차 10 -2이하이므 double형
		double arr[] = new double[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//배열에 숫자 넣기
		for(int i =0;i<arr.length;i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		//평균을 구하기 위한 변수 
		double sum =0;
		//최댓값을 구하기 위한 정렬
		Arrays.sort(arr);
		
		for(int i =0;i<arr.length;i++) {
			sum += ((arr[i]/arr[arr.length-1])*100);
		}
		System.out.println(sum / arr.length);
		
	}
}
