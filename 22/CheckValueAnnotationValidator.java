import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

//    public static boolean isValid(Class clazz, Object object) throws Exception{
//        List<Field> fieldList = new ArrayList<>(List.of(clazz.getDeclaredFields()));
//        List<Field> neededFields = new ArrayList<>();
//        for (Field field : fieldList){
//            List<Annotation> annotations = List.of(field.getAnnotations());
//            if(annotations.stream().anyMatch(a -> a.annotationType().equals(CheckValue.class))){
//                neededFields.add(field);
//            }
//        }
//        for (Field field : neededFields){
//            field.setAccessible(true);
//            CheckValue checkValue = field.getAnnotation(CheckValue.class);
//            List<String> strings = List.of(checkValue.ranges());
//            String value = (String) field.get(object);
//            if (!strings.contains(value)) return false;
//        }
//        return true;
//    }
}
