package MusicTrends;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArtistTest
{
    private Artist bert;
    public void setUp() {
        Artist bert = new Artist("Nate");
    }
    @Test
    public void testGetName() {
        Artist bert = new Artist("Nate");
        assertEquals("Nate", bert.getName());
    }
    @Test
    public void testGetNameNothing() {
        Artist bert = new Artist(null);
        assertNull(bert.getName());
    }
    @Test
    public void testToString() {
        Artist bert = new Artist("Nate");
        assertEquals("Nate", bert.toString());
    }
    @Test
    public void testToStringNothing() {
        Artist bert = new Artist(null);
        assertNull(bert.toString());
    }

    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

}
