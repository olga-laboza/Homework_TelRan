package string;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String str = new String("\tI study Basic Java");
        System.out.println(str);
        System.out.println("Last character of the string: " + str.charAt(18));
        System.out.println("This string contain Java: " + str.contains("Java"));
        System.out.println("Change letters: " + str.replace('a', 'o'));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str.substring(15, 19));

    }
}
