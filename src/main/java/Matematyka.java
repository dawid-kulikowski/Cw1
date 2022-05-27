public class Matematyka {
    public Matematyka(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    private int num1;
    private int num2;
    private int num3;

    // 3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę, iloraz i iloczyn.

    public int dodawanie() {
        System.out.println(num1+num2);
        return num1+num2;
    }
        public int odejmowanie() {
        System.out.println(num1-num2);
        return num1-num2;
    }
        public int mnozenie() {
        System.out.println(num1*num2);
        return num1*num2;
    }
        public int dzielenie() {
        System.out.println(num1/num2);
        return num1/num2;
    }

// 4. Napisz metodę, która jako argument przyjmuje 2 liczby i sprawdza czy obie z nich są parzyste.
    public String jestParzysta() {
        if ((num1 % 2 == 0) && (num2 % 2 == 0)) {
            System.out.println("obie liczby są parzyste");
        } else if ((num1 % 2 == 0) || (num2 % 2 == 0)) {
            System.out.println("Jedna z liczb jest parzysta");
        } else {
            System.out.println("żadna z liczb nie jest parzysta");
        }
        return null;
    }
    // 5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5,

    public boolean podzielnaPrzez(){
        if ((num1 % 3 == 0) && (num1 % 5 == 0)){
            System.out.println("jest podzielna przez 3 i 5");
            return true;
        }
        else if ((num1 % 3 == 0) && (num1 % 5 > 0)){
            System.out.println("jest podzielna przez 3, niepodzielna przez 5");
            return true;
        }
        else if ((num1 % 3 > 0) && (num1 % 5 == 0)){
            System.out.println("jest podzielna przez 5, niepodzielna przez 3");
            return true;
        }
        else {
            System.out.println("jest niepodzielna przez 3 i 5");
            return false;
        }


    }
    // 6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi,
    public int potega(){
        System.out.println(num1*num1*num1);
        return num1*num1*num1;
    }

    public double pierwiastekKwadratowy(){
        System.out.println( Math.sqrt(num1));
        return Math.sqrt(num1);
    }

 //  8. Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
public boolean trojkatProstokatny(){
        int a = num1;
        int b = num2;
        int c = num3;

        if (a+b>c || a+c>b || b+c>b){
            System.out.println("można zbudować trójkąt prostokątny");
            return true;
    } else {
            System.out.println("nie można zbudować trójkąta prostokątnego");
            return false;
        }
}
    }

