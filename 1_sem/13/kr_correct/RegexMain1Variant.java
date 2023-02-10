package kr_correct;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain1Variant {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[02468]{3}");
        Matcher matcher = pattern.matcher("11112461");
        if (matcher.find()){
            System.out.println(matcher.start());
        }

        System.out.println("11112461".matches(".*[02468]{3}.*"));
    }
}
