import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        int port = 8080;
        ServerSocket serverSocket = new ServerSocket(port);

        while (true) {
            Socket clientSocket = serverSocket.accept();

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            String s;
            while ((s = in.readLine()) != null) {
                System.out.println(s);
                if (s.isEmpty()) {
                    break;
                }
            }

            out.write("HTTP/1.1 200 OK\n" +
                    "Date: Wed, 11 Feb 2009 11:20:59 GMT\n" +
                    "Server: Apache\n" +
                    "X-Powered-By: PHP/5.2.4-2ubuntu5wm1\n" +
                    "Last-Modified: Wed, 11 Feb 2009 11:20:59 GMT\n" +
                    "Content-Language: ru\n" +
                    "Content-Type: text/html; charset=utf-8\n" +
                    "Content-Length: 140\n" +
                    "Connection: close\n" +
                    "\n" +
                    "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <title>Title</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1>Hi there</h1>\n" +
                    "</body>\n" +
                    "</html>\n");

            out.close();
            in.close();
            clientSocket.close();
        }
    }
}
