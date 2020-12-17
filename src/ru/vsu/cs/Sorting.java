package ru.vsu.cs;

import java.util.ArrayList;

public class Sorting {

    public static void swapListElements(ArrayList<Integer> arr, int index1, int index2) {
        int temp = arr.get(index1);

        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }
    //todo fix
    public static void insertionSort(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                counter++;
                if (val >= array[j]) {
                    break;
                }
                array[j + 1] = array[j];
            }
            array[j + 1] = val;
        }
        System.out.print("\nКол-во сравнений (вставки): " + counter);
    }

    //todo fix
    public static void binarySort(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int first = 0;
            int last = i;
            while (first < last) {
                int mid = first + ((last - first) / 2);
                counter++;
                if (value < arr[mid]) {
                    last = mid;
                } else {
                    first = mid + 1;
                }
            }
            for (int j = i; j > first; j--) {
                arr[j] = arr[j - 1];
            }
            arr[first] = value;
        }
        System.out.print("\nКол-во сравнений (б.вставки): " + counter);
    }

    //todo fix
    public static int ShellSort(ArrayList<Integer> arr) {
        int counter = 0;
        int i;
        int j;
        int tmp;
        for (int step = arr.size() / 2; step > 0; step /= 2) {
            for (i = step; i < arr.size(); i+=3) {
                tmp = arr.get(i);
                for (j = i; j >= step; j -= step) {
                    counter++;
                    if (tmp < arr.get(j - step)) {
                        arr.set(j, arr.get(j - step));
                    } else {
                        break;
                    }
                }
                arr.set(j, tmp);
            }
        }
        return counter;
    }

    //done
    public static int bubbleSort(ArrayList<Integer> arr) {
        boolean sorted = false;
        int temp;
        int counter = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.size() - 1; i++) {
                counter++;
                if (arr.get(i) > arr.get(i + 1)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return counter;
    }

    //done
    public static int counterForQuickSort = 0;
    //done
    private static int quickSortMain(ArrayList<Integer> arr, int left, int right) {
        int pivot = arr.get(right);
        int high = right;

        while (left < high) {
            while (left < high && arr.get(left) <= pivot) {
                counterForQuickSort++;
                left++;
            }
            while (left < high && arr.get(high) >= pivot) {
                counterForQuickSort++;
                high--;
            }
            swapListElements(arr, left, high);
        }
        swapListElements(arr, left, right);
        return left;
    }
    //done
    public static int quickSort(ArrayList<Integer> arr, int left, int right) {
        //counterForQuickSort++;
        if (left < right) {
            int index = quickSortMain(arr, left, right);
            quickSort(arr, left, index - 1);
            quickSort(arr, index, right);
        }

        return counterForQuickSort;
    }

    //done
    public static int comparisonCounterForMergeSort = 0;
    //done
    private static void merge(int[] array, int left, int mid, int right) {
        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int leftArray[] = new int[lengthLeft];
        int rightArray[] = new int[lengthRight];

        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid + i + 1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            //comparisonCounterForMergeSort++;
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                comparisonCounterForMergeSort++;
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else {
                //comparisonCounterForMergeSort++;
                if (leftIndex < lengthLeft) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    //comparisonCounterForMergeSort++;
                    if (rightIndex < lengthRight) {
                        array[i] = rightArray[rightIndex];
                        rightIndex++;
                    }
                }
            }
        }
    }
    //done
    public static int mergeSort(int[] array, int left, int right) {
        comparisonCounterForMergeSort++;
        if (right <= left) return comparisonCounterForMergeSort;
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);

        return comparisonCounterForMergeSort;
    }

}