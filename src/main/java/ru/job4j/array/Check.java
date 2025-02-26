package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        if (data.length > 0) {
            for (int index = 0; index < data.length; index++) {
                if (data[0] != data[index]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}