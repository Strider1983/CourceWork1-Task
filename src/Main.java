import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Куросовая работа. Задача");
        String string = "А в Енисее - синева";
        String palindrome = string.toLowerCase();
        palindrome = palindrome.replace(" ", "");
        palindrome = palindrome.replace("-", "");
        char[] palinDrome = palindrome.toCharArray();
        char[] reverse = new char[palinDrome.length];
        for (int i = palinDrome.length - 1; i > -1; i = i - 1) {
            reverse[palinDrome.length - 1 - i] = palinDrome[i];
        }
        if (Arrays.equals(palinDrome, reverse)) {
            System.out.println("Строка '" + string + "' - является палиндромом");
        } else {
            System.out.println("Строка '" + string + " - не палиндром");
        }

    }
}
