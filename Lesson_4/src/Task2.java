//Реализовать стэк с помощью массива.
//Нужно реализовать методы:
//size(), empty(), push(), peek(), pop().

// ЗДЕСЬ ЗАПУСК СТЭКА


import java.util.LinkedList;

public class Task2 {
    static LinkedList<String> list = new LinkedList<>();
    public static void main(String[] args) {
        GBStack<Integer> stack = new GBStack<>();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(9);
        System.out.println(stack.pop());
        System.out.println(stack);

        GBStack<String> stackStr = new GBStack<>();
        stackStr.push("1");

    }}