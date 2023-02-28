import java.util.Random;

public class MaximalFigure {

//    Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число
//    и его наибольшую цифру. Например: Случайное число - 682, его наибольшая цифра - 8.


    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100,1000);

        System.out.println("Your number is__ " + number);

        int n1 = number/100;
        int n2 = (number/10)%10;
        int n3 = number%10;

        int max = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

       // int max1 = Math.max(n1, Math.max (n2, n3));

        System.out.println("Max figure from your number is__ " + max);

    }

}
