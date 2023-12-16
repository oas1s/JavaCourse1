package ru.itis.javafx.server;

import lombok.SneakyThrows;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Server {

    private static Map<Character, MyConnection> map = new HashMap<>();
    private static boolean XLetterTurn = true;

    private static Character[][] symbols = new Character[3][3];


    //Update JavaFX UI from another thread
    @SneakyThrows
    public static void main(String[] args) {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        map.put('X', new MyConnection(socket));
        map.get('X').sendMessage("X");
        Socket socket1 = serverSocket.accept();
        map.put('O', new MyConnection(socket1));
        map.get('O').sendMessage("O");
        while (true) {
            if (XLetterTurn) {
                String message = map.get('X').receiveMessage();
                Integer column = Integer.valueOf(message.split(" ")[0]);
                Integer row = Integer.valueOf(message.split(" ")[1]);
                symbols[column][row] = 'X';
                if (isWinnerDefined()) {
                    String winnerMessage = "Winner X " + column + " " + row;
                    map.get('O').sendMessage(winnerMessage);
                    map.get('X').sendMessage(winnerMessage);
                    break;
                } else {
                    map.get('O').sendMessage(message);
                    System.out.println("Message about X pos sent to O user");
                    XLetterTurn =false;
                }
            } else {
                String message = map.get('O').receiveMessage();
                Integer column = Integer.valueOf(message.split(" ")[0]);
                Integer row = Integer.valueOf(message.split(" ")[1]);
                symbols[column][row] = 'O';
                if (isWinnerDefined()) {
                    String winnerMessage = "Winner O " + column + " " + row;
                    map.get('X').sendMessage(winnerMessage);
                    map.get('O').sendMessage(winnerMessage);
                    break;
                } else {
                    map.get('X').sendMessage(message);
                    System.out.println("Message about O pos sent to X user");
                    XLetterTurn = true;
                }
            }
        }
    }

    public static Boolean isWinnerDefined() {
        for (int i = 0; i < symbols.length; i++) {
            if ((symbols[0][i] == symbols[1][i]) && (symbols[2][i] == symbols[0][i]) && (symbols[0][i] != null) &&
                    (symbols[1][i] != null) && (symbols[2][i] != null)) {
                return true;
            }
            if ((symbols[i][0] == symbols[i][1]) && (symbols[i][1] == symbols[i][2]) && (symbols[i][0] != null)
                    && (symbols[i][1] != null) && (symbols[i][2] != null)) {
                return true;
            }
        }
        if (symbols[0][0] == symbols[1][1] && symbols[1][1] == symbols[2][2] && symbols[0][0] != null) return true;
        if (symbols[0][2] == symbols[1][1] && symbols[1][1] == symbols[2][0] && symbols[0][2] != null) return true;
        return false;
    }
}
