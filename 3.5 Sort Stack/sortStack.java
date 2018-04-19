public class sortStack{
  	public static Stack<Integer> inOrder(Stack<Integer> A) {
		Stack<Integer> B = new Stack<Integer>();
		while (!A.isEmpty()) {
			int temp = A.pop();
			while(!B.isEmpty() && B.peek() > temp)
				A.push(B.pop());
			B.push(temp);
			}
		while(!B.isEmpty())
			A.push(B.pop());
		return A;
	}

}
