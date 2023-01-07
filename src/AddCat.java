import java.util.Random;

class AddCat {
    private static final Random r = new Random();
    private String name;
    private int age;
    private final int health;
    private final int mood;

    private final int satiety;
    private final int middleLevel;

    public AddCat(String name, int age) {
        this.name = name;
        this.age = age;
        health = r.nextInt(81)+20;
        mood = r.nextInt(81)+20;
        satiety = r.nextInt(81)+20;
        middleLevel = (health+mood+satiety)/3;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
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