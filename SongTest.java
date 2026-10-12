package MusicTrends;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *  Test the Song class.
 *  Test the methods of Song class using different test cases.
 * 
 *  @author yugpatel
 *  @version Oct 12, 2026
 */
public class SongTest
{
    //~ Fields ................................................................
    private Song song;
    private Artist artist;
    
    //~ Constructors ..........................................................

    //~Public  Methods ........................................................
    /**
     * Sets up the test case.
     */
    @BeforeEach
    public void setUp()
    {
        artist = new Artist("Hanumankind");
        song = new Song("Run It Up", artist, "Rap");
    }
    
    /**
     * Tests the getTitle method.
     */
    @Test
    public void testGetTitle() 
    {
        assertEquals("Run It Up", song.getTitle());
    }
    
    /**
     * Tests the getArtist method.
     */
    @Test
    public void testGetArtist()
    {
        assertEquals("Hanumankind", song.getArtist());
    }
    
    /**
     * Tests the getGenere method.
     */
    @Test
    public void testGetGenre() 
    {
        assertEquals("Rap", song.getGenre());
    }
    
    /**
     * Tests the toString method.
     */
    @Test
    public void testToString() 
    {
        String songString = "Song: Run It Up Artist: Hanumankind Genre: Rap";
        assertEquals(songString, song.toString());
    }
}
