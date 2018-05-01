import java.util.Random;

public class SetOfStacks {
	private SingleStack head;
	private int numSet;
	
	/**
	 * Constructor with no arguments
	 */
	public SetOfStacks(){
		head = null;
	}
	
	/**
	 * Checks to see if there is no stack
	 * @return true if the head is null
	 */
	public boolean isEmpty(){
		return head == null;
	}
	
	/**
	 * Pushes a new value into the head of the stack
	 * If the stack has over flowed, then this method creates a new stack and indicates 
	 * the new stack as the head of the linked list.
	 * and stores the value in the new stack.
	 * @param int value that is to be stored at the top of the stack
	 */
	public void push (int n){
		if(head.overFlow()){
			SingleStack newStack = new SingleStack();
			head = newStack;
			head.push(n);
			System.out.println("New Stack built");
		}
		head.push(n);
	}
	
	/**
	 * Pops value of the head of the stack
	 * If the stack has under flow, then this method travels to the next stack
	 * and sets the next stack as the head of the list
	 * and pops the value of the head.
	 * @return the int popped from the top of the stack
	 */
	public int pop(){
		if(!head.underFlow())
			return head.pop();
		head = head.getNext();
		return head.pop();	
	}
	
	/**
	 * Peeks at the top value of the stack in the head
	 * @return the int from the top of the stack
	 */
	public int peek(){
		return head.peek();
	}
	
	public static void main(String[] args) {
		SetOfStacks S = new SetOfStacks();
		Random random = new Random();
		for(int i = 0; i<100; i++ ){
			int n = random.nextInt(1000);
			S.push(n);
		}
		

	}
	
}
