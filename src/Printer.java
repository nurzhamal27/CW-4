

import java.util.List;

public final class Printer {
    private static final void printHeader() {
        System.out.println(String.format("%1$10.10s | %1$3.3s | %1$-10.10s | %1$-10.10s |%1$-10.10s | %1$-12.10s |", "--------------"));
        System.out.println(String.format("%10.10s | %3.3s | %-10.10s | %-10.10s |%-10.10s |%-13.10s |", "Name", "Age", "Health", "Mood", "Satiety", "Middle Level"));
        System.out.println(String.format("%1$10.10s | %1$3.3s | %1$-10.10s | %1$-10.10s |%1$-10.10s | %-12.10s |", "--------------"));

    }

    private static final void printCat(Cat cat) {
        System.out.println(String.format("%10.10s | %3.3s | %-10.10s | %-10.10s | %-10.9s |%-12.10s |", cat.getName(), cat.getAge(), cat.getHealth(), cat.getMood(), cat.getSatiety(), cat.getMiddleLevel()));
    }

    private static final void printNewCat(AddCat addCat) {
        System.out.println(String.format("%10.10s | %3.3s | %-10.10s | %-10.10s | %-10.9s |%-12.10s |", addCat.getName(), addCat.getAge(), addCat.getHealth(), addCat.getMood(), addCat.getSatiety(), addCat.getMiddleLevel()));

    }

    private static final void printNextDay(NextDay nextDay) {
        System.out.println(String.format("%10.10s | %3.3s | %-10.10s | %-10.10s | %-10.9s |%-12.10s |", nextDay.getName(), nextDay.getAge(), nextDay.getHealth(), nextDay.getMood(), nextDay.getSatiety(), nextDay.getMiddleLevel()));

    }


    public static final void print(List<Cat> cats) {
        printHeader();
        cats.forEach(Printer::printCat);
        System.out.println();
    }

    public static final void print2(List<Cat> cats, List<AddCat>addCats) {
        printHeader();
        cats.forEach(Printer::printCat);
        addCats.forEach(Printer::printNewCat);
        System.out.println();
    }

    public static final void print3(List<NextDay>nextDays) {
        printHeader();
        nextDays.forEach(Printer::printNextDay);
        System.out.println();
    }
}
