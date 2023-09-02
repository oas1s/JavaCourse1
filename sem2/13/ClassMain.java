import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class ClassMain {
    public static void main(String[] args) throws Exception {
        InputStream inputStream =
                new FileInputStream("playlist_1.csv");
        String s = new String(inputStream.readAllBytes());
        String[] strings = s.split("//r?//n");
        for (int i = 1; i <strings.length ; i++) {

        }
    }

    static class Track{

    }
}
