package javaBasics.e58;

public class App {
    public static void main(String[] args) {
        String str = "Hexlet";
        System.out.println(App.reverse(str));
    }

    public static String reverse(String str) {
        int i = str.length() - 1;
        String result = "";

        while (i >= 0) {
            result = result + str.charAt(i);
            i = i - 1;
        }

        return result;
    }
}
