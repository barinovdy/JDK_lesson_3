package Homework.Task1;

public class Calculator {

    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        double result = 0;
        try {
            result = a.doubleValue() / b.doubleValue();
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
        return result;
    }

    public static <T extends Number, V extends Number> double subtract(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }
}
