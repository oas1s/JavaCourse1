import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("google.com",80);

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write(("GET / HTTP/1.1\n" +
                "Host: google.com\n" +
                "\n").getBytes());

        int c;

        while ((c =inputStream.read()) != -1){
            System.out.print((char) c);
        }
    }
}
