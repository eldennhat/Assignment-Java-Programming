package org.example.Bai2;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "chuyen_cua_mua.mp3");
        audioPlayer.play("vlc", "phim_hanh_dong.vlc");
        audioPlayer.play("mp4", "video.mp4");
    }
}
