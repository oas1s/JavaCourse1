import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyTest {

    static BodyIndexCountFromApp bodyIndexCountFromApp;

    @BeforeAll
    public static void init(){
        bodyIndexCountFromApp =
                new BodyIndexCountFromApp("http://127.0.0.1:8080",
                        new BodyIndexCounter());
    }

    @Test
    public void testBodyIndexCount() throws Exception{
        Double index = 22.49134948096886;

        Double index1 = bodyIndexCountFromApp.countBodyIndexFromApp();

        Assertions.assertEquals(index,index1);
    }
}
