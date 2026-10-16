package MusicTrends;

import java.util.ArrayList;
import java.util.Scanner;


// -------------------------------------------------------------------------
/**
 *  Main class of the program
 *  Uses all other classes
 * 
 *  @author gphun
 *  @version Oct 16, 2026
 */
public class MusicTrends
{

    private Scanner scanner = new Scanner(System.in);
    private SongData songData = new SongData();
    private LinkedChain<Song> playlist = new LinkedChain<>();
    
    
    // ----------------------------------------------------------
    /**
     * Main method of the MusicTrends class
     * @param args
     */
    public static void main(String [] args) {
        MusicTrends thing = new MusicTrends();
        System.out.println("Welcome to MusicTrends!!");
        int year = thing.getYearInput();
        thing.createPlaylist(year);
        thing.displayPlaylist();   
    }
    
    // ----------------------------------------------------------
    /**
     * Checks user's input if it is a valid year, letter, or empty.
     * @return year
     *              returns the year
     */
    public int getYearInput()
    {
        int currentYear = 2025;
        int firstYear = 2020;
        
        while (true) 
        {
            System.out.print("Enter a year from 2020-2025!");
            String input = scanner.nextLine().trim();
            
            if (input.isEmpty()) 
            {
                System.out.println("Your entry cannot be blank. Please enter a valid year.");
            }
            else if (!input.matches("[0-9]+")){
                System.out.println("Your input is invalid. Please enter a valid year.");
            }
            else
            {
                int year = Integer.parseInt(input);
                if (year >= firstYear && year <= currentYear)
                {
                    return year;
                }
                System.out.println("Your year must be within " + firstYear +
                    " and " + currentYear + ". (Please input another year again.)");
                
            }

            
            

        }
    }
    
    // ----------------------------------------------------------
    /**
     * creates playlist object
     * @param year
     */
    public void createPlaylist(int year) {
        playlist = songData.getSongsForYear(year);
    }
    // ----------------------------------------------------------
    /**
     * Produces and displays a playlist of 20 songs
     */
    public void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty!!");
            return;
        }
        System.out.println();
        System.out.println("Top " + playlist.size() + " songs:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(playlist.get(i));
        }
        System.out.println();
    }
 
}
