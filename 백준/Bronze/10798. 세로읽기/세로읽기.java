import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //세로5, 가로 15 배열 선언
        char[][]arr = new char[5][15];
        //각 배열의 최대 길이 변수
        int max = 0;
        
        for(int i=0;i<5;i++){
            //입력받을 문자열
            String st = br.readLine();
            if(max<st.length()) max=st.length();
            
            for(int j=0 ; j<st.length() ; j++){
				arr[i][j] = st.charAt(j);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<max;i++){
            for(int j = 0;j<5;j++){
                if(arr[j][i]=='\0') continue;
                sb.append(arr[j][i]);
            }
        }
        System.out.print(sb);
	}
}
