package self_study.common;

public class MethodReloading {
    public static void main(String[] args) {
        System.out.println(getHiddenCard("1111222233336895"));
    }

    public static String getHiddenCard(String cardNum, int asterixNum) {
        return "*".repeat(asterixNum) + cardNum.substring(12);
    }

    public static String getHiddenCard(String cardNum) {
        return getHiddenCard(cardNum, 4);
    }
}
