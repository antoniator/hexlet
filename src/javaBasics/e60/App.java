package javaBasics.e60;

public class App {
    public static void main(String[] arg) {
        var text = "I never look back";
        var n = 3;
        System.out.println(App.makeItFunny(text, n));
    }

    public static String makeItFunny(String str, int n) {
        int i = 0;
        String result = "";

        if (n == 0) {
            return str;
        }

        while (i < str.length()) {
            if ((i + 1) % n == 0) {
                result = result + Character.toUpperCase(str.charAt(i));
            } else {
                result = result + str.charAt(i);
            }
            i++;
        }

        return result;
    }
}
