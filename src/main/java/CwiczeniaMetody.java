public class CwiczeniaMetody {
    public static void main(String[] args) {

        // zwracamy wiek i imię metodą z klasy Person
        Person person = new Person("dawid","kulikowski",27);
        person.getAge();
        person.getName();

        // zwracamy wynik mnożenia dodawania odejmowania dzielenia
        Matematyka matematyka = new Matematyka(10,10);
        matematyka.dodawanie();
        matematyka.odejmowanie();
        matematyka.mnozenie();
        matematyka.dzielenie();

        //sprawdzamy czy któraś z liczb jest parzysta
        matematyka.jestParzysta();

        //


    }
}
