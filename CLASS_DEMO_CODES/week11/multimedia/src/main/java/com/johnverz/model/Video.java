package com.johnverz.model;

public class Video extends MediaTrack {
    private String resolution;

    public Video(String title, String artist, String resolution, String filePath) {
        super(TrackType.VIDEO, artist, title, filePath);
        this.resolution = resolution;
    }
    
    @Override
    public void play() {
        incrementStream();
        System.out.println(">>> Buffering " + resolution + " Video...");
        System.out.println(this);
        playFile();
    }
}
