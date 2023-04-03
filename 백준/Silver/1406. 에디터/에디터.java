import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());

        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for(int i =  0;i<str.length();i++){
            //명령어가 수행되기 전 커서는 문장의 맨뒤에 위치
            leftStack.push(str.charAt(i));
        }

        while (N -->0){
            String[]line = br.readLine().split(" ");
            //커서왼쪽으로 한칸이동
            if(line[0].equals("L")){
                if(!leftStack.empty()){
                    rightStack.push(leftStack.pop());
                }
            } //커서 오른쪽으로 한칸 이동
            else if (line[0].equals("D")  ) {
                if(!rightStack.empty()){
                    leftStack.push(rightStack.pop());
                }
            }//커서 왼쪽 문자 삭제
            else if (line[0].equals("B")) {
                if(!leftStack.empty()){
                    leftStack.pop();
                }
            } // P 다음 문자 왼쪽 추가
            else if (line[0].equals("P")) {
                leftStack.push(line[1].charAt(0));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!leftStack.empty()){
            rightStack.push(leftStack.pop());
        }
        while (!rightStack.empty()){
            sb.append(rightStack.pop());
        }
        System.out.println(sb);

    }
}
