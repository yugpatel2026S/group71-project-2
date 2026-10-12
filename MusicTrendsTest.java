package MusicTrends;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import org.junit.Test;


public class MusicTrendsTest
{
    @Test
    public void testMainNormal()
    {
        System.setIn(new ByteArrayInputStream("2024\n".getBytes()));
        
        assertDoesNotThrow(() -> MusicTrends.main(new String[0]));
    }
    @Test
    void testMainNotNormal() {
        System.setIn(new ByteArrayInputStream("gu29ygf2ey\n2024\n".getBytes()));
 
        assertDoesNotThrow(() -> MusicTrends.main(new String[0]));
    }
    @Test
    void testGetYearInputNormal() {
        System.setIn(new ByteArrayInputStream("2024\n".getBytes()));
        MusicTrends thing = new MusicTrends();
 
        assertEquals(2024, thing.getYearInput());
    }
    @Test
    void testGetYearInputNotNormal() {
        // 1800 is rejected, so it asks again and gets 2024
        System.setIn(new ByteArrayInputStream("1800\n2024\n".getBytes()));
        MusicTrends thing = new MusicTrends();
 
        assertEquals(2024, thing.getYearInput());
    }
    @Test
    void testCreatePlaylistNormal() {
        MusicTrends thing = new MusicTrends();
        SongData data = new SongData();
 
        thing.createPlaylist(2024);
        assertTrue(data.isValidYear(2024));
        assertEquals(20, data.getSongsForYear(2024).size());
    }
    @Test
    void testCreatePlaylistNotNormal() {
        MusicTrends thing = new MusicTrends();
        SongData data = new SongData();
 
        thing.createPlaylist(1800);
        assertFalse(data.isValidYear(1800));
        assertEquals(0, data.getSongsForYear(1800).size());
    }
    @Test
    void testDisplayPlaylistNormal() {
        MusicTrends thing = new MusicTrends();
        thing.createPlaylist(2024);
 
        assertDoesNotThrow(() -> thing.displayPlaylist());
    }
    @Test
    void testDisplayPlaylistBad() {
        MusicTrends thing = new MusicTrends();
 
        assertDoesNotThrow(() -> thing.displayPlaylist());
    }

}
