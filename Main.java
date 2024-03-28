
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Person.initBD();

        System.out.print("ƒл€ поиcка по имени введите 1, по номеру 2, email 3: ");
        String searchType = in.nextLine();

        System.out.print("¬ведите поисковое значение: ");
        String searchString = in.nextLine();

        Person.findPerson(searchType, searchString);

    }
}