package org.example.Bai2;

public class MediaAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;

    public MediaAdapter() {
        // Khởi tạo đối tượng thư viện mới bên trong Adapter
        vlcPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        // Dịch yêu cầu từ chuẩn cũ sang chuẩn mới
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else {
            System.out.println("Định dạng " + audioType + " không được hỗ trợ bởi Adapter này.");
        }
    }
}
