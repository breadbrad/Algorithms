/** private -> only be accessed within the declared class itself
	protected -> can be accessed by the subclasses in other package */



public static class Node<T> implements Serializable {
	protected T data;

	protected Node<T> left;

	protected Node<T> right;

	public Node(T data){
		this.data = data;
		left = null;
		right = null;
	}

	public String toString() {
		return data.toString();
	}
}