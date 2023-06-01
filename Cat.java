public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isHungry = true;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            isHungry = false;
            System.out.println(name + " поел!");
        } else {
            System.out.println("В тарелке недостаточно еды для " + name);
        }
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getName() {
        return name;
    }
}
