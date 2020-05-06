package erg5;

public class SLListNode {
    Object data;
    SLListNode nextNode;
    public SLListNode(){
        this(null,null);
    }
    public SLListNode(Object data, SLListNode nextNode){
        this.data=data;
        this.nextNode= nextNode;
    }
    public Object getNodeData(){
        return data;
    }
    public SLListNode getNextNode(){
        return nextNode;
    }
    public void setNodeData(Object data){
        this.data= data;
    }
    public void setNextNode(SLListNode nextNode){
        this.nextNode=nextNode;
    }
    @Override
    public String toString(){
        return data.toString();
    }
}
