
package erg7;

public class BSTree {
    
    private TreeNode root;
    
    
    public BSTree(){
        root=null;
    }
    public boolean isEampty(){
        return(root==null);
    }
    public void insertElement(int data){
        if(isEampty())
            root=new TreeNode(data);
        else
            insertNode(data,root);
    }
    public void inOderTraveral(){
        System.out.println("INORDER TRAVERSAL");
        inOrder(root);
        System.out.println();
    }
     public void preOrderTraversal(){
        System.out.println("PREORDER TRAVERSA");
        preOrder(root);
        System.out.println();
    }
    public void postOrderTraversal(){
        System.out.println("POSTORDER TRAVERSA");
        postOrder(root);
        System.out.println();
    }
    
//    private void insertNode(int d){
//        if(d<item)
//    }
//      
    
}
