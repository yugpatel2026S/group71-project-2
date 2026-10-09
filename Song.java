package MusicTrends;
public class Song
{
    
    private String title;
    private Artist artist;
    private String genre;
    @SuppressWarnings("javadoc")
    public Song(String title, Artist artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }
    @SuppressWarnings("javadoc")
    public String getTitle() {
        return title;
    }
    @SuppressWarnings("javadoc")
    public Artist getArtist() {
        return artist;
    }
    @SuppressWarnings("javadoc")
    public String getGenre() {
        return genre;
    }
    public String toString() {
        return "Song: " + title + " Artist: " + artist + " Genre: " + genre;
    }
    
    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

}
