public class Task {
    public static void main(String[] args) {
        Developer developer = new TeamLeadDeveloper(new SeniorDeveloper(new JuniorDeveloper()));

        System.out.println(developer.develop());
    }
}
