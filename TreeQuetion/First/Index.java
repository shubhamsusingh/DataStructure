// package TreeQuetion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Index {
    Node root;

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insert(int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (temp != null) {
            if (temp.val == val) {
                return false;
            }
            if (newNode.val > temp.val) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            } else {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
        }
        return false;
    }

    public ArrayList<Integer> BFS(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.remove();
            result.add(root.val);
            if (root.left != null) {
                queue.add(root.left);
            }
            if (root.right != null) {
                queue.add(root.right);
            }
        }
        return result;
    }

    public boolean checkUniValue(Node Root) {
        if (root == null) {
            return false;
        }
        if (root.left != null) {
            if (root.val != root.left.val) {
                return false;
            }
            if (!checkUniValue(root.left)) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.val != root.right.val) {
                return false;
            }
            if (!checkUniValue(root.right)) {
                return false;
            }
        }
        return true;
    }
}