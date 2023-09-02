
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private int id;
    private String name;
    private String country;
    private List<Integer> follows;
    private List<User> followsUser;

    public User(int id, String name, String country, List<Integer> follows, List<User> followsUser) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.follows = follows;
        this.followsUser = followsUser;
    }

    public User() {
    }

    public User(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public List<Integer> getFollows() {
        return follows;
    }

    public void setFollows(List<Integer> follows) {
        this.follows = follows;
    }

    public List<User> getFollowsUser() {
        return followsUser;
    }

    public void setFollowsUser(List<User> followsUser) {
        this.followsUser = followsUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", follows=" + follows +
                ", followsUser=" + followsUser +
                '}';
    }
}