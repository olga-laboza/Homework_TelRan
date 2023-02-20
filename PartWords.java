package homewor_4;

import java.util.Scanner;

//        Введите 2 слова с клавиатуры (используя объект класса Scanner), состоящие из четного количества букв.
//        Выведите в консоль слово, состоящее из первой половины первого слова и второй половины второго слова.

public class PartWords {
    public static void main(String[] args) {

        Scanner scannerIn = new Scanner(System.in);

        System.out.println("Введите первое слово с четным количеством букв: ");
        String firstWord = scannerIn.next();
        String firstPart = firstWord.substring(0, firstWord.length() / 2);

        System.out.println("Введите втрое слово с четным количеством букв: ");
        String secondWord = scannerIn.next();
        String secondPart = secondWord.substring(secondWord.length() / 2);

        System.out.println("Новое слово: " + firstPart + secondPart);


    }
}
