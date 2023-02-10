package Homework_2_10_02;

public class HWPart_2 {

    public static void main(String[] args) {

       int number = 365;
       int e = number % 10;
       int d = number / 10 % 10;
       int s = number / 100;

        System.out.println("Заданное число " + number);
        System.out.println(s);
        System.out.println(d);
        System.out.println(e);


    }
}
