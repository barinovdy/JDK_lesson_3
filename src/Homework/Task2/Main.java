package Homework.Task2;

//Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
//если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но
//должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.

import java.util.Objects;

public class Main {
    public static <T, V> boolean compareArrays(T[] firstArr, V[] secondArr) {
        if (firstArr == null) return false;
        if (secondArr == null) return false;

        if (firstArr.length == secondArr.length) {
            for (int i = 0; i < firstArr.length; i++) {
                if (!Objects.equals(firstArr[i], secondArr[i])) return false;
            }
        } else return false;
        return true;
    }

    public static void main(String[] args) {
        Object[] arr1 = {1, 4.0f, 6, 7.7d};
        Object[] arr2 = {1, 4.0f, 6, 7.7f};

        System.out.println(compareArrays(arr1, arr2));
    }
}
