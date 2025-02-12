import java.util.List;
class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class InsertionBST {
    
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
		if (value < root.value) {
            root.left = insert(root.left, value); 
        } else if (value > root.value) {
            root.right = insert(root.right, value); 
        }
		return root; 
    }

    public void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }
	

    public static void main(String[] args) {
        InsertionBST bst = new InsertionBST();
		List<Integer> inputList = List.of(8, 3, 10, 1, 6, 14, 4, 7, 13);
		Node root = null;
		for (int value : inputList) {
            root = bst.insert(root, value); 
        }
		int insertVal = 11;
		bst.insert(root, insertVal);
        
        System.out.print("In-order Traversal of BST: ");
        bst.inOrderTraversal(root);
    }
}
