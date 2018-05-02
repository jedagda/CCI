class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewelHash = new HashSet<Character>();
		int counter = 0;
		if(J.length() == 0)
			return 0;
		for(int i = 0; i<J.length(); i++){
			jewelHash.add(J.charAt(i));
			
		}
		for(int k = 0; k<S.length(); k++){
			if(jewelHash.contains(S.charAt(k)))
				counter+=1;
		}
		return counter;	
    }
}
