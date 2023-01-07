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

    System.out.print("Enter cat's name : ");
    String name = scanner.nextLine();

    System.out.print("Enter cat's age: ");
    int age = scanner.nextInt();

    AddCat addCat = new AddCat(name, age);
    cats.add(addCat);
    Printer.print2(cats1, cats);

    ActiveCat activeCat = new ActiveCat();
      activeCat.doAction();

            chooseSort();


        System.out.println("Следующий день");
//        List<NextDay>nextDays=new ArrayList<>();
        var nextDays = NextDay.makeCats(3);
        Printer.print3(nextDays);

    }

    public static void chooseSort(){


        var cats1 = Cat.makeCats(3);
        Printer.print(cats1);

        List<AddCat> cats = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выьерите способ сортировки: " +
                "\n 1 - по имени" +
                "\n2 - по возрасту" +
                "\n3 - по здоровью" +
                "\n4 - по настроению" +
                "\n 5 - по сытости" +
                "\n 6 - по среднему");
        System.out.println("Введите цифру");
        String input = scanner.nextLine();
        if(input.equals("1")){
            System.out.println("            SORTING BY NAME ");
            cats1.sort(Comparator.comparing(Cat::getName));
            Printer.print2(cats1,cats);
        }if(input.equals("2")) {
            System.out.println("            SORTING BY AGE ");
            cats1.sort(Comparator.comparing(Cat::getAge));
            Printer.print2(cats1, cats);
        }

        if(input.equals("3")) {

            System.out.println("            SORTING BY HEALTH ");
            cats1.sort(Comparator.comparing(Cat::getName));
            Printer.print2(cats1,cats);
        }if(input.equals("4")) {

            System.out.println("            SORTING BY MOOD ");
            cats1.sort(Comparator.comparing(Cat::getMood));
            Printer.print2(cats1, cats);
        }if(input.equals("5")) {

            System.out.println("            SORTING BY SATIETY ");
            cats1.sort(Comparator.comparing(Cat::getSatiety));
            Printer.print2(cats1, cats);
        }
        if(input.equals("6")) {

            System.out.println("            SORTING BY MIDDLE LEVEL ");
            cats1.sort(Comparator.comparing(Cat::getMiddleLevel));
            Printer.print2(cats1, cats);
        }
    }


}



