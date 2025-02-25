package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index < result.length; index++) {
            result[index] = index * index;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int element : array) {
            System.out.println(element);
        }
    }
}
