public class MainSplit {
    public static void main(String[] args) {
        String s = "Azat,22,72,11-251,1";
        String[] strings = s.split(",");
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }
    }
}
