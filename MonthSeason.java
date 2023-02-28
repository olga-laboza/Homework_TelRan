import java.util.Scanner;

public class MonthSeason {

//    1. Создайте целочисленную переменную, в которую можно записывать порядковый номер месяца.
//    Напишите программу, которая в зависимости от значения переменной выводит название этого месяца
//    и название времени года этого месяца.


    public static void main(String[] args) {

        Scanner scannerIn = new Scanner(System.in);
        System.out.print("Enter month number (1 .. 12)__ ");
        int numberMonth = scannerIn.nextInt();

           switch (numberMonth) {
            case 1:
                System.out.println("January - " + getSeason(numberMonth));
                break;
            case 2:
                System.out.println("February - " + getSeason(numberMonth));
                break;
            case 3:
                System.out.println("March - " + getSeason(numberMonth));
                break;
            case 4:
                System.out.println("April - " + getSeason(numberMonth));
                break;
            case 5:
                System.out.println("May - " + getSeason(numberMonth));
                break;
            case 6:
                System.out.println("June - ");
                break;
            case 7:
                System.out.println("July - " + getSeason(numberMonth));
                break;
            case 8:
                System.out.println("August - " + getSeason(numberMonth));
                break;
            case 9:
                System.out.println("September - " + getSeason(numberMonth));
                break;
            case 10:
                System.out.println("October - " + getSeason(numberMonth));
                break;
            case 11:
                System.out.println("November - " + getSeason(numberMonth));
            case 12:
                System.out.println("December - " + getSeason(numberMonth));
                break;
            default:
                System.out.println("You have entered the wrong number!");
                break;
        }

    }


    public static String getSeason(int month) {

        String season;

        if (month >= 3 && month < 6) {
            season = "Spring";
        } else if (month >= 6 && month < 9) {
            season = "Summer";
        } else if (month >= 9 && month < 12) {
            season = "Autumn";
        } else {
            season = "Winter";
        }
        return season;
    }

}
