package com.generation.brainless;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();

    public ClassicalMusic() {
        songs.add("Chinese Dance from The Nutcracker");
        songs.add("Flight of the Bumblebee");
        songs.add("The woman is fickle from Rigoletto");
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