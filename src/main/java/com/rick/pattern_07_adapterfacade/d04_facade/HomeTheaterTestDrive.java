package com.rick.pattern_07_adapterfacade.d04_facade;

import com.rick.pattern_07_adapterfacade.d04_facade.equipment.*;

/**
 * @Author: Rick
 * @Date: 2022/9/14 22:42
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier,
                tuner,
                player,
                projector,
                lights,
                screen,
                popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
