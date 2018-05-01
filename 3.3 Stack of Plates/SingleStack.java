
public class SingleStack {
	private static final int MAX = 10;
	private int top;
	private int a[] = new int[MAX];
	private SingleStack next;

	public SingleStack getNext(){
		return next;
	}
	
	public boolean isEmpty() {
		return (top < 0);
	}

	public SingleStack() {
		top = -1;
	}

	public boolean overFlow() {
		if (top >= MAX) {
			System.out.println("Stack Overflow");
			return true;
		}
		return false;
	}

	public boolean underFlow() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return true;
		}
		return false;
	}

	public void push(int n) {
		if (overFlow())
			a[++top] = n;
	}

	public int pop() {
		if (underFlow()) 
			return 0;
		int n = a[top--];
		return n;
	}

	public int peek() {
		return top;
	}

}
