import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> que = new LinkedList<>();

        for(int i = 1;i<=n;i++){
            que.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (que.size()!=1){
            for(int i = 0;i<k-1;i++){
                que.offer(que.poll());
            }
            sb.append(que.poll()+", ");
        }

        sb.append(que.poll()).append(">");

        System.out.println(sb);

    }
}
