package com.ch6.command.receivers;

public class Stereo {

    /**
     * on()
     * off()
     * setCd()
     * setDvd()
     * setRadio()
     * setVolume()
     */

    public void on() {
        System.out.println("Stereo is turned on.");
    }

    public void off() {
        System.out.println("Stereo is turned off.");
    }

    public void setCd(String cd) {
        System.out.println("Stereo cd is set to " + cd);
    }

    public void setDvd(String dvd) {
        System.out.println("Stereo dvd is set to " + dvd);
    }

    public void setRadio(String radio) {
        System.out.println("Stereo radio is set to " + radio);
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume is set to " + volume);
    }


}
