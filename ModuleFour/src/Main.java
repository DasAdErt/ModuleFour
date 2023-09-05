public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);

        Dog bobik = new Dog("Bobik", 2, 50);
        Dinner dinnerFirst = new Dinner(bobik, plate);
        System.out.println(bobik.hunger);
        bobik.run(150);
        bobik.swim(15);

        Cat barsik = new Cat("Barsik", 1, 100);
        Dinner dinnerSecond = new Dinner(barsik, plate);
        System.out.println(barsik.hunger);
        barsik.run(150);
    }
}