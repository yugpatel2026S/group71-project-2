package MusicTrends;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// -------------------------------------------------------------------------
/**
 *  Test the Node class.
 *  Test the methods of Node using different test cases.
 * 
 *  @author yugpatel
 *  @version Oct 12, 2026
 */
public class NodeTest
{
    //~ Fields ................................................................
    private Node<String> node1;
    private Node<String> node2;
    
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................
    /**
     * Sets up the test case.
     */
    @BeforeEach
    public void setUp()
    {
        node2 = new Node<String>("Second");
        node1 = new Node<String>("First", node2);
    }
    
    /**
     * Tests the getData method.
     */
    @Test
    public void testGetData()
    {
        assertEquals("First", node1.getData());
    }
    
    /**
     * Tests the getNext method.
     */
    @Test
    public void testGetNext()
    {
        assertEquals(node2, node1.getNext());
        assertEquals(null, node2.getNext());
    }
    
    /**
     * Tests the setNext method.
     */
    @Test
    public void testSetNext()
    {
        node2.setNext(node1);
        assertEquals(node1, node2.getNext());
    }
}
