import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMain {

    static class User{
        UserType userType;
        String name;
        Integer balance;

        public User(UserType userType, String name, Integer balance) {
            this.userType = userType;
            this.name = name;
            this.balance = balance;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userType=" + userType +
                    ", name='" + name + '\'' +
                    ", balance=" + balance +
                    '}';
        }

        public Integer getBalance() {
            return balance;
        }


        enum UserType {
            VIP, USUAL, CONFIDENTIAL
        }
    }
    /*
    filter
    sorted
    all match
    none match
    any match
    max
    min
    group
     */
    public static void main(String[] args) {
        // Java 11
        List<User> users = List.of(
                new User(User.UserType.VIP,"Kirill",10),
                new User(User.UserType.USUAL, "Danil", 2),
                new User(User.UserType.CONFIDENTIAL, "Artem",0),
                new User(User.UserType.USUAL, "Dima", 15),
                new User(User.UserType.USUAL, "Azat", 1),
                new User(User.UserType.VIP, "Timur", 20)
        );

        // usual way
        int count = 0;
        for (User user: users){
            if (user.userType.equals(User.UserType.VIP)){
                count += user.balance;
            }
        }
        System.out.println(count);


        // strem API
        users.stream()
                .filter(u -> u.userType.equals(User.UserType.VIP))
                .forEach(e -> System.out.println(e.balance));

        // filter
        User user1 = users.stream()
                .filter(u -> u.balance>10) //20
                .findFirst().orElseThrow(() ->{
                    System.out.println("exception");
                    throw new RuntimeException("some");
                });
        System.out.println(user1);

        // sort
        List<User> users1 = users.stream().sorted((x,y) -> x.balance.compareTo(y.balance)).toList();
        System.out.println(users1);

        // allMatch anyMatch noneMatch

        System.out.println(users.stream().allMatch(u -> u.balance>=0));
        System.out.println(users.stream().noneMatch(u -> u.name.equals("Egor")));
        System.out.println(users.stream().anyMatch(u -> u.name.equals("Dima")));

        // max min

        System.out.println(users.stream().max((x,y) -> x.balance.compareTo(y.balance)).get());
        System.out.println(users.stream().min((x,y) -> x.balance.compareTo(y.balance)).get());

        String s = null;

        // create list of balances
        List<Integer> balances = users.stream().map(u -> u.balance).collect(Collectors.toList());

        // limit
        balances.stream().limit(5);

        //group
        Map<User.UserType,List<User>> userTypeListMap = users.stream()
                .collect(Collectors.groupingBy(u -> u.userType));
        System.out.println("");
    }
}
