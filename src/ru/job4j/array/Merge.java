package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int i = 0;

        while (i < result.length) {

            if (left.length == 0) {
                result = right;
                break;
            }
                if (right.length == 0) {
                    result = left;
                    break;
                }

                result[i] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
                if (leftIndex == left.length) {
                    System.arraycopy(right, rightIndex, result, ++i, right.length - rightIndex);
                    break;
                }
                if (rightIndex == right.length) {
                    System.arraycopy(left, leftIndex, result, ++i, left.length - leftIndex);
                    break;
                }
                i++;
            }

            return result;
        }
    }






       /* 1. int n = left.length;
        int m = right.length;
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (left[i] <= right[j]) {
                rsl[k] = left[i];
                i++;
            } else {
            k++;
            while (i < n) {
                rsl[k] = left[i];
                i++;
                k++;
                rsl[k] = right[j];
                j++;
            }
            }
            while (j < m) {
                rsl[k] = right[j];
                j++;
                k++;

            }
        }

https://www.youtube.com/watch?v=tAtBPxw2RRQ

2.


       int count = 0;
        for (int index = 0; index < left.length; index++) {
            rsl[index] = left[index];
            count++;
        }
        for (int index1 = 0; index1 < right.length; index1++) {
            rsl[count++] = right[index1];

*/