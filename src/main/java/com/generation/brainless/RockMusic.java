package com.generation.brainless;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("Carry On Wayward Son");
        songs.add("Rock You Like a Hurricane");
        songs.add("Renegade");
    }

    @Override
    public String getRandomSong() {
        int i = (int) (Math.random()*3);

        try {
            return songs.get(i);
        }
        catch (IndexOutOfBoundsException e){
            return songs.get(2);
        }
    }

}