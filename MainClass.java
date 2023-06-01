public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(10);
        plate.info();

        cat.eat(plate);

        plate.info();
        System.out.println(cat.getName() + " is hungry: " + cat.isHungry());
    }
}
