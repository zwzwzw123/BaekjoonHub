import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[]arr = new int[N];

        //값 입력 받기
        for(int i = 0 ; i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0;i<N-1;i++){
            //[0]과 [1]을 비교하기 위해 i+1부터
            for(int j = i+1 ; j<N;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int val :arr){
            System.out.println(val);
        }
    }
}
