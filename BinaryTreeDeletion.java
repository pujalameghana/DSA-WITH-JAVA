import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    
    public void deleteNode(Node root, int key) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node nodeToDelete = null;
        Node deepestNode = null;

        while (!queue.isEmpty()) {
            deepestNode = queue.poll();

            if (deepestNode.data == key) {
                nodeToDelete = deepestNode;
            }

            if (deepestNode.left != null) {
                queue.add(deepestNode.left);
            }
            if (deepestNode.right != null) {
                queue.add(deepestNode.right);
            }
        }

        if (nodeToDelete != null) {
            nodeToDelete.data = deepestNode.data;
        }

        deleteDeepestNode(root, deepestNode);
    }

    public void deleteDeepestNode(Node root, Node deepestNode) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        Node temp = null;
        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.left == deepestNode) {
                temp.left = null;
                return;
            } else if (temp.right == deepestNode) {
                temp.right = null;
                return;
            }

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
    }

    public void levelOrder(Node root) {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
}

public class BinaryTreeDeletion {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.right = new Node(40);
        
        System.out.println("Original Tree (Level Order):");
        tree.levelOrder(root);
        System.out.println();
        
        tree.deleteNode(root, 20);
        
        System.out.println("Tree after deleting 20 (Level Order):");
        tree.levelOrder(root);
    }
}
