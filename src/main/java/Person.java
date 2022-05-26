public class Person {
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private String name;
    private String surname;
    private int age;

   // 1. Napisz metodę, która zwróci Twój aktualny wiek.
    public int getAge() {
        System.out.println(age);
        return age;
    }

   // 2. Napisz metodę, która zwróci Twoje imię.

    public String getName() {
        System.out.println(name);
        return name;
    }
}
