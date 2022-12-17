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


