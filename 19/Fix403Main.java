import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Fix403Main {
    public static void main(String[] args) throws Exception {
        URLConnection urlConnection = new URL("http://l92167fj.beget.tech").openConnection();
        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        InputStream inputStream = urlConnection.getInputStream();
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        System.out.println(new String(bytes));
    }
}
