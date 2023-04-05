import static Q3.Factorial.factorial;

import Q1.Bread;
import Q1.ButterBread;
import Q1.CreamBread;
import Q1.SugarBread;
import Q2.Calculator;
import Q4.factorial2;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        //Q1
        Bread creamBread = new CreamBread();
        Bread sugarBread = new SugarBread();
        Bread butterBread = new ButterBread();

        List<Bread> breads = new ArrayList();
        breads.add(creamBread);
        breads.add(sugarBread);
        breads.add(butterBread);

        for (Bread bread : breads) {
            bread.recipe();
        }


        //Q2
        Calculator calc = new Calculator();

        int result = calc.add(4).add(5).subtract(3).out();
        print(result);


        //Q3
        int result1 = factorial(4);
        print(result1);

        //Q4 재귀 자체의 문제가 아니라 재귀가 완료될 때까지 연산의 부분 결과를 계속 스택에 보관하고 있어야 한다는 것이 문제
        // 스택에 저장하지 않고 재귀를 사용할 수 있는 방법이 필요 -> 꼬리 재귀 최적화
        BigInteger result2 = factorial2.factorial(1000000);
        print(result2);

        //Q5.


    }

    static void print(int result) {
        System.out.println(result);
    }

    static void print(BigInteger result) {
        System.out.println(result);
    }

}
