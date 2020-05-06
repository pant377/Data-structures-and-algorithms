public class ArrayStack implements Stack
{
    private Object S[];
    private int index= -1;
    public ArrayStack(){
        this(100);
    }
    public ArrayStack(int cap)
    {
        S= new Object[cap];
    }
    public int size()
    {
        return S.length;
    }
    public boolean isEmpty()
    {
        return index==-1;
    }
    public boolean isFull()
    {
        return index==S.length-1;
    }
    public Object top() throws StackEmptyException
    {
        if (isEmpty())
            throw new StackEmptyException("Einai adeios");
        return S[index];
    }
    public void push(Object item) throws StackFullException
    {
        if (isFull())
            throw new StackFullException("gematos pinakas");
        S[++index]=item;
    }
    public Object pop() throws StackEmptyException
    {
        if (isEmpty())
            throw new StackEmptyException("gematos pinakas");
        Object element= S[index];
        S[index]=null;
        index--;
        return element;
    }
}
