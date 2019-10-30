package com.generation.brainless;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        for (int i = 0; i < 3; i++) {
            player.playMusic(Genres.ROCK);
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            player.playMusic(Genres.CLASSICAL);
        }

        context.close();

    }

}
