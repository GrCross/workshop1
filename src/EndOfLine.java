import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndOfLine {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int i = 1;
	        String temp = " ";
	        while (true) {
	            
	            temp = br.readLine();
	            if (temp == null)break;
	            System.out.println(i + " " + temp);
	            i += 1;
	            
	        }
	}

}
