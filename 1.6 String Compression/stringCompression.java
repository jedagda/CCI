public class stringCompression{

      //Works except that is does not take into account the last character
      public static String strCompression(String A){
        char [] comp = new char[A.length()*2];
        int numIndex = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int length = A.length()-1;

        while(j < length){
          comp[i] = A.charAt(j);
          numIndex = i+1;
          System.out.print(j + " ");
          while(comp[i] == A.charAt(j) && j < length){
            count++;	
            j++;
          }
          comp[numIndex] = (char)(count+'0');
          i = i+2;
          count = 0;
        }
        String B =String.valueOf(comp);
        if(A.length() <= B.length())
          return B;
        return A;
      }
}      
 
