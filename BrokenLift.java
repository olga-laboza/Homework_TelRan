import java.util.Scanner;

public class BrokenLift {

//    Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан.
//    Каждый раз он поднимается на 50 этажей и спускается на M этажей.
//    Если на последнем подьеме лифт превысил количество этажей, то считается что лифт поднялся на самый верх.
//    Найдите количество подьемов, которые понадобятся лифту.
//
//    Пример начальных данных:
//    H = 200, N = 50, M = 1
//    Ответ: 5
//    Объяснение:
//    Первый подьем: 50 - 1 = 49
//    Второй подьем: 49 + 50 - 1 = 98
//    Третий подьем: 98 + 50 - 1 = 147
//    Четвертый подьем: 147 + 50 - 1 = 196
//    Пятый подьем: выйти за пределы H.
//
//
//    Реализовать метод numberOfLifts(int floors, int stepUp, int stepDown)
//    Метод должен быть универсальным, то есть корректно работать с любым набором входных данных.


    public static void main(String[] args) {
        Scanner scannerIn = new Scanner(System.in);
        System.out.print("Enter the count of floors__ ");
        int floors = scannerIn.nextInt();
        System.out.print("Enter the count of steps up__ ");
        int stepUp = scannerIn.nextInt();
        System.out.print("Enter the count of steps down__ ");
        int stepDown = scannerIn.nextInt();

        System.out.println("The number of lifts to floor " + floors +
                " is " + numberOfLifts(floors, stepUp, stepDown));

    }


    public static int numberOfLifts(int floors, int stepUp, int stepDown) {


        int result = 0;
        int iteration = 0;
        while (result <= floors) {

            result += (stepUp - stepDown);
            iteration++;
        }
        return iteration;
    }
}
