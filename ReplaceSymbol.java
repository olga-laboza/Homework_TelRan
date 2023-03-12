import java.util.Arrays;

public class ReplaceSymbol {

//    Дан массив символов, объедините его в строку и замените символ '?' на правильный символ,
//    выведите результат на консоль.
//    char[] arr = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};
//    Попытайтесь решить данное задание двумя разными способами.

    public static void main(String[] args) {
        char[] array = {'I', ' ', 'l', 'i', 'k', '?', ' ', 'J', 'a', 'v', 'a'};

        getReplaceFirst(array);
        System.out.println("________________________");
        getReplaceSecond(array);
    }

    public static void getReplaceFirst(char[] array) {
        String arrayToStr = new String(array);
        String strRepl = arrayToStr.replace("?", "e");
        System.out.println("First method: __ " + strRepl);
    }

    public static void getReplaceSecond(char[] array) {
        String arrayToStr = String.copyValueOf(array);
        System.out.println("Second method: __ " + arrayToStr.replace("?", "e"));
    }
}
