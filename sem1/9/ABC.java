import java.io.FileWriter;
import java.io.IOException;

public class ABC {
    private String something;

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        if (something.equals("some")) {
            throw new RuntimeException("asdasd");
        }
        this.something = something;

    }

    public void doSomething() throws IOException {
        FileWriter fileWriter = new FileWriter("");
    }
}
