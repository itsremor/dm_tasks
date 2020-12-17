package ru.vsu.cs;

public class ShellSort {
    private int count = 0;


    public int[] sort(int[] array) {
        count = 0;

        int i, j, tmp;
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (i = step; i < array.length; i++) {
                tmp = array[i];
                for (j = i; j >= step ; j-= step) {
                    count++;
                    if (tmp < array[j - step]) {
                        array[j] = array[j - step];
                    } else {
                        break;
                    }
                }
                array[j] = tmp;
            }
        }
        return array;
    }


    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public int getCount() {
        return count;
    }
}