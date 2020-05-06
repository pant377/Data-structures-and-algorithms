
package erg7;

public class TreeNode {
    
    private TreeNode left;
    private int item;
    private TreeNode right;
    
    
    public TreeNode(int d){
        item = d;
        left=right=null;
        
    }
    
    public int getNodeData(){
        return item;
        
    }
    
    public TreeNode getLeftNode(){
        return left;
    }
    
    public TreeNode TreeNode(){
        return right;
    }
    
    public boolean isLeaf(){
        return((left==null) && (right==null));
    }
    
    public void setLeftNode(TreeNode node){
        left=node;
    }
    
    public void setRightNode(TreeNode node){
        right=node;
    }
    
    public void setNodeData(int d){
        item=d;
    }
}
