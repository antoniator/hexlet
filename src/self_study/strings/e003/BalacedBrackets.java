package self_study.strings.e003;

public class BalacedBrackets {
    public static void main(String[] args) {
        System.out.println(isBalanced("()()"));
    }

    public static boolean isBalanced(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                sum++;
            } else if (str.charAt(i) == ')') {
                sum--;
            }
            if (sum < 0) {
                return false;
            }
        }
        return (sum == 0);
    }
}
