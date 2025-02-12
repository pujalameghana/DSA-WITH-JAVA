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

public class BinaryTree {
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

    public boolean Search(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.value == target) {
            return true;
        }
        if (target < root.value) {
            return Search(root.left, target);
        } else {
            return Search(root.right, target);
        }
    }

    public static void main(String args[]) {
        BinaryTree bst = new BinaryTree();
        List<Integer> inputList = List.of(8, 3, 10, 1, 6, 14, 4, 7, 13);
        Node root = null;

        for (int value : inputList) {
            root = bst.insert(root, value);
        }

        int target = 6;
        boolean found = bst.Search(root, target);
        System.out.println(target + " found: " + found);
    }
}
