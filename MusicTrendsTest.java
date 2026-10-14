package MusicTrends;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
 
import org.junit.jupiter.api.Test;


public class MusicTrendsTest
{
    // ---------- construction ----------
 
    private MusicTrends app;
 
    public void setUp()
    {
        app = new MusicTrends();
    }
 
    // ---------- createPlaylist ----------
 
    @Test
    public void testCreatePlaylistFirstYear()
    {
        MusicTrends app = new MusicTrends();
        boolean threw = false;
        String message = "";
        try
        {
            app.createPlaylist(2020);
        }
        catch (Exception e)
        {
            threw = true;
            message = e.getClass().getSimpleName() + ": " + e.getMessage();
        }
        assertFalse(threw, "createPlaylist(2020) threw " + message);
    }
 
    @Test
    public void testCreatePlaylistLastYear()
    {
        MusicTrends app = new MusicTrends();
        boolean threw = false;
        String message = "";
        try
        {
            app.createPlaylist(2025);
        }
        catch (Exception e)
        {
            threw = true;
            message = e.getClass().getSimpleName() + ": " + e.getMessage();
        }
        assertFalse(threw, "createPlaylist(2025) threw " + message);
    }
 
 
    @Test
    public void testCreatePlaylistSameYearTwice()
    {
        MusicTrends app = new MusicTrends();
        boolean threw = false;
        String message = "";
        try
        {
            app.createPlaylist(2022);
            app.createPlaylist(2022);
        }
        catch (Exception e)
        {
            threw = true;
            message = e.getClass().getSimpleName() + ": " + e.getMessage();
        }
        assertFalse(threw, "Repeating createPlaylist threw " + message);
    }
 
    @Test
    public void testCreatePlaylistOutOfRangeYears()
    {
        // createPlaylist does no validation of its own, so this documents what SongData does.
        int[] badYears = {1999, 2019, 2026, 0, -5};
        int crashes = 0;
        for (int year : badYears)
        {
            MusicTrends app = new MusicTrends();
            try
            {
                app.createPlaylist(year);
            }
            catch (Exception e)
            {
                crashes++;
            }
        }
        // Nothing should crash on unsupported years; change this if SongData is meant to throw.
        assertEquals(0, crashes, crashes + " out-of-range year(s) caused an exception");
    }
 
    // ---------- displayPlaylist ----------
 
    @Test
    public void testDisplayPlaylist()
    {
        MusicTrends app = new MusicTrends();
        boolean threw = false;
        String message = "";
        try
        {
            app.createPlaylist(2022);
            app.displayPlaylist();
        }
        catch (Exception e)
        {
            threw = true;
            message = e.getClass().getSimpleName() + ": " + e.getMessage();
        }
        assertFalse(threw, "displayPlaylist threw " + message);
    }
 
    @Test
    public void testDisplayPlaylistBeforeCreate()
    {
        MusicTrends app = new MusicTrends();
        boolean threw = false;
        String message = "";
        try
        {
            app.displayPlaylist();
        }
        catch (Exception e)
        {
            threw = true;
            message = e.getClass().getSimpleName() + ": " + e.getMessage();
        }
        assertFalse(threw, "displayPlaylist on an empty playlist threw " + message);
    } 

    @Test
    public void testSwitchYearsThenDisplay()
    {
        MusicTrends app = new MusicTrends();
        boolean threw = false;
        String message = "";
        try
        {
            app.createPlaylist(2020);
            app.displayPlaylist();
            app.createPlaylist(2025);
            app.displayPlaylist();
        }
        catch (Exception e)
        {
            threw = true;
            message = e.getClass().getSimpleName() + ": " + e.getMessage();
        }
        assertFalse(threw, "Switching years then displaying threw " + message);
    }
}
