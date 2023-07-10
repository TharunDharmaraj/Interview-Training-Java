// Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
package ALLDS.BST;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class minDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null)
            return minDepth(root.right) + 1;

        if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.right), minDepth(root.left)) + 1;
    }

    static int minDepthQueue(Node root) {
        // Corner Case
        if (root == null)
            return 0;

        // Create an empty queue for level order traversal
        Queue<qItem> q = new LinkedList<>();

        // Enqueue Root and initialize depth as 1
        qItem qi = new qItem(root, 1);
        q.add(qi);

        // Do level order traversal
        while (q.isEmpty() == false) {
            // Remove the front queue item
            qi = q.peek();
            q.remove();

            // Get details of the remove item
            Node node = qi.node;
            int depth = qi.depth;

            // If this is the first leaf node seen so far
            // Then return its depth as answer
            if (node.left == null && node.right == null)
                return depth;

            // If left subtree is not null,
            // add it to queue
            if (node.left != null) {
                qi.node = node.left;
                qi.depth = depth + 1;
                q.add(qi);
            }

            // If right subtree is not null,
            // add it to queue
            if (node.right != null) {
                qi.node = node.right;
                qi.depth = depth + 1;
                q.add(qi);
            }
        }
        return 0;
    }
}
