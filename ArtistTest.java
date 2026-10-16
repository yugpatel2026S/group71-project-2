package MusicTrends;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// -------------------------------------------------------------------------
/**
 *  Test class for Artist
 * 
 *  @author gphun
 *  @version Oct 16, 2026
 */
public class ArtistTest
{
    private Artist bert;
    // ----------------------------------------------------------
    /**
     * setUp method
     */
    public void setUp() {
        Artist bert = new Artist("Nate");
    }
    // ----------------------------------------------------------
    /**
     * Test getName method
     */
    @Test
    public void testGetName() {
        Artist bert = new Artist("Nate");
        assertEquals("Nate", bert.getName());
    }
    // ----------------------------------------------------------
    /**
     * Tests getName method
     */
    @Test
    public void testGetNameNothing() {
        Artist bert = new Artist(null);
        assertNull(bert.getName());
    }
    // ----------------------------------------------------------
    /**
     * Tests toString method
     */
    @Test
    public void testToString() {
        Artist bert = new Artist("Nate");
        assertEquals("Nate", bert.toString());
    }
    // ----------------------------------------------------------
    /**
     * Tests toString method
     */
    @Test
    public void testToStringNothing() {
        Artist bert = new Artist(null);
        assertNull(bert.toString());
    }

    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

}
