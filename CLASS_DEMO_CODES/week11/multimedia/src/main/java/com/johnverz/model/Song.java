package com.johnverz.model;

public class Song extends MediaTrack{
    private String audioQuality;

    public Song(String title, String artist,String audioQuality, String filePath) {
        super(TrackType.SONG, artist, title, filePath);
        this.audioQuality = audioQuality;
    }
    
    @Override
    public void play(){
        incrementStream();
        System.out.println(">>> Playing " + audioQuality + " Audio...");
        System.out.println(this);  
        playFile();
    }
}
