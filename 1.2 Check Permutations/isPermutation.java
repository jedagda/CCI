public class isPermutation{

    public static boolean isPermutation(String A, String B) {
      if (A.length() != B.length())
        return false;
      char[] array0 = A.toCharArray();
      char[] array1 = B.toCharArray();
      Arrays.sort(array0);
      Arrays.sort(array1);
      for (int i = 0; i < array0.length; i++)
        if (array0[i] != array1[i])
          return false;
      return true;
    }
  
  }
