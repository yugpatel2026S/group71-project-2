package musictrends;

// -------------------------------------------------------------------------
/**
 * Testing the SongData class
 * 
 * @author Samuel
 * @version Oct 8, 2026
 */
public class SongDataTest
    extends student.TestCase
{
    private SongData songDataT;

    // ~ Constructors ..........................................................
    public void setUp()
    {
        songDataT = new SongData();
    }


    // ----------------------------------------------------------
    /**
     * Testing if a year is in the csv file or not
     */
    // ~Public Methods ........................................................
    public void testIsYearValidAndInvalid()
    {
        assertTrue(songDataT.isValidYear(2020));
        assertFalse(songDataT.isValidYear(1967));
    }


// ----------------------------------------------------------
    /**
     * Testing the GetSongsForYear method if a valid year is inputted
     */
    public void testGetSongsForYearV()
    {
        LinkedChain<Song> songs = songDataT.getSongsForYear(2021);
        assertNotNull(songs);
        assertEquals(20, songs.size());
    }


// ----------------------------------------------------------
    /**
     * Testing the playlist if given an incorrect year
     */
    public void testGetSongsForYearI()
    {
        LinkedChain<Song> songs = songDataT.getSongsForYear(1967);
        assertNotNull(songs);
        assertEquals(0, songs.size());
    }


// ----------------------------------------------------------
    /**
     * Testing the first song of the playlist
     */
    public void testFistSong()
    {
        LinkedChain<Song> songs = songDataT.getSongsForYear(2020);
        Song fSong = songs.get(0);
        assertEquals("Blinding Lights", fSong.getTitle());
        assertEquals("The Weeknd", fSong.getArtist().getName());
        assertEquals("Pop", fSong.getGenre());
    }
}
