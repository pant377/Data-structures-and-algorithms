
package erg5;


public class LinkedStack implements Stack{
    
    private SimpleLinkedList S ;

    public LinkedStack(SimpleLinkedList S) {
        this.S = S;
    }

    
        
    public LinkedStack() {
        S=new SimpleLinkedList();
    }
    @Override
    public int size(){
        return S.size();
    }
    @Override
    public boolean isEmpty(){
        return S.isEmpty();
    }
    @Override
    public boolean isFull(){
        return S.isEmpty();
    }
    @Override
    public Object top()throws StackEmptyException{
        Object temp;
        if(S.isEmpty())throw new StackEmptyException("Empty stack");
        temp=S.removeFirst();
        S.insertFirst(temp);
        return temp;
    }

    
    @Override
    public void push(Object item)throws StackFullException{
        S.insertFirst(item);
    }
    @Override
    public Object pop()throws StackEmptyException{
        try{
            return S.removeFirst();
        }
        catch(StackEmptyException str){
            throw new StackEmptyException("Empty Stack");
        }
    }
}
