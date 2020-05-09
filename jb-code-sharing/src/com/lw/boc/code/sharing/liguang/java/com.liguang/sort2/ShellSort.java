package com.liguang.sort2;

import java.util.Arrays;

/**
 * Created by liguang on 2020/5/9.
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {5, 8, 6, 3, 9, 2, 1, 7};
        System.out.println("--------希尔排序前----------");
        printArray(array);
        System.out.println("--------开始排序----------");
        int[] array2 = sort(array);
        System.out.println("--------希尔排序后----------");
        printArray(array2);

    }

    public static int[] sort(int[] array) {

        int len = array.length;
        /**
         * 希尔增量
         */
        int gap = len / 2;
        while (gap > 0) {
            for (int j = gap; j < len; j++) {
//                System.out.print("希尔增量 gap:[" + gap + "]                    ");
                int i = j;
                while (i >= gap && array[i - gap] > array[i]) {
//                    System.out.println("交换 " + array[i] + "和" + array[i - gap]);
                    int temp = array[i];
                    array[i] = array[i - gap];
                    array[i - gap] = temp;
                    i -= gap;
                }
            }
            printArray(array);
            gap = gap / 2;

        }
        return array;
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(arr ->
                System.out.print(arr + " ")
        );
        System.out.println();
    }
}
