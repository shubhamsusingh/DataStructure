package TreeCreation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root;

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
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
            if (temp.val == newNode.val) {
                return false;
            }
            if (newNode.val < temp.val) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
        return false;
    }

    public boolean contains(int val) {
        if (root == null) {
            return false;
        }
        Node temp = root;
        while (temp != null) {
            if (temp.val == val) {
                return true;
            }
            if (val < temp.val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }

        }
        return false;
    }

    public ArrayList<Integer> BFS() {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        Node temp = root;
        queue.add(temp);
        while (queue.size() > 0) {
            temp = queue.remove();
            list.add(temp.val);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        return list;
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> list = new ArrayList<>();
        class Traverse {
            Traverse(Node currentNode) {
                list.add(currentNode.val);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return list;
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> result = new ArrayList<>();
        class Traverse {
            Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                result.add(currentNode.val);

            }
        }
        new Traverse(root);
        return result;
    }
}
