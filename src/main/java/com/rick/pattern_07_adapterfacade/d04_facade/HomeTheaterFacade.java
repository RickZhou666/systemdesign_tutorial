package com.rick.pattern_07_adapterfacade.d04_facade;

import com.rick.pattern_07_adapterfacade.d04_facade.equipment.*;

/**
 * @Author: Rick
 * @Date: 2022/9/14 22:29
 */
public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, StreamingPlayer player, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(player);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        player.stop();
        player.off();
    }
}
