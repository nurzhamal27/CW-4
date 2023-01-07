import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NextDay {
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach",  "Jasper", "Poppy","Ginger" );
    private final String name;
    private final int age;
    private  int health;
    private  int mood;

    private int satiety;
    private  int middleLevel;


    public NextDay() {

        name = names.get(r.nextInt(names.size()));
        age = r.nextInt(12) + 1;
        health = r.nextInt(5)+1;
        mood = r.nextInt(3)-3;
        satiety = r.nextInt(3)-3;
        middleLevel = (health+mood+satiety)/3;
    }

    public static final List<Cat> makeCats(int amount) {
        return Stream.generate(Cat::new)
                .limit(amount)
                .collect(Collectors.toList());

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

    public  int getMood() {
        return mood;
    }
    public  int getSatiety() {
        return satiety;
    }
    public  int getMiddleLevel() {
        return middleLevel;
    }

}
