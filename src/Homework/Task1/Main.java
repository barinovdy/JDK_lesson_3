package Homework.Task1;

/*
Написать класс Калькулятор (необобщенный), который содержит обобщенные
статические методы: sum(), multiply(), divide(), subtract(). Параметры
этих методов – два числа разного типа, над которыми должна быть произведена
операция. Методы должны возвращать результат своей работы.
*/

public class Main {
    public static void main(String[] args) {

        System.out.println(Calculator.sum(5, 7.0f));
        System.out.println(Calculator.subtract(5, 7.0f));
        System.out.println(Calculator.multiply(5, 7.0f));
        System.out.println(Calculator.divide(5, 0.1d));
    }
}
