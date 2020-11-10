import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
  
import javax.sound.sampled.AudioInputStream; 
import javax.sound.sampled.AudioSystem; 
import javax.sound.sampled.Clip; 
import javax.sound.sampled.LineUnavailableException; 
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;
import static javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED;

/*
    To compile: javac SpotifyLikeApp.java
    To run: java SpotifyLikeApp
 */

// declares a class for the app
public class SpotifyLikeApp {

    // global variables for the app
    String status;
    Long position;
    static Clip audioClip;
static HashMap<String, Song> songs = new HashMap<>();



    // "main" makes this class a java app that can be executed
    public static void main(String[] args) {

        Song s = new Song();
            s.setArtist("Alesso");
            s.setTitle("We Could Be Heroes feat. Tove Lo");
            s.setYear("2017");
            s.setGenre("Dance Music");
            s.setFilePath("./Wav_Files/Alesso-Heroes-we-could-be-feat-Tove-LO-164138555.wav");
            songs.put(s.getTitle(), s);
        
            s = new Song();
            s.setArtist("Calvin Harris");
            s.setTitle("Summer (Extended Edition)");
            s.setYear("2016");
            s.setGenre("Disco");
            s.setFilePath("./Wav_Files/Calvin-Harris-Summer-Extended-143553285.wav");
            songs.put(s.getTitle(), s);
        
            s = new Song();
            s.setArtist("Dimitri Vages, Martin Garrix, Like Mike Tremor");
            s.setTitle("Beatport");
            s.setYear("2015");
            s.setGenre("Dance");
            s.setFilePath("./Wav_Files/Dimitri-Vegas-Martin-Garrix-like-Mike-Tremor-OUT-NOW-BEATPORT-1-139678132.wav");
            songs.put(s.getTitle(), s);
        
            s = new Song();
            s.setArtist("Flosstradamus");
            s.setTitle("Prison Riot feat. Lil Jon");
            s.setYear("2018");
            s.setGenre("Rap Hip-Hop");
            s.setFilePath("./Wav_Files/FLOSSTRADAMUS-GTA-LIL-JON-PRISON-RIOT-201105629.wav");
            songs.put(s.getTitle(), s);

            s = new Song();
            s.setArtist("Hardwell");
            s.setTitle("Dare You (Radio Edit) feat. Matthew Kona");
            s.setYear("2015");
            s.setGenre("Dance");
            s.setFilePath("./Wav_Files/Hardwell-feat-Matthew-Kona-Dare-You-Radio-Edit-128147532.wav");
            songs.put(s.getTitle(), s);
        
            s = new Song();
            s.setArtist("Jungle Bae");
            s.setTitle("MX Prime feat. Bunji Garlin");
            s.setYear("2018");
            s.setGenre("Dance Mix");
            s.setFilePath("./Wav_Files/Jungle-Bae-feat-Bunji-Garlin-MX-Prime-193270667.wav");
            songs.put(s.getTitle(), s);
        
            s = new Song();
            s.setArtist("Martin Garrix");
            s.setTitle("The Only Way Is Up feat. Tiesto");
            s.setYear("2016");
            s.setGenre("EDM");
            s.setFilePath("./Wav_Files/Martin-Garrix-Tiesto-The-Only-way-Is-Up-OUT-NOW-200843678.wav");
            songs.put(s.getTitle(), s);
        
            s = new Song();
            s.setArtist("Skrillex feat. Alvn Risk");
            s.setTitle("Try It Out (Neon Mix)");
            s.setYear("2015");
            s.setGenre("EDM");
            s.setFilePath("./Wav_Files/SKRILLEX-ALVIN-RISK-TRY-IT-OUT-NEON-MIX-115102159.wav");
            songs.put(s.getTitle(), s);

        // create a scanner for user input
        Scanner input = new Scanner(System.in);

        String userInput = "";
        while (!userInput.equals("q")) {

            menu();

            // get input
            userInput = input.nextLine();

            // accept upper or lower case commands
            userInput.toLowerCase();

            // do something
            handleMenu(userInput);

        }

        // close the scanner
        input.close();
    }

    /*
     * displays the menu for the app
     */
    public static void menu() {

        System.out.println("---- SpotifyLikeApp ----");
        System.out.println("[H]ome");
        System.out.println("[S}earch by title");
        System.out.println("[L]ibrary");
        System.out.println("[P]lay");
        System.out.println("[Q]uit");
        System.out.println("");

        System.out.println("");
        System.out.print("Please press p to play the song:");

    }

    /*
     * handles the user input for the app
     */
    public static void handleMenu(String userInput) {

        switch(userInput) {

            case "h":
                System.out.println("-->Home<--");
                break;

            case "s":
                System.out.println("-->Search by title<--");
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter the title:");
                String title = input.nextLine();
                Song song = songs.get(title);
                
                if (song !=null)
                 {
                    System.out.println("Your current selection is now playing");
                    play(song.getFilePath());

                } else {
                    System.out.println("Sorry, please search again.");
            }
                break;  

            case "l":
                System.out.println("-->Library<--");
                for(int i=10; i>1; i--){
                    System.out.println("The value of i is: "+i);
               }

                break;
                
            case "p":
                System.out.println("-->Play<--");
                play(songs.get("Beatport").getFilePath());
                break;

            case "q":
                System.out.println("-->Quit<--");
                break;

            default:
                break;
        }

    }

    
    /*
     * plays an audio file
     */
    public static void play(String filePath) {

        // open the audio file
        final File file = new File(filePath);


        try {
        
            // create clip 
            audioClip = AudioSystem.getClip();

            // get input stream
            final AudioInputStream in = getAudioInputStream(file);

            audioClip.open(in);
            audioClip.setMicrosecondPosition(0);
            audioClip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch(Exception e) {
            e.printStackTrace(); 
        }

    }


}


