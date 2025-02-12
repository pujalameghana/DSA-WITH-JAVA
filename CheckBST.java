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

public class CheckBST {
    
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

    public boolean isBST(Node root) {
        if (root == null) {
            return true; 
        }

        if (root.left != null && root.left.value >= root.value) {
            return false;
        }

        if (root.right != null && root.right.value <= root.value) {
            return false;
        }

        return isBST(root.left) && isBST(root.right);
    }
	

    public static void main(String[] args) {
        CheckBST bst = new CheckBST();
		List<Integer> inputList = List.of(8, 3, 10, 1, 6, 14, 4, 7, 13);
		Node root = null;
		for (int value : inputList) {
            root = bst.insert(root, value); 
        }
        
        System.out.println("The tree is " + (bst.isBST(root) ? "a BST." : "not a BST."));
    }
}
