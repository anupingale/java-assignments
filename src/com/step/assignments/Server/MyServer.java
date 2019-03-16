package com.step.assignments.Server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(8000);
            Socket socket = server.accept();
            DataInputStream input = new DataInputStream(socket.getInputStream());
            String msg = input.readUTF();
            System.out.println(msg);
            socket.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
