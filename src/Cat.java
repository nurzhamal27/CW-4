import java.util.Scanner;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


final class Cat {

    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach",  "Jasper", "Poppy","Ginger" );
    private  String name;
    private final int age;
    private  int health;
    private  int mood;

    private int satiety;
    private  int middleLevel;


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

    public   String getName() {
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


    public void feed() {
        int step = age <= 5 ? 7 : (age <= 10 ? 5 : 4);
        satiety += step;
        if (satiety > 100) {
            satiety = 100;
        }
        mood += step;
        if (mood > 100) {
            mood = 100;
        }
    }

    public void heal() {
        int step = age <= 5 ? 7 : (age <= 10 ? 5 : 4);
        health += step;
        if (health > 100) {
            health = 100;
        }
        mood -= step;
        if (mood < 0) {
            mood = 0;
        }
        satiety -= step;
        if (satiety < 0) {
            satiety = 0;
        }
    }

    public void play() {
        int step = age <= 5 ? 7 : (age <= 10 ? 5 : 4);
        mood += step;
        if (mood > 100) {
            mood = 100;
        }
        health += step;
        if (health > 100) {
            health = 100;
        }
        satiety -= step;
        if (satiety < 0) {
            satiety = 0;
        }
    }


    public void nextDay() {
        int satietyLoss = r.nextInt(5)+1;
        satiety -= satietyLoss;
        if (satiety < 0) satiety = 0;

        int moodChange = r.nextInt(3)-3;
        mood += moodChange;
        if (mood < 0) mood = 0;
        if (mood > 100) mood = 100;

        int healthChange = r.nextInt(3)-3;
        health += healthChange;
        if (health < 0) health = 0;
        if (health > 100) health = 100;
    }



}


