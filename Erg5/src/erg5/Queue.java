
package erg5;

public interface Queue{
    
    public int size()  ; 
    public boolean isEmpty() ;
    public boolean isFull() ; 
    public Object front() throws QueueEmptyException;
    public void add(Object item) throws QueueFullException;
    public Object Remove() throws QueueEmptyException;
    
}
