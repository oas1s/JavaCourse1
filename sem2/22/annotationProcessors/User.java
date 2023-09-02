package annotationProcessors;

@MyAnnotation
public class User {
    private static String s = "default";

    public String getS() {
        return s;
    }
}
