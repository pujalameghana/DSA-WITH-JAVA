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

public class SecondLargestBST {
    
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

    public Node SecondLargest(Node root) {
        if (root == null || (root.left == null && root.right == null)) {
            System.out.println("The tree is empty or has only one node.");
            return null;
        }

        Node parent = null;
        Node current = root;

        while (current.right != null) {
            parent = current;
            current = current.right;
        }

        if (current.left != null) {
            return findLargest(current.left);
        }

        return parent;
    }

    private Node findLargest(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }
	

    public static void main(String[] args) {
        SecondLargestBST bst = new SecondLargestBST();
		List<Integer> inputList = List.of(8, 3, 10, 40, 6, 14, 4, 7, 13);
		Node root = null;
		for (int value : inputList) {
            root = bst.insert(root, value); 
        }
        
        Node secondLargest = bst.SecondLargest(root);
        if (secondLargest != null) {
            System.out.println("The second largest element is: " + secondLargest.value);
        }
    }
}
