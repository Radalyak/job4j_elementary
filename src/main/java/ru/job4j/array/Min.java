package ru.job4j.array;

public class Min {

    public static int findMin(int[] array) {
        int min = array[1];
        for (int index : array) {
          if (min > index) {
              min = index;
          }
        }
        return min;
    }
}
