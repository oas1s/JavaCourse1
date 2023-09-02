import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainInClass {

    static List<String> strings = new ArrayList<>();
    static long end = 0;
    static long start = 0;
    public static void main(String[] args) {
        start = System.currentTimeMillis();
        List<MyThread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new MyThread());
        }

        for (int i = 0; i < 10; i++) {
            threads.get(i).start();
        }

    }

    static class MyThread extends Thread{
        public void run(){
            strings.add(ApiCatFactGetter.getFactData());
            end = System.currentTimeMillis();
            if (strings.size() == 10){
                System.out.println(end-start);
            }
        }
    }

    static class ApiCatFactGetter {

        public static String getFactData(){
            try {
                InputStream inputStream = new URL("https://cat-fact.herokuapp.com/facts")
                        .openStream();
                byte[] bytes = new byte[inputStream.available()];
                inputStream.read(bytes);
                return new String(bytes);
            } catch (Exception e){
                return null;
            }
        }
    }
}
