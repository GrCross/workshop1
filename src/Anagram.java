import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class Anagram {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine().toLowerCase();
		String b = br.readLine().toLowerCase();
		int i = 0;
		int j = a.length()-1;
		boolean anagram = true;
		if(a.length() != b.length()) {
			anagram = false;
		}else {
			HashMap<Character,Integer> letraA = new HashMap<Character, Integer>();
			HashMap<Character,Integer> letraB = new HashMap<Character, Integer>();
			for (int k = 0; k < a.length(); k++) {
				char temp1 = a.charAt(k);
				char temp2 = b.charAt(k);

				if(letraA.containsKey(temp1)) {
					letraA.put(temp1, letraA.get(temp1)+1);
				} else {
					letraA.put(temp1, 1);
				}
				
				if(letraB.containsKey(temp2)) {
					letraB.put(temp2, letraB.get(temp2)+1);
				}else {
					letraB.put(temp2, 1);
				}
			}
			int temp1 = 0;
			int temp2 = 0;
			for (int w = 0; w < a.length(); w++) {
				if(letraA.containsKey(b.charAt(w))) {
					temp1 = letraA.get(a.charAt(w));
					temp2 = letraB.get(b.charAt(w));
					if(temp1 != temp2) {
						anagram = false;
						break;
					}
				}else {
					anagram = false;
					break;
				} 
			}
			
		}
		
		if(anagram) {
			System.out.println("Anagrams");
		}else System.out.println("Not Anagrams");
		
	}

}
