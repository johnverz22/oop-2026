package com.johnverz.servivce;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import com.johnverz.model.*;

public class MediaService {
    private List<MediaTrack> library = new ArrayList<>();
    private Gson gson;
    private final String FILE_PATH = "data/media.json";

    public MediaService() {
        // adapter
        RuntimeTypeAdapterFactory<MediaTrack> adapter = RuntimeTypeAdapterFactory.of(MediaTrack.class, "type", true)
            .registerSubtype(Song.class, TrackType.SONG.name())
            .registerSubtype(Video.class, TrackType.VIDEO.name());

        this.gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapterFactory(adapter).create();
        loadFile();
    }

    public void loadFile(){
        try(Reader reader = new FileReader(FILE_PATH)){
            Type medType = new TypeToken<ArrayList<MediaTrack>>(){}.getType();
            library = gson.fromJson(reader, medType);
        }catch(IOException  e){
            System.out.println("Cannot load JSON file. \nError: " + e.getMessage());
        }
    }


    public List<MediaTrack> getLibrary(){
        return library;
    }


    public void saveToFile() {
        try (Writer writer = new FileWriter(FILE_PATH)) {
            gson.toJson(library, writer);
        } catch (IOException e) { System.out.println("Error saving: " + e.getMessage()); }
    }
}
