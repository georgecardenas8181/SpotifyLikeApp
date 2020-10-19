import java.io.File; 
import java.io.IOException; 
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

public class SpotifyLikeApp {

    
    String status;
    Long position;
    static Clip audioClip;

    public static void main(final String[] args) {

        Scanner input = new Scanner(System.in);

        String userInput = "";
        while (!userInput.equals("q")) {

            menu();

            userInput = input.nextLine();

            userInput.toLowerCase();

            handleMenu(userInput);

        }

        input.close();

    }


    public static void menu() {

        System.out.println("---- SpotifyLikeApp ----");
        System.out.println("[H]ome");
        System.out.println("[S]earch by title");
        System.out.println("[L]ibrary");
        System.out.println("[P]lay");
        System.out.println("[Q]uit");

        System.out.println("");
        System.out.print("Enter q to Quit:");

    }

    
    public static void handleMenu(String userInput) {

        switch(userInput) {

            case "h":
                System.out.println("-->Home<--");
                break;

            case "s":
                System.out.println("-->Search by title<--");
                break;

            case "l":
                System.out.println("-->Library<--");
                break;
                
            case "p":
                System.out.println("-->Play<--");
                play();
                break;

            case "q":
                System.out.println("-->Quit<--");
                break;

            default:
                break;
        }

    }

    public static void play() {

        final File file = new File("./src/library/spotify_fma_track1_cropped.wav");

        try {
        
            audioClip = AudioSystem.getClip();

            final AudioInputStream in = getAudioInputStream(file);

            audioClip.open(in);
            audioClip.setMicrosecondPosition(0);
            audioClip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch(Exception e) {
            e.printStackTrace(); 
        }

    }


}

