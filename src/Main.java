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

        System.out.println("____________");
        String string2 = "А роза упала на лапу Азора";
        string2 = string2.toLowerCase();
        string2 = string2.replace(" ", "");
        string2 = string2.replace("-", "");
        int temp = 0;
        for (int i = 0; i < string2.length(); i++) {
            char q = string2.charAt(i);
            char w = string2.charAt(string2.length() - i - 1);
            if (q != w) {
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка - не палиндром");
        }

    }
}
