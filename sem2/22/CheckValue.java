import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckValue {
//    String value();
//    enum Status {CONFIRMED,FIXED}
    String[] ranges();
//    String something() default "something";
//    Class innerClass() default Void.class;
//    int i() default 1;
//    Status status() default Status.CONFIRMED;
//    String[] strings() default {};
}
