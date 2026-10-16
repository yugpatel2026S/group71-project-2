package MusicTrends;
// -------------------------------------------------------------------------
/**
 *  Gets artist data from csv
 * 
 *  @author gphun
 *  @version Oct 16, 2026
 */
public class Artist
{
    private String name;

    // ----------------------------------------------------------
    /**
     * Create a new Artist object.
     * @param name
     */
    public Artist(String name) {
        this.name = name;
    }
    // ----------------------------------------------------------
    /**
     * gets artist's name
     * @return name
     *              name of artist
     */
    public String getName() {
        return name;
    }
    // ----------------------------------------------------------
    /**
     * retrieves artist's name
     * @return name
     *              name of artist
     */
    public String toString() {
        return name;
    }
    //~ Fields ................................................................

    //~ Constructors ..........................................................

    //~Public  Methods ........................................................

}
