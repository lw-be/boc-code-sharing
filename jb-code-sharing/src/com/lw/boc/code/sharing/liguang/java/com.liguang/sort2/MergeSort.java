package com.liguang.sort2;
import java.util.Arrays;

/**
 * Created by liguang on 2020/5/7.
 */
public class MergeSort {


    private static void mergeSortAll(int[] array) {
        mergeSortTwoWay(array, 0, array.length - 1);
    }

    /**
     * 递归调用函数
     */
    private static void mergeSortTwoWay(int[] array, int begin, int end) {
        /**
         * 递归终止条件
         */
        if (begin >= end) {
            return;
        }
        /**
         * 取begin到end之间的中间位置middle
         */
        int middle = (begin + end) / 2;
        /**
         * 分治递归
         */
        mergeSortTwoWay(array, begin, middle);
        mergeSortTwoWay(array, middle + 1, end);

        /**
         * 将array[begin...middle]和array[middle+1...end]合并为array[begin...end]
         */
        mergeBySort(array, begin, middle, end);
    }

    /**
     * 按从小到大顺序合并
     * @param array
     * @param begin
     * @param middle
     * @param end
     */
    private static void mergeBySort(int[] array, int begin, int middle, int end) {
        int[] tempArray = new int[array.length];//临时数组
        int indexTemp = begin;//临时数组的下标
        int indexLeft = begin;//左array的下标
        int indexRight = middle + 1;//右array的下标

        /**
         * 比较,取较小的值放入temp数组,下标后移
         */
        while (indexLeft <= middle && indexRight <= end) {
            if (array[indexLeft] <= array[indexRight]) {
                tempArray[indexTemp++] = array[indexLeft++];
            } else {
                tempArray[indexTemp++] = array[indexRight++];
            }
        }
        /**
         * 将剩余的数据拷贝到temp数组
         */
        while (indexLeft <= middle) {
            tempArray[indexTemp++] = array[indexLeft++];
        }
        while (indexRight <= end) {
            tempArray[indexTemp++] = array[indexRight++];
        }
        for (int i = begin; i <= end; i++) {
            //将临时数组拷贝到原数组
            array[i] = tempArray[i];
        }
        System.out.print("begin:[" + begin + "] end:[" + end + "]                   ");
        printArray(array);
    }

    public static void main(String[] args) {
        int[] array = {11, 8, 3, 9, 7, 1, 2, 5};
        System.out.println("--------归并排序前----------");
        printArray(array);
        System.out.println("--------开始排序----------");
        mergeSortAll(array);
        System.out.println("--------归并排序后----------");
        printArray(array);
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(arr ->
                System.out.print(arr + " ")
        );
        System.out.println();
    }
}
