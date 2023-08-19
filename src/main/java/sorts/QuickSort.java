package sorts;

import application.SortingPanel;

/*
 * For reference:
 * https://en.wikipedia.org/wiki/Quicksort
 */
public class QuickSort implements Sortable {

    @Override
    public void sort(int[] arr, SortingPanel visualizer) {

        int start = 0;
        int end = arr.length - 1;





    }


    @Override
    public String getSortName() {
        return "Quick Sort";
    }


    private void swapValues(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
