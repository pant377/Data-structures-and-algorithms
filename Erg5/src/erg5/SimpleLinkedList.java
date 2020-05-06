package erg5;



public class SimpleLinkedList implements List{
    
    private SLListNode firstNode;
    private SLListNode lastNode;
    
    public SimpleLinkedList(){
        firstNode=lastNode=null;
    }
    @Override
    public int size(){
        int size=0;
        //sos pos diapername mia lista
        for (SLListNode position=firstNode; position!=null;position=position.getNextNode()){
            size++;
        }
        return size;
    }
    public int size2(){
        int size=0;
        SLListNode position= firstNode;
        //sos pos diapername mia lista 
        while(position!=null){
            size++;
            position= position.getNextNode();
        }
        return size;
    }
    @Override
    public boolean isEmpty(){
        return (firstNode==null);
    }
    @Override
    public void insertFirst(Object newItem){
        if (isEmpty()){
           // System.out.println(newItem);
            firstNode=new SLListNode(newItem, null);
            lastNode=firstNode;
        }
        else{
            SLListNode temp = new SLListNode(newItem, firstNode);
            firstNode= temp;
        }
    }
    @Override
    public void insertLast(Object newItem){
        if (isEmpty()){
            firstNode=new SLListNode(newItem, null);
            lastNode=firstNode;
        }
        else{ 
            SLListNode new_node= new SLListNode(newItem, null);
            lastNode.setNextNode(new_node);
        }
    }
    @Override
    public Object removeFirst() throws ListEmptyException{
        Object removeItem;
        if (isEmpty())
            throw new ListEmptyException("Adeia lista");
        removeItem= firstNode.getNodeData();
        if (firstNode==lastNode)
            firstNode= lastNode= null;
        else
            firstNode= firstNode.getNextNode();
        return removeItem;
    }
    @Override
    public Object removeLast()throws ListEmptyException{
        Object removeItem;
        if (isEmpty())
            throw new ListEmptyException("Adeia lista");
        removeItem= lastNode.getNodeData();
        if (firstNode==lastNode)
            firstNode=lastNode=null;
        else {
            SLListNode current= firstNode;
            while (current.getNextNode()!=lastNode)
                current= current.getNextNode();
            lastNode= current;
            lastNode.setNextNode(null);
        }
        return removeItem;
    }
    public  void printList(){
        if (isEmpty())
            System.out.println("Empty List");
        else{
            SLListNode current= firstNode;
            while(current!=null){
                System.out.println(current.getNodeData());
                current= current.getNextNode();
            }
            System.out.println("\n");
        }
    }
}
