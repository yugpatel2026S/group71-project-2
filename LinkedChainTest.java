package MusicTrends;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *  Test the LinkedChain class.
 *  Test the methods of LinkedChain class using different test cases.
 * 
 *  @author yugpatel
 *  @version Oct 12, 2026
 */
public class LinkedChainTest
{
    //~ Fields ................................................................
    private LinkedChain<String> linkedChain;
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................
    /**
     * Sets up the test.
     */
    @BeforeEach
    public void setUp()
    {
        linkedChain = new LinkedChain<String>();
    }
    
    /**
     * Tests the add method.
     */
    @Test
    public void testAdd()
    {
        linkedChain.add("First");
        linkedChain.add("Second");
        assertEquals(2, linkedChain.size());
        assertEquals("Second", linkedChain.get(0));
        assertEquals("First", linkedChain.get(1));
    }
    
    /**
     * Tests the addToEnd method.
     */
    @Test
    public void testAddToEnd()
    {
        linkedChain.addToEnd("First");
        linkedChain.addToEnd("Second");
        assertEquals(2, linkedChain.size());
        assertEquals("First", linkedChain.get(0));
        assertEquals("Second", linkedChain.get(1));
    }
    
    /**
     * Tests the remove method.
     */
    @Test
    public void testRemove()
    {
        linkedChain.add("First");
        linkedChain.add("Second");
        assertEquals("Second", linkedChain.remove());
        assertEquals(1, linkedChain.size());
    }
    
    /**
     * Tests the remove method with entry as parameter.
     */
    @Test
    public void testRemoveEntry()
    {
        linkedChain.add("First");
        linkedChain.add("Second");
        assertEquals(true, linkedChain.remove("Second"));
        assertEquals(false, linkedChain.contains("Second"));
        assertEquals(1, linkedChain.size());
        assertEquals(false, linkedChain.contains("Second"));
    }
    
    /**
     * Tests the clear method.
     */
    @Test
    public void testClear()
    {
        linkedChain.add("First");
        linkedChain.add("Second");
        linkedChain.clear();
        assertEquals(true, linkedChain.isEmpty());
        assertEquals(0, linkedChain.size());
    }
}