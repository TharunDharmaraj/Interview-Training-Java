package ALLDS.BST;

public class leafNodes {
    class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public leafNodes(){
        root = null;
    }

    public leafNodes(int data){
        root = new Node(data);
    }

    public void insert(int data){
        root = insertRec(root,data);
    }

    public Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data < root.data){
            root.left = insertRec(root.left,data);
        }else if(data > root.data){
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void delete(int data){
        root = deleteRec(root,data);
    }

    public Node deleteRec(Node root, int data){
        if(root == null){
            return root;
        }
        if(data < root.data){
            root.left = deleteRec(root.left, data);
        }else if(data > root.data){
            root.right = deleteRec(root.right, data);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            int key = findMaxRST(root);
            root.right = deleteRec(root.right, key);
        }
        return root;
    }

    public int findMaxRST(Node root){
        int max = root.data;
        if(root.left != null){
            max=root.data;
            root = root.left;
        }
        return max;
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

    void getLeafNodes(){
        getLeafNodesRec(root);
    }

    void getLeafNodesRec(Node root){
        if (root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.print(root.data + " ");
            return;
        }
        if(root.left != null){
            getLeafNodesRec(root.left);
        }
        if(root.right != null){
            getLeafNodesRec(root.right);
        }
    }
    
    public static void main(String[] args) {
        leafNodes tree = new leafNodes();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(90);

        System.out.println("Inorder traversal of the given tree");
        tree.inOrder();
        System.out.println("Leaf Nodes of the given tree");
        tree.getLeafNodes();
    }
}


// import java.util.*;

// public class GFG {

//     static class Node {
//         int data;
//         Node left, right;

//         Node(int item) {
//             data = item;
//             left = right = null;
//         }
//     }

//     static void printleafNodes(Node root) {
//         if (root == null)
//             return;
//         Stack<Node> st = new Stack<>();
//         st.push(root);

//         while (!st.isEmpty()) {
//             root = st.peek();
//             st.pop();

//             if (root.left == null && root.right == null)
//                 System.out.print(root.data + " ");

//             if (root.right != null)
//                 st.push(root.right);
//             if (root.left != null)
//                 st.push(root.left);
//         }
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.right.left = new Node(5);
//         root.right.right = new Node(8);
//         root.right.left.left = new Node(6);
//         root.right.left.right = new Node(7);
//         root.right.right.left = new Node(9);
//         root.right.right.right = new Node(10);
//         printleafNodes(root);
//     }
// }
