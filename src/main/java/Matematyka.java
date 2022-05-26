public class Matematyka {
    public Matematyka(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    // 3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę, iloraz i iloczyn.

    private int num1;
    private int num2;

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



    }

