package MusicTrends;

import java.util.ArrayList;
import java.util.Scanner;


public class MusicTrends
{
    private static int playlistSize = 20;
    private Scanner scanner = new Scanner(System.in);
    private SongData songData = new SongData();
    private LinkedChain<Song> playlist = new LinkedChain<>();
    
    
    public static void main(String [] args) {
        MusicTrends thing = new MusicTrends();
        System.out.println("Welcome to MusicTrends!!");
        int year = thing.getYearInput();
        thing.createPlaylist(year);
        thing.displayPlaylist();   
    }
    
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
            else
            {
                int year = Integer.parseInt(input);
                if (year >= firstYear && year <= currentYear)
                {
                    return year;
                }
                else
                {
                    System.out.println("Your year must be within " + firstYear +
                        " and " + currentYear + ". (Please input another year again.)");
                }
            }
        }
    }
    
    public void createPlaylist(int year) {
        playlist = songData.getSongsForYear(year);
    }
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
