package Q1;

public class SugarBread implements Bread {

    int sugar = 200;

    @Override
    public void recipe() {
        System.out.println("breadType: sugar");
        System.out.println("recipe");
        System.out.printf("flour: %s\n", flour);
        System.out.printf("water: %s\n", water - 50);
        System.out.printf("sugar: %s\n", sugar);
        System.out.println();
    }
}
