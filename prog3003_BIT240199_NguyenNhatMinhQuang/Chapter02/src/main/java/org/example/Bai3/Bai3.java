package org.example.Bai3;

class TV {
    public void on() {
        System.out.println("TV: Turn on!");
    }
    public void setInput() {
        System.out.println("TV: Switched to HDMI mode!");
    }
}
class SoundSystem {
    public void on() {
        System.out.println("Speaker: Turn on!");
    }
    public void setVolume(int level) {
        System.out.println("Speaker: The volume has been adjusted to the " + level + " level.");
    }
}
class DVDPlayer {
    public void on() {
        System.out.println("DVD Device: Turn on!");
    }
    public void play(String movie) {
        System.out.println("DVD Device: Playing '" + movie + "'");
    }
}
class Lights {
    public void dim(int percentage) {
        System.out.println("Light: Brightness reduced by " + percentage + "%");
    }
}
//2
class HomeTheaterFacade {
    private TV tv;
    private SoundSystem sound;
    private DVDPlayer dvd;
    private Lights lights;

    public HomeTheaterFacade(TV tv, SoundSystem sound, DVDPlayer dvd, Lights lights) {
        this.tv = tv;
        this.sound = sound;
        this.dvd = dvd;
        this.lights = lights;
    }
    //3
    public void watchMovie(String movie) {
        System.out.println("---Start watching the movie---");
        lights.dim(30);
        tv.on();
        tv.setInput();
        sound.on();
        sound.setVolume(20);
        dvd.on();
        dvd.play(movie);
        System.out.println("Please enjoy the movie!!!");
    }

    //extension
    public void endMovie() {
        System.out.println("Turn off the theater!");
        System.out.println("Turning off all devices...");
    }
}

public class Bai3 {
    public static void main(String[] args) {
        TV myTV = new TV();
        SoundSystem mySound = new SoundSystem();
        DVDPlayer myDVD = new DVDPlayer();
        Lights myLights = new Lights();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(myTV, mySound, myDVD, myLights);

        homeTheater.watchMovie("HarryPotter");
    }
}
