public class LinkedListRec <T> {
	private Node <T> head;

	private int size (Node <T> head) {
		if (head == null)
			return 0;
		else 
			return 1 + size(head.next);
	}
	// Wrapper method 
	public int size() {
		return size(head);
	}


	private String toString(Node <T> head) {
		if (head == null)
			return "";
		else 
			return head.data + "\n" + toString(head.next);
	}
	// Wrapper method 
	public String toString() {
		return toString(head);
	}

	private void replace(Node <T> head, T newObj, T oldObj){
		if (head != null){
			if (oldObj.equals(head.data)){
				head.data = newObj;
			replace(head.next, newObj, oldObj);
			}
		}
	}

	public void replace (T newObj, T oldObj) {
		replace (head, newObj, oldObj);
	}

	private void add(Node <T> head, T data) {
		if (head == null)
			head.next = new Node <E> (data);
		else 
			add (head.next, data);
	}

	public void add (T data) {
		return add(head, data);
	}

	private boolean remove(Node <T> head, Node <T> pred, T target) {
		if (head == null)
			return false;
		else if (head.data.equals(target)){
			pred.next = head.next;
			return true;
		}
		else 
			return remove(head.next, head, target);
	}

	public boolean remove(T target){
		if (head == null)
			return false;
		else if (head.data.equals(target)) {
			head = head.next;
			return true;
		}
		else 
			return remove(head.next, head, target);
	}

}

