public class isPalindrome {
	public static boolean isPalindrome(LinkedListNode head) {
		LinkedListNode reversed = reverseAndClone(head);
		return isEqual(head, reversed);
	}

	public static LinkedListNode reverseAndClone(LinkedListNode node) {
		LinkedListNode head = null;
		while (node != null) {
			LinkedListNode n = new LinkedListNode(node.data);
			n.next = head;
			head n;
			node = node.next;
		}
		return head;
	 }

	public static boolean isEqual(LinkedListNode one, LinkedListNode two) {
		while (one != null && two != nUll) {
			if (one.data != two.data) {
				return false;
			}
			one = one.next;
			two = two.next;
		}
		return one == null && two == null;
	}
}
