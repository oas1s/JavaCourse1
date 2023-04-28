import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

public class MyTest {
    public static ApiJsonGetter apiJsonGetter;

    public static BodyIndexCountFromApp bodyIndexCountFromApp;

    @BeforeAll
    public static void init(){
        apiJsonGetter = Mockito.mock(ApiJsonGetter.class);
        bodyIndexCountFromApp = new BodyIndexCountFromApp("http://127.0.0.1:8080",new BodyIndexCounter(),
                apiJsonGetter);
    }

    @Test
    public void testBodyIndexCountFromAppMock() throws Exception{
        Mockito.when(apiJsonGetter.getJsonFromURL("http://127.0.0.1:8080"))
                .thenReturn("{\"name\":\"John\", \"age\":30, \"car\":null,\"height\":1.7,\"weight\":65.0}");

        Double d = bodyIndexCountFromApp.countBodyIndexFromApp();

        Mockito.verify(apiJsonGetter).getJsonFromURL("http://127.0.0.1:8080");
    }

    @Test
    public void testBodyIndexCountFromAppStub() throws Exception{
        Double index = 22.49134948096886;
        Mockito.when(apiJsonGetter.getJsonFromURL(any()))
                .thenReturn("{\"name\":\"John\", \"age\":30, \"car\":null,\"height\":1.7,\"weight\":65.0}");

        Double d = bodyIndexCountFromApp.countBodyIndexFromApp();

        Assertions.assertEquals(index,d);
    }
}
