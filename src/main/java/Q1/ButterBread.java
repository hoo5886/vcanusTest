package Q1;

public class ButterBread implements Bread {

    int butter = 50;

    @Override
    public void recipe() {
        System.out.println("breadType: butter");
        System.out.println("recipe");
        System.out.printf("flour: %s\n", flour);
        System.out.printf("water: %s\n", water);
        System.out.printf("butter: %s\n", butter);
        System.out.println();
    }
}
