
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<User> users = Arrays.asList(mapper.readValue(new File("task.json"), User[].class));

        users.forEach(user -> {
            List<User> followsUsers = users.stream()
                    .filter(u -> user.getFollows().contains(u.getId()))
                    .map(u -> new User(u.getId(), u.getName(), u.getCountry()))
                    .collect(Collectors.toList());
            user.setFollowsUser(followsUsers);
        });

        users.stream()
                .collect(Collectors.groupingBy(User::getCountry))
                .values().stream()
                .forEach(countryUsers -> {
                    countryUsers.stream()
                            .limit(2)
                            .forEach(System.out::println);
                });
        System.out.println("----------------------------");
        for (User user : users) {
            System.out.println(user);
        }
        Writer writer = new FileWriter("result.txt");
        for (User user : users) {
            writer.write(user.getId() + " " + user.getName() + " follows ");
            List<User> followsUsers = user.getFollowsUser();
            for (int i = 0; i < followsUsers.size(); i++) {
                User followsUser = followsUsers.get(i);
                writer.write(followsUser.getId() + " " + followsUser.getName());
                if (i < followsUsers.size() - 1) {
                    writer.write(" and ");
                }
            }
            writer.write("\n");

        }
        writer.close();

    }
}