import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Sem1 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        if(hour > 5 && hour < 12) System.out.println("Good morning " + name);
        else if(hour < 18) System.out.println("Good afternoon " + name);
        else System.out.println("Good night " + name);
    }


// Текст задачи:
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

static void task0() {
    int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};
    int count = 0;
    int maxOnes = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1) {
            count++;
        } else {
            if (maxOnes < count) maxOnes = count;
            count = 0;
        }
    }
    if (maxOnes < count) maxOnes = count;
    System.out.println(maxOnes);
}

//Текст задачи:
//Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

    static void task1() {
        int[] nums = {3, 2, 2, 1, 2, 1, 3, 1, 3, 3};//[3,3,3,3]
        int val = 2;
        int current = 0;
        int[] tempArr = new int[nums.length];
        Arrays.fill(tempArr, val);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tempArr[current++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(tempArr));
    }


//Текст задачи:
//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке
    static String task2(String str){
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        return Arrays.toString(words);
}
//📔 **Текст задачи:**
//    Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//    Пример 1: а = 3, b = 2, ответ: 9
//    Пример 2: а = 2, b = -2, ответ: 0.25
//    Пример 3: а = 3, b = 0, ответ:
static double num(int a, int b){
    double result = 1;
    if(b == 0){

        return 1;
    }else  {
        for (int i = 1; i <= Math.abs(b); i++)
        {
            result*=a ;
        }
        if(b > 0)
            return result;
        else return 1/result;
    }

}

}