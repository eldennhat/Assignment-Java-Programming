package org.example.Bai2;
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // Hỗ trợ sẵn MP3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Đang phát file MP3. Tên file: " + fileName);
        }
        // Phải dùng Adapter để phát VLC
        else if (audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Định dạng không hợp lệ: " + audioType);
        }
    }
}
