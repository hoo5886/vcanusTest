package Q3;

public class Factorial {
    public static int factorial(int num) {
        if (num == 1) {
            return num;
        } else {
            return factorial(num - 1)*num;
        }
    }
}
