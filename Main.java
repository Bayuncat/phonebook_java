
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Person.initBD();

        System.out.print("��� ���c�� �� ����� ������� 1, �� ������ 2, email 3: ");
        String searchType = in.nextLine();

        System.out.print("������� ��������� ��������: ");
        String searchString = in.nextLine();

        Person.findPerson(searchType, searchString);

    }
}