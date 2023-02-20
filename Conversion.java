package homewor_4;

//Напишите метод, который конвертирует указанную сумму в евро в сумму в долларах США.

import java.util.Scanner;

public class Conversion {

    static Scanner scannerIn = new Scanner(System.in);

    public static void main(String[] args) {
    double amountUSD = convToUsd();
    System.out.println("Your amount : " + amountUSD + " USD");

    }

    public static double convToUsd() {
        System.out.println("Enter amount Euro: ");
        double rate = 1.068;
        double amEuro = scannerIn.nextDouble();
        double amUSD = amEuro*rate;
        return (double) amUSD;
    }

}
