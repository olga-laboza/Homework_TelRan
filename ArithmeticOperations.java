package homewor_4;

//        Напишите программу, которая выводит на экран результаты
//        сложения, вычитания, умножения и деления двух чисел.
//        Каждая из арифметических операций должна быть реализована как отдельный метод.

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) {

        Scanner scannerIn = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double number1 = scannerIn.nextDouble();

        System.out.println("Enter second number: ");
        double number2 = scannerIn.nextDouble();


        System.out.println("Result of addition " + add(number1,number2));
        System.out.println("Result of subtraction " + sub(number1,number2));
        System.out.println("Result of multiplication " + mult(number1,number2));
        System.out.println("Result of division " + div(number1,number2));


    }

    public static double add(double a, double b) {

        double add = a + b;
        return add;
    }

    public static double sub(double a, double b) {

        double sub = a - b;
        return sub;
    }

    public static double mult(double a, double b) {

        double mult = a * b;
        return mult;
    }

    public static String div(double a, double b) {

        double div = a / b;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(div);
        return result;
    }

}
