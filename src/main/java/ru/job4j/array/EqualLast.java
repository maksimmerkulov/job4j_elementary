package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        if (left.length == 0 || right.length == 0) {
            return false;
        }
        return (left[left.length - 1] == right[right.length - 1]);
    }
}