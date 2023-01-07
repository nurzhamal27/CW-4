import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var cats1 = Cat.makeCats(3);
        Printer.print(cats1);

     List<AddCat> cats = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите имя кота: ");
    String name = scanner.nextLine();

    System.out.print("Введите возраст кота: ");
    int age = scanner.nextInt();

    AddCat addCat = new AddCat(name, age);
    cats.add(addCat);
    Printer.print2(cats1, cats);
    }

    }

