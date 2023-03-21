import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
		//정수 입력
		int n = sc.nextInt();
		int m = sc.nextInt();
		//행렬 생성
		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		
		//첫번째 행렬 값 입력
		for(int i =0 ; i<n;i++) {
			for(int j=0;j<m;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		//두번째 행렬 값 입력
		for(int i =0 ; i<n;i++) {
			for(int j=0;j<m;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		//각각 인덱스 값 출력
		for(int i =0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr1[i][j]+arr2[i][j]+" ");
				if(j == m-1) {
					System.out.println();
				}
			}
		}
		
	}

}
