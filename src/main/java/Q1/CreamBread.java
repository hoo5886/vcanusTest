package Q1;

public class CreamBread implements Bread {

    int cream = 200;

    @Override
    public void recipe() {
        System.out.println("breadType: cream");
        System.out.println("recipe");
        System.out.printf("flour: %s\n", flour);
        System.out.printf("water: %s\n", water);
        System.out.printf("cream: %s\n", cream);
        System.out.println();
    }
}
