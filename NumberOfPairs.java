public class NumberOfPairs {

    //Дан массив из N целых чисел и целое число  K , найдите количество пар элементов в массиве, сумма которых равна K.
    //Пример 1:
    //Вход:
    //N = 4, K = 6
    //arr[] = {1, 5, 7, 1}
    //Вывод: 2


    public static void main(String[] args) {
        int k = 4;
        int[] array = {1, 2, 2, 4, 1, 5, 3};
        System.out.println("Number of element pairs __ " + getNumberOfPairs(array, k));
    }

    public static int getNumberOfPairs(int array[], int number) {
        System.out.println("Pairs of elements and their sum : ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    System.out.println(array[i] + " + " + array[j] + " =  " + number);
                    count++;
                }
            }
        }
        return count;
    }
}

