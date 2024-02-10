package ru.itis;

import lombok.SneakyThrows;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App
{
    private static SingleOperationCalculator singleOperationCalculator;

    public static void main( String[] args )
    {
        dependencyInjectionContainerStart();
        System.out.println(singleOperationCalculator.calculate(1.0,2.0));
    }

    @SneakyThrows
    public static void dependencyInjectionContainerStart(){
        //getting all classes in our project
        Reflections reflections = new Reflections("ru.itis", new SubTypesScanner(false));
        Set<Class<?>> allClasses =
                reflections.getSubTypesOf(Object.class);

        Map<String,Object> map = new HashMap<>();

        // find candidates for injection in another classes
        for (Class c : allClasses) {
            for (Field field : c.getDeclaredFields()) {
                    field.setAccessible(true);
                    if (field.getType().isInterface()) {
                        Class cls = allClasses.stream().filter(cc -> field.getType().isAssignableFrom(cc) && !field.getType().equals(cc)).findFirst().get();
                        try {
                            Object o = cls.newInstance();
                            Object o1 = c.newInstance();
                            field.set(o1, o);
                            map.put(c.getName(), o1);
                        } catch (InstantiationException e) {
                            throw new RuntimeException(e);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                }
            }
        }

        for (Class c : allClasses) {
            for (Field field : c.getDeclaredFields()) {
                if (map.containsKey(field.getType().getName())) {
                    field.setAccessible(true);
                    try {
                        field.set(c, map.get(field.getType().getName()));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
