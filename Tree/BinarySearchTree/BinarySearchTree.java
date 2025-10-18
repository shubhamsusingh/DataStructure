package Tree.BinarySearchTree;

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
        while (true) {
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

    }

    public boolean contains(int target) {
        if (root == null) {
            return false;
        }
        Node temp = root;
        while (temp != null) {
            if (temp.val > target) {
                temp = temp.left;
            } else if (temp.val < target) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(10);
        tree.insert(5);
        System.out.println(tree.root.val);
        System.out.println(tree.contains(0));
    }
}
