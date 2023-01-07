import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


final class Cat {
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach",  "Jasper", "Poppy","Ginger" );
    private final String name;
    private final int age;
    private final int health;
    private final int mood;

    private final int satiety;
    private final int middleLevel;

    public Cat() {

        name = names.get(r.nextInt(names.size()));
        age = r.nextInt(12) + 1;
        health = r.nextInt(101)+0;
        mood = r.nextInt(101)+0;
        satiety = r.nextInt(101)+0;
        middleLevel = (health+mood+satiety)/3;
    }


    public static final List<Cat> makeCats(int amount) {
        return Stream.generate(Cat::new)
                .limit(amount)
                .collect(Collectors.toList());
    }

    public void addCat() {
        System.out.println("Enter the name of the cat: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Enter the age of the cat: ");
        int age = scanner.nextInt();
//        Cat cat = new Cat(name, age, 0, 0, 0, 0);
//        cats.add(cat);
    }

    public final String getName() {
        return name;
    }

    public final int getAge() {
        return age;
    }
    public final int getHealth() {
        return health;
    }

    public final int getMood() {
        return mood;
    }
    public final int getSatiety() {
        return satiety;
    }
    public final int getMiddleLevel() {
        return middleLevel;
    }

}






