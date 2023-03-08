public class MissingNumber {
//    Задача 1.
//    Дана целочисленная переменная а.
//    Дан массив целых чисел длиной на 1 меньше, чем значение переменной а.
//    Массив содержит все числа из диапазона от 1 до а.
//    Числа внутри массива не могут повторяться. При этом одно число обязательно окажется пропущенным,
//    т.к. длина массива на 1 меньше, чем количество чисел в заданном диапазоне.
//    Напишите программу, которая вычисляет это пропущенное число.
//
//    Пример:
//    Переменная a = 5;
//    Массив int[] array = {1, 2, 3, 5}; (длина массива равна a-1, числа внутри не повторяются, пропущено число 4).
//    Ответ: 4.
//    Программа должна быть универсальной, то есть одинаково корректно работать с любыми данными, удовлетворяющими условию задачи.

    public static void main(String[] args) {

        int a = 5;
        int[] array = {1, 2, 3, 5};

        if (array.length != a - 1) {
            System.out.println("Error! ");
        } else {
            System.out.println("The missing number in the array __ " + getMissingNumber(array, a));
        }
    }

    public static int getMissingNumber(int array[], int a) {

        int sumNumbers = a * (a + 1) / 2;
        int sumArrays=0;

        for (int i = 0; i < array.length; i++) {
            sumArrays += array[i];
        }
        return sumNumbers - sumArrays;
    }
}



