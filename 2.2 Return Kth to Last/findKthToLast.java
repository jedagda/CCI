import java.util.LinkedList;

public class findKthToLast{
    
    	public static Object findKthToLast(LinkedList A, int k){
		if(k == 0 || k == 1)
			return A.getLast();
		return A.get(A.size()-k);
	}
}
