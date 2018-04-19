public class sumLists{
  	public static void sumList(LinkedList A, LinkedList B){
		int [] arr = new int[A.size()];
		int [] arr2 = new int[B.size()];
		for(int i = 0; i < arr.length; i++){
			arr[i] = A.removeLast(A.item);
		}
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = B.removeLast(A.item);
		}
		String arr2String = arr.toString();
		String arr2String2 = arr2.toString();
		int value = Integer.parseInt(arr2String);
		int value2 = Integer.parseInt(arr2String2);
		int total = value+value2;
		
		
	}
	

}
