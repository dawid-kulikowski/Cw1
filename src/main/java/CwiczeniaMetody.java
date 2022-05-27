public class CwiczeniaMetody {
    public static void main(String[] args) {

        // zwracamy wiek i imię metodą z klasy Person
        Person person = new Person("dawid","kulikowski",27);
        person.getAge();
        person.getName();

        // zwracamy wynik mnożenia dodawania odejmowania dzielenia
        Matematyka matematyka = new Matematyka(9,15);
        matematyka.dodawanie();
        matematyka.odejmowanie();
        matematyka.mnozenie();
        matematyka.dzielenie();

        //sprawdzamy czy któraś z liczb jest parzysta
        matematyka.jestParzysta();

        //sprawdzamy podzielność pierwszej liczby przez 3 i 5
        matematyka.podzielnaPrzez();

        //liczba 1 do potęgi 3
        matematyka.potega();

        //pierwiastek z liczby 1
        matematyka.pierwiastekKwadratowy();


    }
}
