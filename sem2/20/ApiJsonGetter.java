import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;
import java.net.URL;

@Data
@AllArgsConstructor
@Builder
public class ApiJsonGetter {

    public String getJsonFromURL(String url) throws Exception{
        InputStream inputStream = new URL(url)
                .openStream();
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        return new String(bytes);
    }
}
