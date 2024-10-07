public class Main {
    public static void main(String[] args) {
        System.out.println(sumIntegers(5, 3));
        System.out.println(sumIntegers(5, 3, 2));
        Calculator calculator = new Calculator();
        calculator.sumIntegers(5, 3);
        calculator.sumIntegers(5, 3, 2);

    }

    public static int sumIntegers(int a, int b) {
        return a + b;
    }

    public static int sumIntegers(int a, int b, int c) {
        return a + b + c;
    }
}