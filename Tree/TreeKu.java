package Tree;

// Node class
class Node {
    int data;
    Node left, right;

    // Constructor to create a new node
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// BinaryTree class
class BinaryTree {
    Node root;

    // Constructor to initialize the root as null
    BinaryTree() {
        root = null;
    }

    // In-order traversal (Left, Root, Right)
    void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Pre-order traversal (Root, Left, Right)
    void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    // Post-order traversal (Left, Right, Root)
    void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Method to insert a node into the binary tree
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Driver method to test the BinaryTree
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Insert nodes */
        int[] nodes = {10, 5, 15, 2, 7, 12, 17, 20};
        for (int node : nodes) {
            tree.root = tree.insert(tree.root, node);
        }

        // Perform in-order traversal
        System.out.print("In-order traversal: "); // setelah dibuat tree ngurutin dari paling kecil ke yang paling besar
        tree.inorderTraversal(tree.root);
        System.out.println();

        // Perform pre-order traversal
        System.out.print("Pre-order traversal: "); // membuat tree dari root, ke anak, ke cucu yang paling kiri dulu baru lanjut ke anak, ke cucu yang kanan
        tree.preorderTraversal(tree.root);
        System.out.println();

        // Perform post-order traversal
        System.out.print("Post-order traversal: "); // membaca dari cucu paling kiri ke anak paling kiri, terus dari cucu paling kanan ke anak paling kanan, lanjut ke ortu
        tree.postorderTraversal(tree.root);
    }
}

