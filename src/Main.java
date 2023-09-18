import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Куросовая работа. Задачи");
        String palindrome = "Привет";
        char[] palinDrome = palindrome.toCharArray();
        char[] reverse = new char[palinDrome.length];
        for (int i = palinDrome.length - 1; i > -1; i = i - 1) {
            reverse[palinDrome.length - 1 - i] = palinDrome[i];
        }
        System.out.println(Arrays.toString(reverse));

    }
}
