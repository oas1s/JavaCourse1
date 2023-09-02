import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class Fix403Main {
    public static void main(String[] args) throws Exception {
        URLConnection urlConnection = new URL("http://l92167fj.beget.tech").openConnection();
        urlConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
        InputStream inputStream = urlConnection.getInputStream();
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        String json = new String(bytes);
        List<User> myObjects = new ObjectMapper().readValue(json, new TypeReference<List<User>>(){});
        System.out.println(myObjects);
        System.out.println(myObjects.stream().filter(u -> u.friends.size()>3).filter(u -> u.favoriteFruit.equals("banana")).findFirst().get());
    }
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class User{
        private String name;
        private String favoriteFruit;
        private List<UserFriend> friends;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class UserFriend {
        private String name;
    }
}
