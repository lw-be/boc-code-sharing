package com.liguang.sort2;

import java.util.Arrays;

/**
 * Created by liguang on 2020/5/7.
 */
public class QuickSort {


    private static void quickSortAll(int[] array) {
        quickSortTwoWay(array, 0, array.length - 1);
    }

    /**
     * 快速排序递归函数
     */
    private static void quickSortTwoWay(int[] array, int begin, int end) {
        /**
         * 递归终止条件
         */
        if (begin >= end) {
            return;
        }
        /**
         * 获取分区点
         */
        int middle = partition(array, begin, end);
//        int middle = partition2(array, begin, end);
        /**
         * 分治递归
         */
        quickSortTwoWay(array, begin, middle - 1);
        quickSortTwoWay(array, middle + 1, end);
    }

    private static int partition(int[] array, int startIndex, int endIndex) {

        // 取第一个位置的元素作为基准元素
        int pivot = array[startIndex];
        int left = startIndex;
        int right = endIndex;

        while (left != right) {
            //控制right指针比较并左移
            while (left < right && array[right] > pivot) {
                right--;
            }
            //控制left指针比较并右移
            while (left < right && array[left] <= pivot) {
                left++;
            }
            //交换left和right指向的元素
            if (left < right) {
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }

        //pivot和指针重合点交换 pivot元素和left与right重合点的元素进行交换
        int tmp = array[left];
        array[left] = array[startIndex];
        array[startIndex] = tmp;
        System.out.print("pivot:[" + pivot + "]                    ");
        printArray(array);
        return left;
    }

    /**
     * 获取分区点 快慢指针
     */
    private static int partition3(int[] array, int begin, int end) {
        /**
         * 设置最右边的元素为基准值
         */
        int pivot = array[end];
        int i = begin;
        int j = begin;
        for (; j <= end - 1; j++) {
            if (array[j] < pivot) {
                /**
                 * 交换
                 */
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
            }
        }

        /**
         * 交换
         */
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        System.out.print("pivot:[" + pivot + "] begin:[" + begin + "]                   ");
        printArray(array);
        return i;
    }

    /**
     * 挖坑法
     */
    private static int partition2(int[] array, int begin, int end) {
        int pivot = array[begin];
        while (begin < end) {
            /*
             * 从后往前遍历，找到比pivot小的值
             */
            while (begin < end && array[end] >= pivot) {
                end--;
            }
            array[begin] = array[end];
            /*
             * 从前往后遍历，找到比pivot大的值；
             */
            while (begin < end && array[begin] <= pivot) {
                begin++;
            }
            array[end] = array[begin];
        }
        array[begin] = pivot;
        System.out.print("pivot:[" + pivot + "] begin:[" + begin + "]                   ");
        printArray(array);
        return begin;
    }

    public static void main(String[] args) {
//        int[] array = {11, 8, 3, 9, 7, 1, 2, 5};
        int[] array = {4, 7, 6, 5, 3, 2, 8, 1};

        System.out.println("--------快速排序前----------");
        printArray(array);
        System.out.println("--------开始排序----------");
        quickSortAll(array);
        System.out.println("--------快速排序后----------");
        printArray(array);
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(arr ->
                System.out.print(arr + " ")
        );
        System.out.println();
    }
}
