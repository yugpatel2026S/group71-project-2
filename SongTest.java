package MusicTrends;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class SongTest
{
    private Song thing;
    private Artist art;

    @BeforeEach
    public void setUp() {
        art = new Artist("The Weeknd");
        thing = new Song("Blinding Lights", art, "Pop");
    }
    
    @Test
    public void testGetTitle() {
        Song s = new Song("Blinding Lights", art, "Pop");
        assertEquals("Blinding Lights", s.getTitle());
    }
    @Test
    public void testGetTitleNothing() {
        Song b = new Song("", art, "Pop");
        assertEquals("", b.getTitle());
    }
    @Test
    public void testGetArtist() {
        Artist bert = new Artist("The Weeknd");
        Song a = new Song("Blinding Lights", bert, "Pop");
        assertEquals(bert, a.getArtist());
    }
    @Test
    public void testGetArtistNothing() {
        Song c = new Song("", null, "Pop");
        assertNull(c.getArtist());
    }
    @Test
    public void testGetGenre() {
        Song a = new Song("Blinding Lights", art, "Pop");
        assertEquals("Pop", a.getGenre());
    }
    @Test
    public void testGetGenreNothing() {
        Song c = new Song("", null, "");
        assertEquals("", c.getGenre());
    }
    @Test
    public void testToString() {
        Artist art2 = new Artist("The Weeknd");
        Song f = new Song("Blinding Lights", art2, "Pop");
        String bruh = "Song: Blinding Lights Artist: The Weeknd Genre: Pop";
        assertEquals(bruh, f.toString());
    }
    @Test
    public void testToStringNothing() {
        Song ch= new Song("", null, "");
        String bruh3 = "Song:  Artist: null Genre: ";
        assertEquals(bruh3, ch.toString());
    }
    
    
    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

}
