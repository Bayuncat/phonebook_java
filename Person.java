public class Person {

    private String name;
    private String phone;
    private String email;
    private static Person[] persons = new Person[10];

    public Person(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }

    String getEmail() {
        return email;
    }

    public static void initBD() {
        persons[0] = new Person("���", "89210000000", "Julia@yandex.com");
        persons[1] = new Person("������", "777777", "borya@yandex.com");
        persons[2] = new Person("������", "23566777", "univer@yandex.com");
        persons[3] = new Person("EvilBoss", "456546546", "boss@yandex.com");
        persons[4] = new Person("Anna", "+79216661666", "mylove@yandex.com");
    }

    public String toString() {
        return "\n\nName: " + this.getName() + "\nPhone number: " + this.getPhone() + "\nEmail: " +
                this.getEmail();
    }

    // ����� ��������
    public static void findPerson(String searchType, String searchString) {

        switch (searchType) {
            case "1":
                //�� �����
                System.out.println(findName(searchString, persons));
                break;
            case "2":
                //�� ��������
                System.out.println(findPhone(searchString, persons));
                break;
            case "3":
                // �� �����
                System.out.println(findEmail(searchString, persons));
                break;
            default:
                break;
        }
    }

    public static Person findName(String name, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (person.getName().equals(name)) {
                return person;
            }
        }
        System.out.println("��� ������ ��������");
        return null;
    }

    public static Person findPhone(String phone, Person[] persons) {
        for (Person person : persons) {
            if (person == null) continue;
            if (person.getPhone().equals(phone)) {
                return person;
            }
        }
        System.out.println("��� ������ ��������");
        return null;
    }

        public static Person findEmail(String email, Person[] persons) {
            for (Person person : persons) {
                if (person == null) continue;
                if (person.getEmail().equals(email)) {
                    return person;
                }
            }

        System.out.println("��� ������ ��������");
        return null;
    }

}
