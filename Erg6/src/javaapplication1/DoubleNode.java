package javaapplication1;

public class DoubleNode
{
    private Object item ; 
    private DoubleNode next ; 
    private DoubleNode previous ; 
    
    
    public DoubleNode() 
    {
        this(null, null, null) ;
    }
    public DoubleNode(Object data, DoubleNode n, DoubleNode p)
    {
        item = data ; 
        next = n ; 
        previous = p ; 
        
    }
    public Object getItem()
    {
        return item ; 
    }
    public DoubleNode getNext()
    {
        return next ; 
    }
    public DoubleNode getPrevious()
    {
        return previous ; 
    }
    public void setItem(Object newItem)
    { 
        item = newItem ;
    }
    public void setNext(DoubleNode newNext)
    {
        next = newNext ;
    }
    public void setPrevious(DoubleNode newPrevious)
    {  
        previous = newPrevious ;
    } 
}
