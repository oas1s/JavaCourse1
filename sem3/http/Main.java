import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("google.com",80);

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write(("GET / HTTP/1.1\n" +
                "Host: google.com\n" +
                "\n").getBytes());

        int c;
        StringBuilder stringBuilder = new StringBuilder();
        while ((c =inputStream.read()) != -1){
            stringBuilder.append((char) c);
        }

        String s = stringBuilder.toString();
        String[] strings = s.split("\r?\n");

        StringBuilder stringBuilder1 = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i <strings.length ; i++) {
            if (flag){
               stringBuilder1.append(strings[i]);
            } else {
                if (strings[i].isEmpty()){
                    flag = true;
                }
            }
        }

        System.out.println(stringBuilder1);
    }
}
