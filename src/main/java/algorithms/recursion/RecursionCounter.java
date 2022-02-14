package algorithms.recursion;

public class RecursionCounter {

    public static void countDown(int number, int minRange) {
        System.out.println(number);
        if (number <= minRange) {
            return;
        } else {
            countDown(number - 1, minRange);
        }
    }

    public static void countUp(int number, int maxRange) {
        System.out.println(number);
        if (number >= maxRange) {
            return;
        } else {
            countUp(number + 1, maxRange);
        }
    }

    public static int factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }

}
