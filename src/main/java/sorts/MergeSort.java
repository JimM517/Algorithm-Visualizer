package sorts;

import application.SortingPanel;

public class MergeSort implements Sortable{
    /*
     * For reference:
     * https://en.wikipedia.org/wiki/Merge_sort
     */
    @Override
    public void sort(int[] arr, SortingPanel visualizer) {

        mergeSort(arr, visualizer);


    }

    @Override
    public String getSortName() {
        return "Merge Sort";
    }


    private static void mergeSort(int[] arr, SortingPanel visualizer) {

        int length = arr.length;

        // base case
        if (length <= 1) return;

        int middle = length / 2;

        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];

        // iterate the left arr
        int i = 0;

        // iterate the right arr
        int j = 0;


        for (; i < length; i++) {
            if (i < middle) {
                leftArr[i] = arr[i];
            }
            else {
                rightArr[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArr, visualizer);
        mergeSort(rightArr, visualizer);
        merge(leftArr, rightArr, arr, visualizer);

    }


    // helper function
    private static void merge(int[] leftArr, int[] rightArr, int[] arr, SortingPanel visualizer) {

        int left = arr.length / 2;
        int right = arr.length - left;

        // indices for original arr, left, right
        int i = 0, l = 0, r = 0;

        // check merge
        while(l < left && r < right) {
            if (leftArr[l] < rightArr[r]) {
                // copy smaller number on the left to original array
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                // else copy right arr to original
                arr[i] = rightArr[r];
                i++;
                r++;
            }
            visualizer.updateDisplay();
        }
        while(l < left) {
            arr[i] = leftArr[l];
            i++;
            l++;
            visualizer.updateDisplay();
        }
        while(r < right) {
            arr[i] = rightArr[r];
            i++;
            r++;
            visualizer.updateDisplay();
        }

        visualizer.updateDisplay();
    }

}
