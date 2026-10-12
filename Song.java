package MusicTrends;
/**
 *  Creates a Song object
 *  Creates getter methods to get information about the song.
 * 
 *  @author yugpatel
 *  @version Oct 12, 2026
 */
public class Song
{
    //~ Fields ................................................................
    private String title;
    private Artist artist;
    private String genre;
    
    //~ Constructors ..........................................................
    /**
     * Create a new Song object.
     * @param title Title of the song
     * @param artist Artist of the song
     * @param genre Genre of the song
     */
    public Song(String title, Artist artist, String genre) 
    {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }
    
    //~Public  Methods ........................................................
    /**
     * Getter method for the title of the song.
     * @return title Title of the song
     */
    public String getTitle() 
    {
        return title;
    }
    
    /**
     * Getter method for the artist of the song.
     * @return artist Artist of the song
     */
    public Artist getArtist() 
    {
        return artist;
    }
    
    /**
     * Getter method for the genre of the song.
     * @return genre Genre of the song
     */
    public String getGenre() 
    {
        return genre;
    }
    
    /**
     * Creates a string with the song information.
     * @return String version of the song information
     */
    public String toString() 
    {
        return "Song: " + title + " Artist: " + artist + " Genre: " + genre;
    }
    
}
