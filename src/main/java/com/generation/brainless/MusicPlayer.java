package com.generation.brainless;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@PropertySource("classpath:musicPlayer.properties")

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.value}")
    private int value;

    private Music classicalMusicSong;
    private Music rockMusicSong;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music classicalMusicSong,
                       @Qualifier("rockMusic") Music rockMusicSong) {
        this.classicalMusicSong = classicalMusicSong;
        this.rockMusicSong = rockMusicSong;
    }

    public void playMusic(Enum<Genres> genre) {

        if (genre == Genres.ROCK) System.out.println("Playing: " + rockMusicSong.getRandomSong());
        else System.out.println("Playing: " + classicalMusicSong.getRandomSong());

    }

}