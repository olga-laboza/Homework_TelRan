import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseSorting {

//  1. Напишите метод, который принимает две строки в качестве входящих параметров,
//  объединяет их друг с другом и результат выводит в консоль в обратном порядке.

    public static void main(String[] args) {

        String str1 = "I study ";
        String str2 = "java";
        getReverseLine1(str1, str2);
        System.out.println("____________________________");
        getReverseLine2(str1, str2);

    }

    public static void getReverseLine1(String str1, String str2) {

        str2 = str1.concat(str2);
        System.out.println(str2);
        String revers = new StringBuilder(str2).reverse().toString();
        System.out.println(revers);
    }

    public static void getReverseLine2(String str1, String str2) {

        String strConcat = str1.concat(str2);  //склелили строку
        System.out.println(strConcat);
        String[] strToArray = strConcat.split(" ");   //преобраз строку в массив иразделили эл-ты пробелами

        int len = strToArray.length;
        String temp;
        for (int i = 0; i < strToArray.length / 2; i++) {
            temp = strToArray[len - i - 1];
            strToArray[len - i - 1] = strToArray[i];
            strToArray[i] = temp;
        }
        String result = String.join(" ", strToArray);
        System.out.println(result);

    }


}
