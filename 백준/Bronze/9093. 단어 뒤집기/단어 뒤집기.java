import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for(int i = 0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                StringBuilder sb = new StringBuilder(st.nextToken());
                answer.append(sb.reverse()+" ");
            }
            answer.append('\n');
        }
        System.out.print(answer);
    }
}
