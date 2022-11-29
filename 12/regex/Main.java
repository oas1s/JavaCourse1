package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java is cool".matches(".*Java.*"));


        Pattern pattern = Pattern.compile("^Java.");
        Matcher matcher = pattern.matcher("Javan cool Javac");


        while (matcher.find()){
            System.out.println(matcher.start());
            System.out.println(matcher.group());
        }
        System.out.println(matcher.matches());
    }
}
