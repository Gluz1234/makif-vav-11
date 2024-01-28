public class IntNode {
    private int value;
    private IntNode next;
    public IntNode(int val)
    {
        this.value=val;
        this.next=null;
    }
    public IntNode(int val,IntNode next)
    {
        this.value=val;
        this.next=next;
    }
    public int getValue() {
        return this.value; }
    public void setValue(int v) {
        this.value=v;
    }
    public IntNode getNext()
    {
        return this.next;
    }
    public void setNext(IntNode node)
    {
        this.next=node;
    }
}

