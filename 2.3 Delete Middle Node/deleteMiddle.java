import java.util.LinkedList;

public class deleteMiddle{

	public static void deleteMiddle(LinkedList A){
		if(A.size() > 2)
			A.remove(A.size()/2);
	}
  
}
