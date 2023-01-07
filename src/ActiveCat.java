

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public final class ActiveCat {
    private static final Scanner sc = new Scanner(System.in);
//    private static final List<String> names = List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy", "Millie", "Daisy", "Jasper", "Misty", "Minka");
    private  String name;

    private final Action action;


    public ActiveCat(Action action) {

        this.action = action;
    }

    public  String setName() {
        name = sc.nextLine();
      return name;
    }

    public void doAction() {
        System.out.printf("Я %s. %s%n", name, action.perform());
    }

    public static String jump() {
        return "Я прыгаю!";
    }

    public static String sleep() {
        return "Я сплю!";
    }

    public static String eat() {
        return "Я кушаю!";
    }

    public static String makeSound() {
        return "Я мяукаю!";
    }
    public static String swim() {
        return "Я плаваю!";
    }
    public static String play() {
        return "Я играю!";
    }

}

