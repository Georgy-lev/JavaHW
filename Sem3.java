import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Sem3 {
    static void main(String[] args) {
        task3();
    }

    static void task0() {
//📔 **Текст задачи:**
//        Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
//
//        String s1 = "hello";
//
//        String s2 = "hello";
//
//        String s3 = s1;
//
//        String s4 = "h" + "e" + "l" + "l" + "o";
//
//        String s5 = new String("hello");
//
//        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        String s1 = "hello";

        String s2 = "hello";

        String s3 = s1;

        String s4 = "h" + "e" + "l" + "l" + "o";

        String s5 = new String("hello");

        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));

    }

    //    Текст задачи:
//    Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
    static void task1() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        Collections.sort(list);
        System.out.println(list);
    }

//    Текст задачи:
//    Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//    Пройти по списку, найти и удалить целые числа.

    static void task2() {
        ArrayList list = new ArrayList<>();
        list.add("sdasdsd");
        list.add(12);
        list.add(24);
        list.add(453);
        list.add("cdsdfddf");
        list.add(566.21);
        Iterator iteratorList = list.iterator();
        while (iteratorList.hasNext()) {
            if (iteratorList.next() instanceof String) {
                iteratorList.remove();
            }
        }
        System.out.println(list);
    }
}