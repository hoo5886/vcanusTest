package Q4;

import java.math.BigInteger;

public class factorial2 {

    /*
    함수가 리턴된 후 아무 작업도 하지 않도록 하는 것을 꼬리 호출이라고 한다.
    그리고 이런 구조를 꼬리 재귀라고 한다.
    * */

    public static BigInteger factorial(int num) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 2; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String[] args) {
        BigInteger result2 = factorial(1000000);
        System.out.println("====================================");
        System.out.println(result2);
        System.out.println("====================================");
    }
}
