package TreeCreation;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(4);
        bst.insert(10);
        System.out.println(bst.root.left.val);
        System.out.println(bst.insert(12));
        System.out.println(bst.root.right.val);
        System.out.println(bst.contains(4));
        System.out.println(bst.BFS());
        bst.insert(5);
        System.out.println(bst.DFS());
    }
}
