public class URLify {

    public static void URLify(char[] A) {
      int trueLength = 0;
      int spaceCount = 0;
      for (int i = A.length - 1; i >= 1; i--) {
        if (A[i - 1] == ' ' && A[i] != ' ')
          spaceCount += 1;
        if (A[i - 1] != ' ' || A[i] != ' ')
          trueLength++;
      }
      trueLength += spaceCount * 2;
      char[] url = new char[trueLength];
      int index = trueLength;
      for(int i = trueLength; i >=0 ; i--){
        if (A[i + 1] == ' ' && A[i] != ' '){
          url[index] = '0';
          index--;
          url[index] = '2';
          index--;
          url[index] = '%';
          index--;
        }
        if (A[i + 1] != ' ' || A[i] != ' ') {
          url[index] = A[i];
          index--;
        }
      }
      printCharArr(url);
    }
}
