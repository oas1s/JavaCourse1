package ru.itis.javafx.server;

import lombok.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MyConnection {

    private Socket socket;

    private PrintWriter printWriter;
    private BufferedReader bufferedReader;

    @SneakyThrows
    public MyConnection(Socket socket) {
        this.socket = socket;
        this.printWriter = new PrintWriter(socket.getOutputStream(),true);
        this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    public void sendMessage(String message){
        printWriter.println(message);
    }

    @SneakyThrows
    public String receiveMessage() {
        return bufferedReader.readLine();
    }
}
