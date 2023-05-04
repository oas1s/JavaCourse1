import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws Exception {
        MyClass myClass = new MyClass();
        Class clazz = MyClass.class;
        Class clazz2 = myClass.getClass();
//        Class clazz3 = ClassLoader.

        // constructors
        Constructor[] constructors =
                clazz.getDeclaredConstructors();

        for (Constructor c : constructors){
            Parameter[] parameters =
                    c.getParameters();
            for (Parameter p : parameters){
                System.out.println(p.getType().getName());
                System.out.println(p.getName());
            }
        }

        // methods
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods){
            Parameter[] parameters =
                    method.getParameters();
            for (Parameter p : parameters){
                System.out.println(p.getType().getName());
                System.out.println(p.getName());
            }
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType().getName());
        }

        //fields

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields){
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
        }

//         modifying examples

        Field field = clazz.getDeclaredField("number");
        field.setAccessible(true);
        field.set(myClass,23);
        System.out.println(myClass.getNumber());

        //invoke methods

        Method method = clazz.getDeclaredMethod("printData");
        method.setAccessible(true);
        method.invoke(myClass);

        // creating objects
//        Class[] params = {int.class, String.class};
//        Constructor constructor = clazz.getDeclaredConstructor(params);
//        constructor.setAccessible(true);
//        MyClass myClass = (MyClass) constructor.newInstance(1,"default");
//        System.out.println(myClass.getNumber());
    }
}
