import java.util.Scanner;

public class SumOfNumbers {

//    Пользователь вводит с клавиатуры трёхзначное число. Напишите программу,
//    которая считает сумму всех цифр этого числа и выводит её в консоль.

    public static void main(String[] args) {

        Scanner scannerIn = new Scanner(System.in);

        System.out.print("Enter any three-digit number__ ");

        int number = scannerIn.nextInt();
        int n1 = number/100;
        int n2 = (number/10)%10;
        int n3 = number%10;

        if (99 < number && number < 1000) {
            System.out.println("Sum of digits of the number is__ " + (n1+n2+n3));
        }
        else {
            System.out.println("Error! Wrong number!");
        }
    }
}
