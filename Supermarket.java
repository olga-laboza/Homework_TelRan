import java.util.Scanner;
import java.util.SortedMap;

public class Supermarket {

    //Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
    // Реализует логический метод canBuy,, возвращающий true ** Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
    // Отобразите строку «Я могу купить еду, это ……» и значение.


    public static void main(String[] args) {


        Scanner scannerIn = new Scanner(System.in);

        System.out.print("Edeka is open or close (enter 0 - close, 1 - open): ");
        int isEdekaOpen = scannerIn.nextInt();

        System.out.print("Rewe is open or close (enter 0 - close, 1 - open): ");
        int isReweOpen = scannerIn.nextInt();

        System.out.println("I can buy food, this is __ " + canBay(isEdekaOpen, isReweOpen));

    }

    public static boolean canBay(int close, int open) {

        if (close == 0 && open == 0) {
            return false;

        } else {
            return true;
        }
    }
}
