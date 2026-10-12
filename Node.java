package MusicTrends;

// -------------------------------------------------------------------------
/**
 *  A node in the chain. Holds an entry and link to the next node.
 *  Creates different methods for node that can be used by the LinkedChain class.
 *  @param <T> the type of entry stored in the node
 * 
 *  @author yugpatel
 *  @version Oct 11, 2026
 */
public class Node<T>
{
    //~ Fields ................................................................
    private T data;
    private Node<T> next;
    
    //~ Constructors ..........................................................
    /**
     * Create a new Node object with data and no next.
     * @param data the entry to store
     */
    public Node(T data)
    {
        this.data = data;
        this.next = null;
    }
    
    /**
     * Create a new Node object with data and next.
     * @param data the entry to store
     * @param next the link to next entry
     */
    public Node(T data, Node<T> next)
    {
        this.data = data;
        this.next = next;
    }
    
    //~Public  Methods ........................................................
    /**
     * Getter method for data.
     * @return data data of the node
     */
    public T getData()
    {
        return data;
    }
    
    /**
     * Getter method for next.
     * @return next link to next node
     */
    public Node<T> getNext()
    {
        return next;
    }
    
    /**
     * Setter method for next.
     * @param newNext the next node
     */
    public void setNext(Node<T> newNext)
    {
        next = newNext;
    }
}
