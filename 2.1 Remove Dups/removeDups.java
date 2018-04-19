public class removeDups{	
	public static void removeDuplicates(LinkedList A){
		HashSet<Node> set = new HashSet<Node>();
		LinkedList prev = null;
		while(A != null){
			if(set.contains(A.item))
				prev.next = A.next;
			else{
				set.add(A.item);
				prev = A;
			}
			A = A.next;
		}
	}
}
