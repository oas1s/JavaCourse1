import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class RequestsMain {
    public static void main(String[] args) throws Exception {
        InputStream inputStream =
                new URL("http://10.17.50.59:8080").openStream();
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        System.out.println(new String(bytes));
    }
}
