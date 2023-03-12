import java.util.Arrays;

public class LineRevers {
    //Напишите метод, который в качестве входящего параметра принимает строку
    // и выводит данную строку в консоль, но со словами, отображёнными в обратном порядке.
    //Пример: Входная строка - "I like Java"
    //Вывод в консоль - "I ekil avaJ"

    public static void main(String[] args) {

        String str = "I like Java";
        getReversLine(str);

    }

    public static void getReversLine(String str) {

        System.out.println("Исходная строка: __________ " + str);
        StringBuilder sortStr = new StringBuilder();

        String[] arrayStr = new StringBuilder(str).reverse().toString().split(" ");
        for (int i = arrayStr.length - 1; i >= 0; i--) {
            sortStr.append(arrayStr[i]).append(" ");
        }
        System.out.println("Преобразованная строка: ___ " + sortStr);

    }
}
