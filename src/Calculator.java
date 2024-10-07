public class Calculator {
    public int sumIntegers(int a, int b) {
        return a + b;
    }

    public int sumIntegers(int a, int b, int c) {
        return a + b + c;
    }

    public int sumIntegers(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public void printData(String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public void printData(int age, String name) {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public int calculateFactorial(int num) {
        if (num == 1)
            return 1;
        return num * calculateFactorial(num - 1);
    }
}
