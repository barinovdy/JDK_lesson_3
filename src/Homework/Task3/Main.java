package Homework.Task3;

//Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
//Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из
//составляющих пары, а также переопределение метода toString(), возвращающее строковое
//представление пары. Работу сдать в виде ссылки на гит репозиторий.

public class Main {
    public static void main(String[] args) {
        Integer first = 5;
        Float second = 6.7f;

        Pair <Integer, Float> pair = new Pair<>(first, second);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}
