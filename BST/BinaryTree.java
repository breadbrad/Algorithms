import java.io.*;

public class BinaryTree<T> implements Serializable {
 	/** Three constructors */
 	public BinaryTree() {
 		root = null;
 	}

 	protected BinaryTree(Node<T> root) {
 		this.root = root;
 	}
 	// e.g. BinaryTree<Character> bt = new BinaryTree('*', lT, rT);
 	public BinaryTree(T data, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
 		root = new Node<T> (data);
 		if (leftTree != null) {
 			root.left = leftTree.root;
 		} else {
 			root.left = null;
 		}
 		if (rightTree != null) {
 			root.right = rightTree.root;
 		} else {
 			root.right = null;
 		}
 	}

 	public BinaryTree<T> getLeftSubtree() {
 		if (root != null && root.left != null) {
 			return new BinaryTree<T>(root.left);
 		} else {
 			return new BinaryTree<T> (null);
 		}
 	}

 	public BinaryTree<T> getRightSubtree() {
 		if (root != null && root.right != null) {
 			return new BinaryTree<T>(root.right);
 		} else {
 			return new BinaryTree<T> (null);
 		}
 	}

 	public boolean isLeaf() {
 		return root == null || (root.left == null && root.right == null);
 	}
}