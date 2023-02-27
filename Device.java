import java.util.Scanner;

public class Device {

    //Представим, что у нас есть устройство, в котором две колбы.
    // Прибор работает корректно, если температура первой колбы выше 100 градусов,
    // а температура второй колбы меньше 100 градусов. Вы должны написать метод,
    // который проверяет это устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2.
    // В результате он выводит сообщение true или false.

    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);

        System.out.print("Enter the first temperature:__ ");
        int temperature1 = scannerIn.nextInt();
        System.out.print("Enter the second temperature:__ ");
        int temperature2 = scannerIn.nextInt();

        System.out.println("Device working __" + getCorrect(temperature1, temperature2));

    }

    public static boolean getCorrect (int t1, int t2 ) {
        if (t1 > 100 && t2 < 100) {
            return true;
        } else {
            return false;
        }
    }
}
