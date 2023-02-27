import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;
/*
boolean add(T elem) - добавляет элемент в конец списка.
boolean addAll(MyLinkedList<T> otherList) - метод который добавляет в текущий лист все элементы переданного листа
void clear() - метод очищающий весь список
boolean contains(T s) - метод возвращает true если список содержит объект s
boolean containsAll(MyLinkedList<T> otherList) - возвращает true если все элементы otherList’a входят в текущий лист
boolean isEmpty() - возвращает true если лист пустой
int indexOf(Т s) - возвращает индекс объекта s в массиве(если таких несколько то первое вхождение)
Т remove(int index) - удаляет элемент находящийся на позиции index и возвращает его
boolean remove(Т s) - удаляет первый встречающийся элемент s в списке
boolean removeAll(MyLinkedList<T> otherList) - удаляет все объекты, содержащиеся в otherList, в текущем листе
T set(int index, T elem) - заменяет элемент индекса index элементом elem. Метод возвращает элемент, который стоял на этом месте до.
Object[] toArray() - возвращает элементы списка в виде массива
int lastIndexOf(T elem) - то же самое что и indexOf только если таких элементов несколько последнее вхождение.
MyLinkedList<T> sublist(int fromIndex, int toIndex) - возвращает саблист с индексов [fromIndex;toIndex)
переопределить toString() и equals
void sort(Comparator<? super T> c) - сортирует список
 */
public class MyLinkedListTest {

    static class TestClass {
        public Integer id;
        public String name;
        public Integer age;

        public TestClass() {
        }

        public TestClass(Integer id, String name, Integer age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestClass testClass = (TestClass) o;
            return Objects.equals(id, testClass.id) && Objects.equals(name, testClass.name) && Objects.equals(age, testClass.age);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, age);
        }
    }



    @Test
    public void testAdd() {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        assertEquals(3, linkedList.size());
        assertEquals(3, linkedList.get(0));
        assertEquals(4, linkedList.get(1));
        assertEquals(5, linkedList.get(2));

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);

        assertEquals(3, myLinkedList.size());
        assertEquals(testClass, myLinkedList.get(0));
        assertEquals(testClass2, myLinkedList.get(1));
        assertEquals(testClass3, myLinkedList.get(2));
    }

    @Test
    public void testAddAll() {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        MyLinkedList<Integer> linkedList2 = new MyLinkedList<>();
        linkedList2.add(4);
        linkedList2.add(5);
        linkedList2.add(6);

        linkedList.addAll(linkedList2);
        assertEquals(6, linkedList.size());
        assertEquals(3, linkedList.get(0));
        assertEquals(4, linkedList.get(1));
        assertEquals(5, linkedList.get(2));
        assertEquals(4, linkedList.get(3));
        assertEquals(5, linkedList.get(4));
        assertEquals(6, linkedList.get(5));

        TestClass testClass = new TestClass(1,"Azat",22);
        TestClass testClass2 = new TestClass(2,"Artem",23);
        TestClass testClass3 = new TestClass(3,"Danil",18);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);

        TestClass testClass4 = new TestClass(1,"Azat",22);
        TestClass testClass5 = new TestClass(2,"Artem",23);

        MyLinkedList<TestClass> myLinkedList2 = new MyLinkedList<>();
        myLinkedList2.add(testClass4);
        myLinkedList2.add(testClass5);

        myLinkedList.addAll(myLinkedList2);

        assertEquals(5,myLinkedList.size());
        assertEquals(testClass,myLinkedList.get(0));
        assertEquals(testClass2,myLinkedList.get(1));
        assertEquals(testClass3,myLinkedList.get(2));
        assertEquals(testClass4,myLinkedList.get(3));
        assertEquals(testClass5,myLinkedList.get(4));
    }

    @Test
    public void testClear() {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        linkedList.clear();

        assertEquals(0,linkedList.size());
        assertTrue(linkedList.isEmpty());

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);

        myLinkedList.clear();

        assertEquals(0,myLinkedList.size());
        assertTrue(myLinkedList.isEmpty());
    }

    @Test
    public void testContains() {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        assertTrue(linkedList.contains(3));
        assertTrue(linkedList.contains(4));
        assertTrue(linkedList.contains(5));
        assertFalse(linkedList.contains(1));
        assertFalse(linkedList.contains(2));
        assertFalse(linkedList.contains(6));


        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);

        assertTrue(myLinkedList.contains(new TestClass(1, "Azat", 22)));
        assertTrue(myLinkedList.contains(new TestClass(2, "Artem", 23)));
        assertTrue(myLinkedList.contains(new TestClass(3, "Danil", 18)));

    }

    @Test
    public void testContainsAll() {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        MyLinkedList<Integer> linkedList2 = new MyLinkedList<>();
        linkedList2.add(4);
        linkedList2.add(5);

        assertTrue(linkedList.containsAll(linkedList2));

        TestClass testClass = new TestClass(1,"Azat",22);
        TestClass testClass2 = new TestClass(2,"Artem",23);
        TestClass testClass3 = new TestClass(3,"Danil",18);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);

        TestClass testClass4 = new TestClass(1,"Azat",22);
        TestClass testClass5 = new TestClass(2,"Artem",23);

        MyLinkedList<TestClass> myLinkedList2 = new MyLinkedList<>();
        myLinkedList2.add(testClass4);
        myLinkedList2.add(testClass5);

        assertTrue(myLinkedList.containsAll(myLinkedList2));

    }

    @Test
    public void testIsEmpty(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);

        linkedList.clear();
        myLinkedList.clear();

        assertTrue(linkedList.isEmpty());
        assertTrue(myLinkedList.isEmpty());
    }

    @Test
    public void testIndexOf(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);
        TestClass testClass4 = new TestClass(2, "Artem", 23);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);
        myLinkedList.add(testClass4);

        assertEquals(1,linkedList.indexOf(4));
        assertEquals(-1,linkedList.indexOf(10));
        assertEquals(1,myLinkedList.indexOf(new TestClass(2, "Artem", 23)));
        assertEquals(-1,myLinkedList.indexOf(new TestClass(1,"Some",33)));
    }

    @Test
    public void testRemove(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);
        TestClass testClass4 = new TestClass(2, "Artem", 23);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);
        myLinkedList.add(testClass4);

        linkedList.remove(0);
        assertEquals(3,linkedList.size());
        assertEquals(4,linkedList.get(0));
        assertEquals(5,linkedList.get(1));
        assertEquals(4,linkedList.get(2));

        myLinkedList.remove(0);
        assertEquals(3,myLinkedList.size());
        assertEquals(new TestClass(2, "Artem", 23),myLinkedList.get(0));
        assertEquals(new TestClass(3, "Danil", 18),myLinkedList.get(1));
        assertEquals(new TestClass(2, "Artem", 23),myLinkedList.get(2));
    }

    @Test
    public void testRemove2(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);
        TestClass testClass4 = new TestClass(2, "Artem", 23);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);
        myLinkedList.add(testClass4);

        linkedList.remove(Integer.valueOf(4));
        assertEquals(3,linkedList.size());
        assertEquals(3,linkedList.get(0));
        assertEquals(5,linkedList.get(1));
        assertEquals(4,linkedList.get(2));

        myLinkedList.remove(new TestClass(2, "Artem", 23));
        assertEquals(3,myLinkedList.size());
        assertEquals(new TestClass(1, "Azat", 22),myLinkedList.get(0));
        assertEquals(new TestClass(3, "Danil", 18),myLinkedList.get(1));
        assertEquals(new TestClass(2, "Artem", 23),myLinkedList.get(2));
    }

    @Test
    public void testRemoveAll(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);

        MyLinkedList<Integer> linkedList1 = new MyLinkedList<>();
        linkedList1.add(3);
        linkedList1.add(4);

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);
        TestClass testClass4 = new TestClass(2, "Artem", 23);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);
        myLinkedList.add(testClass4);

        MyLinkedList<TestClass> myLinkedList1 = new MyLinkedList<>();
        myLinkedList1.add(new TestClass(1, "Azat", 22));
        myLinkedList1.add(new TestClass(2, "Artem", 23));

        linkedList.removeAll(linkedList1);
        myLinkedList.removeAll(myLinkedList1);

        assertEquals(1,linkedList.size());
        assertEquals(1,myLinkedList.size());
        assertEquals(5,linkedList.get(0));
        assertEquals(new TestClass(3, "Danil", 18),myLinkedList.get(0));

        assertEquals(new TestClass(1, "Azat", 22),myLinkedList.get(0));
        assertEquals(new TestClass(2, "Artem", 23),myLinkedList.get(1));
        assertEquals(new TestClass(3, "Danil", 18),myLinkedList.get(2));
        assertEquals(new TestClass(2, "Artem", 23),myLinkedList.get(3));
        assertEquals(new TestClass(4,"Kirill",33),myLinkedList.get(4));
        assertEquals(new TestClass(5,"Anton",34),myLinkedList.get(5));

    }

    @Test
    public void testSet(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);
        TestClass testClass4 = new TestClass(2, "Artem", 23);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);
        myLinkedList.add(testClass4);

        Integer integer = linkedList.set(2,4);
        TestClass testClass1 = myLinkedList.set(3,new TestClass());

        assertEquals(4,linkedList.size());
        assertEquals(4,myLinkedList.size());
        assertEquals(5,integer);
        assertEquals(new TestClass(2, "Artem", 23),testClass1);
        assertEquals(new TestClass(),myLinkedList.get(3));
        assertEquals(4,linkedList.get(2));
    }

    @Test
    public void testToArray(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);
        TestClass testClass4 = new TestClass(2, "Artem", 23);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);
        myLinkedList.add(testClass4);

        Object[] integers = linkedList.toArray();
        for (int i = 0; i <integers.length ; i++) {
            assertEquals((Integer) integers[i],linkedList.get(i));
        }

        Object[] testClasses = myLinkedList.toArray();
        for (int i = 0; i < testClasses.length; i++) {
            assertEquals((TestClass) testClasses[i],myLinkedList.get(i));
        }
    }

    @Test
    public void testLastIndexOf(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);
        TestClass testClass4 = new TestClass(2, "Artem", 23);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);
        myLinkedList.add(testClass4);

        int a = linkedList.lastIndexOf(4);
        int b = myLinkedList.lastIndexOf(new TestClass(2, "Artem", 23));

        assertEquals(3,a);
        assertEquals(3,b);
    }

    @Test
    public void testSubList(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);
        TestClass testClass4 = new TestClass(2, "Artem", 23);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);
        myLinkedList.add(testClass4);

        MyLinkedList<Integer> linkedList1 = linkedList.sublist(1,3);
        MyLinkedList<TestClass> myLinkedList1 = myLinkedList.sublist(1,3);

        assertEquals(2,linkedList1.size());
        assertEquals(2,myLinkedList1.size());
        assertEquals(4,linkedList1.get(0));
        assertEquals(5,linkedList1.get(1));
        assertEquals(new TestClass(2, "Artem", 23),myLinkedList1.get(0));
        assertEquals(new TestClass(3, "Danil", 18),myLinkedList1.get(1));
    }

    @Test
    public void testSort(){
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(4);

        TestClass testClass = new TestClass(1, "Azat", 22);
        TestClass testClass2 = new TestClass(2, "Artem", 23);
        TestClass testClass3 = new TestClass(3, "Danil", 18);
        TestClass testClass4 = new TestClass(2, "Artem", 23);

        MyLinkedList<TestClass> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(testClass);
        myLinkedList.add(testClass2);
        myLinkedList.add(testClass3);
        myLinkedList.add(testClass4);

        Comparator<Integer> comparator = Integer::compareTo;
        Comparator<TestClass> comparator1 = (x,y) -> x.age.compareTo(y.age);
        Comparator<TestClass> comparator2 = (x,y) -> x.id.compareTo(y.id);

        linkedList.sort(comparator);

        assertEquals(4,linkedList.size());
        assertEquals(4,myLinkedList.size());

        assertEquals(3,linkedList.get(0));
        assertEquals(4,linkedList.get(1));
        assertEquals(4,linkedList.get(2));
        assertEquals(5,linkedList.get(3));

        myLinkedList.sort(comparator2);

        assertEquals(new TestClass(1, "Azat", 22),myLinkedList.get(0));
        assertEquals(new TestClass(2, "Artem", 23),myLinkedList.get(1));
        assertEquals(new TestClass(2, "Artem", 23),myLinkedList.get(2));
        assertEquals(new TestClass(3, "Danil", 18),myLinkedList.get(3));

        myLinkedList.sort(comparator1);

        assertEquals(new TestClass(3, "Danil", 18),myLinkedList.get(0));
        assertEquals(new TestClass(1, "Azat", 22),myLinkedList.get(1));
        assertEquals(new TestClass(2, "Artem", 23),myLinkedList.get(2));
        assertEquals(new TestClass(2, "Artem", 23),myLinkedList.get(3));
    }

}
