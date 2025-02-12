import java.util.*; // Import all utility classes, including Queue and LinkedList

// TreeNode class definition
class TreeNode {
    int data;
    TreeNode left, right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Main class
public class TreeBasicTerminologies {

    // Method to print children of each node
    static void printChildren(TreeNode root) {
        if (root == null) return;

        System.out.print("Children of node " + root.data + ": ");
        if (root.left != null) System.out.print(root.left.data + " ");
        if (root.right != null) System.out.print(root.right.data);
        System.out.println();

        // Recursive calls for left and right children
        printChildren(root.left);
        printChildren(root.right);
    }

    // Method to print all leaf nodes
    static void printLeafNodes(TreeNode root) {
        if (root == null) return;

        // A node is a leaf if it has no children
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }

        // Recursive calls for left and right children
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    // Method to print degree of each node
    static void printDegrees(TreeNode root) {
        if (root == null) return;

        // Calculate degree
        int degree = 0;
        if (root.left != null) degree++;
        if (root.right != null) degree++;

        System.out.println("Node " + root.data + " has degree: " + degree);

        // Recursive calls for left and right children
        printDegrees(root.left);
        printDegrees(root.right);
    }

    // Main method
    public static void main(String[] args) {
        // Input list representing a binary tree in level-order
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, null, 5);

        // Convert list to binary tree
        TreeNode root = convertListToBinaryTree(list);

        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        // Print children of each node
        System.out.println("Tree Children:");
        printChildren(root);

        // Print all leaf nodes
        System.out.println("\nLeaf Nodes:");
        printLeafNodes(root);
        System.out.println();

        // Print degree of each node
        System.out.println("\nDegrees of Nodes:");
        printDegrees(root);
    }

    // Method to convert a list into a binary tree (level-order representation)
    public static TreeNode convertListToBinaryTree(List<Integer> list) {
        if (list == null || list.isEmpty()) return null;

        // Create root node
        TreeNode root = new TreeNode(list.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < list.size()) {
            TreeNode current = queue.poll();

            // Create and add left child if present
            if (i < list.size() && list.get(i) != null) {
                current.left = new TreeNode(list.get(i));
                queue.add(current.left);
            }
            i++;

            // Create and add right child if present
            if (i < list.size() && list.get(i) != null) {
                current.right = new TreeNode(list.get(i));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }
}

