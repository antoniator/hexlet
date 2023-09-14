package javaBasics.e61;

/*
Реализуйте статический метод App.hasChar(), который проверяет (с учётом регистра),
содержит ли строка указанную букву. Метод принимает два параметра:
Строка
Буква для поиска
 */

public class App {
    public static void main(String[] arg) {
        String text = "Renly";
        char ch = 'r';
        System.out.println(App.hasChar(text, ch));
    }

    public static boolean hasChar(String text, char ch) {
        int i = 0;

        while (i < text.length()) {
            if (text.charAt(i) == ch) {
                return true;
            } else {
                i += 1;
            }
        }
        return false;
    }
}
