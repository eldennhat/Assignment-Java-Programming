package org.example.Bai2;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;

public class ServerChat extends WebSocketServer {
    // Lưu trữ danh sách các client đang kết nối
    private Set<WebSocket> clients;

    public ServerChat(int port) {
        super(new InetSocketAddress(port));
        clients = new HashSet<>();
    }

    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        clients.add(conn);
        System.out.println("Có người mới kết nối: " + conn.getRemoteSocketAddress());
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        clients.remove(conn);
        System.out.println("Một người đã thoát: " + conn.getRemoteSocketAddress());
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        for (WebSocket client : clients) {
            if (client != conn) {
                client.send(message);
            }
        }
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        ex.printStackTrace();
    }

    @Override
    public void onStart() {
        System.out.println("WebSocket Server đã khởi động trên port: " + getPort());
    }

    public static void main(String[] args) {
        // Chạy Server
        ServerChat server = new ServerChat(8887);
        server.start();
    }
}
