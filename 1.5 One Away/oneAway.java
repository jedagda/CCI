public class oneAway{

    public static boolean oneAway (String A, String B){

      int count=0;
      HashSet<Character> wordA = new  HashSet <Character>();
      for(int i = 0; i<A.length(); i++){
        wordA.add(A.charAt(i));
        count++;
      }
      for(int i = 0; i<B.length(); i++){
        if(wordA.contains(B.charAt(i)))
          count--;
      }
      System.out.println(count);
      if(count > 1 || count < -1)
        return false;
      return true;	
    }
}
