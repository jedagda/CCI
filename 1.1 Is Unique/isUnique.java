public class isUnique{

  public static boolean isUnique(String A) {
		for (int i = 0; i < A.length() - 1; i++)
			for (int j = i + 1; j < A.length(); j++)
				if (A.charAt(i) == A.charAt(j))
					return false;
		return true;
	}
}
