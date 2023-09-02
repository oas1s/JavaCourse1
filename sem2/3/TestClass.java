//public class TestClass<T> {
//
//   private T value1;
//   private T value2;
//
//   public void printValues() {
//       System.out.println(value1);
//       System.out.println(value2);
//   }
//
//   public static <T> TestClass<T> createAndAdd2Values(Object o1, Object o2) {
//       TestClass<T> result = new TestClass<>();
//       result.value1 = (T) o1;
//       result.value2 = (T) o2;
//       return result;
//   }
//
//   public static void main(String[] args) {
//       Double d = 22.111;
//       String s = "Test String";
//       TestClass<Integer> test = createAndAdd2Values(d, s);
//       test.printValues();
//   }
//}

public class TestClass<T> {

    Class<T> typeParameterClass;

    public TestClass(Class<T> typeParameterClass) {
        this.typeParameterClass = typeParameterClass;
    }

    public T createNewT() throws IllegalAccessException, InstantiationException {
        T t = typeParameterClass.newInstance();
        return t;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        TestClass<MySecretClass> testString = new TestClass<>(MySecretClass.class);
        MySecretClass secret = testString.createNewT();

    }
}

class MySecretClass {

    public MySecretClass() {

        System.out.println("Объект секретного класса успешно создан!");
    }
}