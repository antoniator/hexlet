package javaBasics.e59;

public class App {
    public static void main(String[] arg) {
        String str = "If I look back I am lost";
        char ch = 'o';
        System.out.println(App.filterString(str, ch));
    }

    public static String filterString(String str, char ch) {
        int i = 0;
        String result = "";

        while(i < str.length()) {
            if (str.charAt(i) != ch) {
                result = result + str.charAt(i);
                i += 1;
            } else {
                i += 1;
            }
        }

        return result;
    }
}
