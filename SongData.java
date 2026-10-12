package MusicTrends;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// -------------------------------------------------------------------------
/**
 * Creates the playlist of songs and is the main file in charge of reading the
 * songs on the csv file
 * 
 * @author Samuel
 * @version Oct 8, 2026
 */
public class SongData
{
    // ~ Fields ................................................................
    private String fileName;

    // ----------------------------------------------------------
    /**
     * Create a new SongData object.
     */
    // ~ Constructors ..........................................................
    public SongData()
    {
        fileName = "songs.csv";
    }

    // ~Public Methods ........................................................
// ----------------------------------------------------------
    /**
     * Creates a playlist of top 20 songs
     * 
     * @param year
     * @return A linkedChain with the top 20 songs
     */
    public LinkedChain<Song> getSongsForYear(int year)
    {
        LinkedChain<Song> playlist = new LinkedChain<Song>();

        try
        {
            BufferedReader reader =
                new BufferedReader(new FileReader(fileName));

            String line = reader.readLine();
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split(",");
                int fileYear = Integer.parseInt(parts[0]);
                if (fileYear == year)
                {
                    String title = parts[2];
                    String artistName = parts[3];
                    String genre = parts[4];

                    Artist artist = new Artist(artistName);
                    Song song = new Song(title, artist, genre);

                    playlist.addToEnd(song);
                }
            }
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("Cannot read the Song Data :(");
        }
        return playlist;
    }


// ----------------------------------------------------------
    /**
     * This checks if the year is valid * @param year
     * 
     * @return True if valid year ,false if not
     */
    public boolean isValidYear(int year)
    {
        try
        {
            BufferedReader reader =
                new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split(",");

                int fileYear = Integer.parseInt(parts[0]);
                if (fileYear == year)
                {
                    reader.close();
                    return true;
                }

            }
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("Cannot find Song Data :(");
        }
        return false;
    }
}
