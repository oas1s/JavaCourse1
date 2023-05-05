import lombok.SneakyThrows;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class CheckValueAnnotationValidator {

    public static boolean isValid(Class clazz, Object object) throws Exception{
        Field[] fields = clazz.getDeclaredFields();
        Field field = fields[0];
        field.setAccessible(true);
        CheckValue checkValue = field.getAnnotation(CheckValue.class);
        int[] range = checkValue.ranges();
        int value = field.getInt(object);
        return  (value>= range[0] && value<=range[1]);
    }
}
