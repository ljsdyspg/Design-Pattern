package composite;

public class Tree {

    TreeNode root = null;

    public Tree(String name){
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");

        tree.root.add(nodeB);
        tree.root.add(nodeC);
        nodeC.add(nodeD);

        System.out.println("\nFinished\n");

        tree.root.print();
        nodeC.print();
    }
}
