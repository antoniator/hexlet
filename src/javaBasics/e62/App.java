package javaBasics.e62;

public class App {
    public static void main(String[] arg) {
        String str = "a";
        System.out.println(App.encrypt(str));
    }

    public static String encrypt(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if ((str.length() - 1) != i) {
                result = result + str.charAt(i + 1) + str.charAt(i);
            } else {
                return result = result + str.charAt(i);
            }
            i += 1;
        }

        return result;
    }
}
