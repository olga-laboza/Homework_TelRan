public class OddNumbers {

    // 3. Вывести в консоль сумму всех нечётных чисел от 20 до 60 включительно.

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 20; i <= 60; i++) {

            if (i % 2 > 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the odd numbers [20;60] is __ " + sum);
    }

}

