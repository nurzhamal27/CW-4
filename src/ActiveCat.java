
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public final class ActiveCat {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach", "Jasper", "Poppy", "Ginger");
    private List<Cat> cats;
    private String name;



    public ActiveCat(String name) {
        this.name = name;

    }

    public ActiveCat() {

    }

    public String getName() {
        return name;
    }

    public void doAction() {
        System.out.println("Выберите действие: " +
                "\n1 - Кормить кота\n" +
                "\n2 - Играть с котом\n" +
                "\n3 - Лечить кота");
        String input = sc.nextLine();
        if (input.equals("1")) {
            System.out.println("Вы выбрали кормить кота !");

        }
        if (input.equals("2")) {
            System.out.println("Вы выбрали играть с котом !");

        }
        if (input.equals("3")) {
            System.out.println("Вы выбрали лечить кота!");

        }

        System.out.println("Введите имя кота: \"Peach\", \"Jasper\", \"Poppy\", \"Ginger\"");
            String name = sc.next();
            if (name.equals("Peach")) {
                System.out.println("Выбрали Peach");
            }
            if (name.equals("Poppy")) {
                System.out.println("Выбрали Poppy");

            }
            if (name.equals("Jasper")) {
                System.out.println("Выбрали Jasper");
            }
            if (name.equals("Ginger")) {
                System.out.println("Выбрали Ginger");
            } else  {
                System.out.println("Некорректный выбор");
            }
        }

    public  void feed(String name) {

    }

    public  String play() {
        return "Вы выбрали играть с котом !";
    }

    public  String treat() {
        return "Вы выбрали лечить кота!";
    }

    public void nextDayForAllCats() {
        for (Cat cat : cats) {
            cat.nextDay();
        }
    }

}
