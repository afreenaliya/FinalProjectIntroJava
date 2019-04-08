public class BinaryTree{
	public static void main(String[] args) {
		Node root = new Node(5);
		Node leftNode = new Node(4);
		Node rightNode = new Node(7);
		root.left = leftNode;
		root.right = rightNode;
		
		System.out.println(root.value);
		System.out.println(root.left.value);
		System.out.println(root.right.value);
		
	}
}
