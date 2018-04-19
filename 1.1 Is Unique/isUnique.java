import java.util.HashMap;

public class isUnique{

  public static boolean isUnique(String A) { //Without a Data Structure 
		for (int i = 0; i < A.length() - 1; i++)
			for (int j = i + 1; j < A.length(); j++)
				if (A.charAt(i) == A.charAt(j))
					return false;
		return true;
	}
	
	public static boolean loadWord(String A) { //With a Data Structure
		Hashtable<Character, Integer> wordHash = new Hashtable<Character, Integer>();
		for (int i = 0; i < A.length(); i++) {
			if (!wordHash.containsKey(A.charAt(i)))
				wordHash.put(A.charAt(i), i);
			return false;
		}
		return true;
	}	


}
