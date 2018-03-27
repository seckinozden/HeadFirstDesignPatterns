package com.ch7.adapterandfacade.facade;


import com.ch7.adapterandfacade.facade.components.*;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {

        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();
        TheaterLights theaterLights = new TheaterLights();
        Projector projector = new Projector();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Tuner tuner = new Tuner();
        Amplifier amplifier = new Amplifier();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, popcornPopper, screen);

        homeTheaterFacade.watchMovie("The lord of the rings.");
        homeTheaterFacade.endMovie();
    }
}
