package ALLDS.BST;

class bstInsertDel {
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    bstInsertDel() {
        root = null;
    }

    bstInsertDel(int data) {
        root = new Node(data);
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        } else if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void delete(int data) {
        root = deleteRec(root, data);
    }

    public Node deleteRec(Node root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = numRightSubTree(root);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    public int numRightSubTree(Node root) {
        int min = root.data;
        while (root.left != null) {
            min = root.data;
            root = root.left;
        }
        return min;
    }

    void inOrder() {
        inOrderRec(root);
    }

    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public static void main(String[] args) {
        bstInsertDel tree = new bstInsertDel();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.inOrder();

        System.out.println("\nDelete 20");
        tree.delete(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inOrder();

        System.out.println("\nDelete 30");
        tree.delete(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inOrder();

        System.out.println("\nDelete 50");
        tree.delete(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inOrder();
    }
}
