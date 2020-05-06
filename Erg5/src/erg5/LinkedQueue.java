package erg5;


public class LinkedQueue implements Queue{
    
    private SimpleLinkedList Q;
    
    public LinkedQueue(){
        Q=new SimpleLinkedList();
    }
    @Override
    public int size(){
        return Q.size();
    }
    @Override
    public boolean isEmpty(){
        return Q.isEmpty();
    }
    @Override
     public boolean isFull(){
        return Q.isEmpty();
    }
    @Override
    public Object front()throws QueueEmptyException{
        Object temp;
        if(Q.isEmpty())throw new QueueEmptyException("Empty queue");
        temp=Q.removeFirst();
        Q.insertFirst(temp);
        return temp;
    }
    @Override
    public void add(Object item){
        Q.insertLast(item);
    }

    @Override
    public Object Remove()throws QueueEmptyException{
        
        try{
            return Q.removeFirst();
        }
        catch(ListEmptyException str){
            throw new QueueEmptyException("Empty Queue");
        }
        
    }
    public void printlist(){
        Q.printList();
    }
       
}
