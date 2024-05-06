package com.example.dsasolutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        LinkedList<int[]> mergedList = new LinkedList<>();

        for (int[] item : intervals) {

            if (mergedList.isEmpty() || mergedList.getLast()[1] < item[0]) {
                mergedList.add(item);
            } else {
                mergedList.getLast()[1] = Math.max(mergedList.getLast()[1], item[1]);
            }
        }
        return mergedList.toArray(new int[mergedList.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
       // int[][] intervals = new int[][]{{15, 18}, {8, 10}, {1, 3}, {2, 6}};

        int[][] resultArray = merge(intervals);

        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++)
                System.out.print(resultArray[i][j] + " ");
            System.out.println();

        }
    }
}
