package ALLDS.BST;

class boundaryTraversal {
    class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    boundaryTraversal() {
        root = null;
    }

    boundaryTraversal(int data) {
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

    public void printBoundary() {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printLeftElements(root.left);
        printLeafElements(root.left);
        printLeafElements(root.right);
        printRightElements(root.right);
    }

    public void printLeafElements(Node root) {
        if (root == null) {
            return;
        }
        printLeafElements(root.left);
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        printLeafElements(root.right);
    }

    public void printRightElements(Node root) {
        if (root == null) {
            return;
        }
        if (root.right != null) {
            printLeftElements(root.right);
        } else {
            printLeftElements(root.left);
        }
        if (root.left != null || root.right != null) {
            System.out.print(root.data + " ");
        }
    }

    public void printLeftElements(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null || root.right != null) {
            System.out.print(root.data + " ");
        }
        if (root.left != null) {
            printLeftElements(root.left);
        } else {
            printLeftElements(root.right);
        }
    }

    public static void main(String[] args) {
        boundaryTraversal bt = new boundaryTraversal();
        bt.insert(20);
        bt.insert(8);
        bt.insert(4);
        bt.insert(12);
        bt.insert(10);
        bt.insert(14);
        bt.insert(22);
        bt.insert(25);
        bt.insert(21);
        bt.printBoundary();
    }
}
