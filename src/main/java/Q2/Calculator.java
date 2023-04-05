package Q2;

public class Calculator {
    private int num;

    public Calculator add(int number) {
        num += number;
        return this;
    }

    public Calculator subtract(int number) {
        num -= number;
        return this;
    }

    public int out() {
        return num;
    }
}
