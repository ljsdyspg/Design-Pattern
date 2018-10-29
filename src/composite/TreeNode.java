package composite;

import java.util.*;

public class TreeNode {

    private String name;
    private TreeNode parent;
    private List<TreeNode> children = new ArrayList<TreeNode>();

    public TreeNode(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(TreeNode parent){
        this.parent = parent;
    }

    public void add(TreeNode node){
        children.add(node);
        System.out.println("add "+node.getName()+" successfully!");
    }

    public void remove(TreeNode node){
        children.remove(node);
    }

    @Override
    public String toString() {
        return "Node: "+this.name;
    }

    public void print(){
        for (TreeNode treeNode : this.children){
            System.out.print(treeNode.toString()+"\t");
        }
        System.out.println();
    }
}
