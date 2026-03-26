package com.johnverz;

import java.util.List;
import java.util.Scanner;

import com.johnverz.model.MediaTrack;
import com.johnverz.servivce.MediaService;

public class Main {
    private static MediaService ms = new MediaService();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            System.out.println("--- DIGITAL MEDIA PLAYER ---");
            System.out.println("""
                    [1] View Library
                    [2] Play a Track
                    [3] Exit
                    """);
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    showLibrary();
                    break;
                case 2:
                    playTrack();
                    break;
                case 3:
                    System.out.println("Good bye!");
                    System.exit(0);
                default:

                    break;
            }
        }
    }

    public static void showLibrary(){
        List<MediaTrack> tracks = ms.getLibrary();

        System.out.println("--- LIST OF MEDIA TRACKS ---");
        tracks.forEach(System.out::println);
    }

    public static void playTrack(){
        List<MediaTrack> tracks = ms.getLibrary();

        System.out.println("--- LIST OF MEDIA TRACKS ---");
        for(int i = 1; i <= tracks.size(); i++){
            System.out.print("ID:" + i);
            System.out.println("\n"+tracks.get(i-1));

        }
        
        System.out.println("Enter media ID to play: ");
        int id = sc.nextInt();

        MediaTrack selected = tracks.get(id-1);
        selected.play();
        ms.saveToFile(); // Save updated stream counts

        
    }
}