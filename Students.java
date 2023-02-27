import java.util.Random;
import java.util.Scanner;

public class Students {

//    Напишите метод, который в качестве входящего параметра принимает количество студентов в классе
//    и возвращает случайно выбранный номер студента, начиная со второго.
//    Например, если мы передаём в метод, что в классе 18 студентов, то метод должен вернуть
//    случайное число из диапазона 2 - 18 (включительно).


    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        System.out.print("Enter the count of students__ ");
        int count = scannerIn.nextInt();

        System.out.println("Student number __ " + getNumberOfStudent(count));
    }

    public static int getNumberOfStudent(int count) {
        final Random random = new Random();

        int numberOfStudent = random.nextInt(2, ++count);

        return numberOfStudent;
    }
}
