public class IntList
{
    private IntNode head;
    public IntList()
    {
        this.head=null;
    }
    public IntList(IntNode node)
    {
        this.head=node;
    }
    public boolean empty()
    {
        if(this.head==null)
            return true;
        else
            return false;
    }
    public IntNode nextElement(IntNode node)
    {
        return node.getNext();
    }
    public int getValueOfNode(IntNode node)
    {
        return node.getValue();
    }
    public void addToEnd(IntNode node)
    {
        if(empty())
            head=node;
        else
        {
            IntNode ptr=head;
            while(ptr.getNext()!=null)
                ptr=ptr.getNext();
            ptr.setNext(node);
        }
    }
    public void addToHead(IntNode node)
    {
        IntNode temp=head;
        head=node;
        node.setNext(temp);
    }
    public void remove(int num)
    {
        if(head!=null)
        {
            if(head.getValue()==num)
                head=head.getNext();
            else
            {
                IntNode behind = head;
                while (behind.getNext() != null)
                {
                    if(behind.getNext().getValue()==num)
                        behind.setNext(behind.getNext().getNext());
                    else
                        behind.setNext(behind.getNext().getNext());
                }
            }
        }
    }
}
