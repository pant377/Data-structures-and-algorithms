package javaapplication1;

public  class DoubleLinkedList implements List
{
    private DoubleNode firstNode, lastNode ; 
    private int size ; 
    
    public DoubleLinkedList()
    {
        firstNode = lastNode = null ;
        size = 0 ; 
    }
    public DoubleNode getFirst()
    {
        return firstNode ;
    }
    public DoubleNode getLast()
    {
        return lastNode ;
    }
    @Override
    public boolean isEmpty()
    {
        return firstNode == null ; 
    }
    @Override
    public int size()
    {
        return size ; 
    }
    @Override
    public void insertFirst(Object newItem)
    {
        if(isEmpty())
        {
            firstNode = lastNode = new DoubleNode(newItem, null, null);
        }
        else
        {
            DoubleNode B = new DoubleNode(newItem, firstNode, null) ;
            firstNode.setPrevious(B);
            firstNode = B  ;
        }
        size ++ ;
    }

    
    @Override
    public Object removeFirst() throws ListEmptyException
    {
        Object removeItem ;
        if (isEmpty( ))
        {
            throw new ListEmptyException("Empty List!!!");
        }
        removeItem = firstNode.getItem( ) ;
        if(firstNode == lastNode)
        {
            firstNode = lastNode = null;
        }
        else 
        {
            DoubleNode B = firstNode.getNext( ) ;
            firstNode.setNext(null) ;
            B.setPrevious(null) ;
            firstNode = B ;
        }
        size -- ; 
        return removeItem ; 
    }
    
    @Override
    public Object removeLast() throws ListEmptyException
    {
        Object removeItem ;
        if (isEmpty( ))
        {
            throw new ListEmptyException("Empty List!!!");
        }
        removeItem = lastNode.getItem() ;
        if(firstNode == lastNode)
        {
            firstNode = lastNode = null ;
        }
        else
        {
            DoubleNode B = lastNode.getPrevious( );
            lastNode.setPrevious(null) ;
            B.setNext(null);
            lastNode = B;
        }
        size -- ; 
        return removeItem ; 
    }
    @Override
    public void insertLast(Object newItem)
    {
        if(isEmpty( ))
        {
            firstNode = lastNode = new DoubleNode(newItem, null, null);
        }
        else
        {
            DoubleNode B = new DoubleNode(newItem, null, lastNode) ;
            lastNode.setNext(B) ;
            lastNode = B ;
        }
        size ++ ; 
    }
    
    @Override
   public void insert(int position, Object data) throws NoSuchListPosition{
        if(position==0){insertFirst(data);} 
        if(position==size()){insertLast(data);}
        if((position<0) || (position>size())) {throw new NoSuchListPosition(" den uparxi tetia thesi ");}
        else{
            DoubleNode pr=firstNode;
            for(int i=0; i<position; i++)
                pr=pr.getNext();
            DoubleNode ep =pr.getNext();
            DoubleNode newNode = new DoubleNode(data,ep,pr);
            ep.setPrevious(newNode);
            pr.setNext(newNode);   
        } 
        size++;       
    }
    
    @Override
   public Object remove (int position) throws ListEmptyException, NoSuchListPosition{

      if((position<0) || (position>size())) {throw new NoSuchListPosition(" den uparxi tetia thesi ");}
      if(isEmpty()){throw new ListEmptyException("den uparxei ");}
      if(position==0){size--; return removeFirst();}
      else if(position==size()-1){
          size--;
          return removeLast();
      }
      else{
         DoubleNode delNode=firstNode;
         for(int i=0; i<position; i++)
             delNode=delNode.getNext();
         delNode.getPrevious().setNext(delNode.getNext());
         delNode.getNext().setPrevious(delNode.getPrevious());
         size--;
         return delNode.getItem();
      }
    }
}
