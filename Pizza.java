package homewor_4;

//        Напишите программу,которая подсчитает,сколько дополнительных калорий будет,если вы купите
//        пиццу диаметром 28см вместо пиццы диаметром 24см.Будем считать,
//        что в каждом квадратном сантиметре пиццы содержится 40калорий.

public class Pizza {

    public static void main(String[] args) {

        int moreCalories = calcCalories();
        System.out.println("You will eat " + moreCalories + " calories more");
    }

    public static int calcCalories() {
        int d1 = 24;
        int d2 = 28;
        float pi = 3.14F;
        int calCm = 40;
        double s1 = pi / 4 * (d1 * d1);
        double s2 = pi / 4 * (d2 * d2);
        double moreCal = (s2 - s1) * calCm;
        return (int) moreCal;

    }
}
