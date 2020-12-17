package ru.vsu.cs;

import java.util.ArrayList;

public class Search {

    public static int linearSearch(ArrayList<Integer> list, int searching){
        int deep = 0;

        for (int i = 0; i < list.size(); i++) {
            deep++;
            if(list.get(i) == searching) return deep;
        }

        return deep * -1;
    }

    public static int binarySearch(ArrayList<Integer> list, int searching) {
        int deep = 0;

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            deep++;
            if (list.get(mid) < searching) {
                low = mid + 1;
            } else if (list.get(mid) > searching) {
                high = mid - 1;
            } else if (list.get(mid) == searching) {
                return deep;
            }
        }
        return deep * -1;
    }


}
