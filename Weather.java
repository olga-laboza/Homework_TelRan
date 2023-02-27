import java.util.Scanner;

public class Weather {

    //  Создайте две переменные isWeekend и isRain.
    //  Создайте переменную canWalk, значение которой должно быть истинным, если это выходной день (isWeekend=true) и не идет дождь (isRain=false).

    public static void main(String[] args) {


        int isWeekend = 6;          // enter number 1 .. 7
        char isRain = 'n';          // enter y or n
        boolean canWalk;

        if (isWeekend > 5 && isRain == 'n') {
            canWalk = true;
            System.out.println("You can go for a walk - " + canWalk);
        } else {
            System.out.println("Stay at home");
        }

    }

}
