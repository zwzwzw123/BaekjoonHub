import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader rs = new BufferedReader(new InputStreamReader(System.in));
		String str = rs.readLine();
		int index = Integer.parseInt(rs.readLine());
		
		System.out.println(str.substring(index-1,index));
	}
}
