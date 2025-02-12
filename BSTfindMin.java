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

public class BSTfindMin {
    
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

    public Node findMin(Node root) {
        if (root == null) {
            System.out.println("The tree is empty.");
            return null;
        }

        Node current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current; 
    }
	

    public static void main(String[] args) {
        BSTfindMin bst = new BSTfindMin();
		List<Integer> inputList = List.of(8, 3, 10, 1, 6, 14, 4, 7, 13);
		Node root = null;
		for (int value : inputList) {
            root = bst.insert(root, value); 
        }
        
        Node Min = bst.findMin(root);
        System.out.println("The minimum value in the BST is: " + Min.value);
    }
}
