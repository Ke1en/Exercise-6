public class Main {
    public static void main(String[] args) {
        System.out.println(sumIntegers(5, 3));
        System.out.println(sumIntegers(5, 3, 2));

        Calculator calculator = new Calculator();

        calculator.sumIntegers(5, 3);
        calculator.sumIntegers(5, 3, 2);

        calculator.printData(25, "Dmitry");
        calculator.printData("Dmitry", 25);

        System.out.println(calculator.calculateFactorial(3));
    }

    public static int sumIntegers(int a, int b) {
        return a + b;
    }

    public static int sumIntegers(int a, int b, int c) {
        return a + b + c;
    }
}