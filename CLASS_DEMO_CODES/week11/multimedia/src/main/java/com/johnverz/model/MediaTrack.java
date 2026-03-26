package com.johnverz.model;

import java.io.File;
import java.io.IOException;
import java.awt.Desktop;

public abstract class MediaTrack {
    protected TrackType type;
    private String artist;
    private int streamCount = 0;
    private String title;
    private String fileName;
    private static final String BASE_DIR = "data/files/";

    public MediaTrack(TrackType type, String artist, String title, String fileName) {
        this.type = type;
        this.artist = artist;
        this.title = title;
        this.fileName = fileName;
    }

    public void incrementStream(){
        streamCount++;
    }
    @Override
    public String toString(){
        return String.format("""
            --- Media Info ---
            Title: %s
            By: %s
            Stream Count: %d
            Type: %s
        """, title, artist,streamCount, type.name());
    }

    public void playFile(){
        try {
            // Combine the base directory with the filename
            File file = new File(BASE_DIR + this.fileName);
            
            if (file.exists()) {
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(file);
                }
            } else {
                System.out.println("File not found in the 'files' folder: " + fileName);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public abstract void play();

}


