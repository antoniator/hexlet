package self_study.common;

import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        fizzBuzz2(begin, end);
    }

    public static void fizzBuzz (int begin, int end) {
        if (begin > end) {
            return;
            //System.out.println("");
        }
        for (int i = begin; i <= end; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 5 == 0)) {
                System.out.println("Buzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }

    public  static void fizzBuzz2 (int begin, int end) {
        for (var i = begin; i <= end; i++) {
            var hasFizz = i % 3 == 0;
            var hasBuzz = i % 5 == 0;
            var fizzPart = hasFizz ? "Fizz" : "";
            var buzzPart = hasBuzz ? "Buzz" : "";
            System.out.println(hasFizz || hasBuzz ? fizzPart + buzzPart : i);
        }
    }
}
