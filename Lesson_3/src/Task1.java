//Заполнить список 10-ю случайными числами
//Отсортировать список методом sort() и вывести его на экран

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 10;
        List<Integer> numbers = new ArrayList<>(10);

        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt());
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
