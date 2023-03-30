import lombok.*;

public class Main {
    public static void main(String[] args) {
//        User user = new User(1,"John",45,
//                "male","Antony");
        // неверно т.к null указывать плохо
//        User user1 = new User(1,"Artem",19,"male",
//                null);

//        User user1 = new User(2,"Artem",19,"male");

//        User user2 = new User(3,"Dima",null,"male");

        User user1 = User.builder().id(1).name("John").age(45)
                .sex("male").middleName("Antony")
                .build();

        User user2 = User.builder().id(2).name("Artem").sex("male").age(19).build();

        User user3 = User.builder().name("Dima").id(3).sex("male").build();

        System.out.println(user1);
        System.out.println(user2);

        System.out.println(user3);

        User2 user22 = User2.builder().build();
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    static class User2 {
        private Integer id;
        private String name;
        private Integer age;
        private String sex;
        private String middleName;

    }


    static class User {
        private Integer id;
        private String name;
        private Integer age;
        private String sex;
        private String middleName;

        public User(Integer id, String name, Integer age, String sex, String middleName) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.middleName = middleName;
        }

        public User() {
        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", sex='" + sex + '\'' +
                    ", middleName='" + middleName + '\'' +
                    '}';
        }

        static class UserBuilder {
            private Integer id;
            private String name;
            private Integer age;
            private String sex;
            private String middleName;


            public UserBuilder id(Integer id) {
                this.id = id;
                return this;
            }

            public UserBuilder age(Integer age){
                this.age = age;
                return this;
            }

            public UserBuilder name(String name){
                this.name = name;
                return this;
            }

            public UserBuilder sex(String sex){
                this.sex = sex;
                return this;
            }

            public UserBuilder middleName(String middleName){
                this.middleName = middleName;
                return this;
            }

            public User build(){
                return new User(this.id,this.name,this.age,this.sex,this.middleName);
            }
        }
//
//        public User(Integer id, String name, Integer age, String sex) {
//            this.id = id;
//            this.name = name;
//            this.age = age;
//            this.sex = sex;
//        }
//
//        public User(Integer id, String name, String sex) {
//            this.id = id;
//            this.name = name;
//            this.sex = sex;
//        }
    }
}
