import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] N = new int[9];
		
		for(int i =0; i<9;i++) {
			N[i] = Integer.parseInt(br.readLine()); 
		}
		
		int max = 0;
		int index = 0;
		
		int count = 0;
		
		for(int i =0;i<N.length;i++) {
			count++;
			if(N[i]>max) {
				max =N[i];
				index = count;
			}
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}

}
