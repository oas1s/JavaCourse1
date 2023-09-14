import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true){
            Socket client = serverSocket.accept();

            BufferedOutputStream
                    bufferedOutputStream =
                    new BufferedOutputStream(client.getOutputStream());

            FileInputStream fileInputStream = new FileInputStream(new File("img.jpeg"));
            byte[] image = fileInputStream.readAllBytes();

            bufferedOutputStream.write(addAll("""
                    HTTP/1.1 200 OK
                    Content-Type: image/jpeg
                    """.getBytes(),
                   image));

            bufferedOutputStream.close();
            client.close();
        }
    }

    public static byte[] addAll(final byte[] array1, byte[] array2) {
        byte[] joinedArray = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, joinedArray, array1.length, array2.length);
        return joinedArray;
    }
}
