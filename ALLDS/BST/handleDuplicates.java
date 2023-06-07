package ALLDS.BST;

class handleDuplicates {
    class Node {
        int data;
        int count;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.count = 1;
            left = right = null;
        }
    }

    Node root;

    handleDuplicates() {
        root = null;
    }

    handleDuplicates(int data) {
        root = new Node(data);
    }

    void insert(int data) {
        root = insertRec(root, data);
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
            if (root.count > 1) {
                root.count--;
                return root;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    int minValue(Node root) {
        int min = root.data;
        if (root.left != null) {
            min = root.data;
            root = root.left;
        }
        return min;
    }

    void inOrder() {
        inOrderRec(root);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        } else {
            root.count = root.count + 1;
            return root;
        }
        return root;
    }

    public void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + "(" + root.count + ") ");
            inOrderRec(root.right);
        }
    }

    public static void main(String[] args) {
        handleDuplicates bst = new handleDuplicates();
        bst.insert(12);
        bst.insert(10);
        bst.insert(20);
        bst.insert(9);
        bst.insert(11);
        bst.insert(10);
        bst.insert(12);
        bst.insert(12);
        bst.inOrder();
        System.out.println();

        bst.delete(20);
        bst.inOrder();
        System.out.println();

        bst.delete(12);
        bst.inOrder();
        System.out.println();

        bst.delete(9);
        bst.inOrder();
        System.out.println();

    }
}
