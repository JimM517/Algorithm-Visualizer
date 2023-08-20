package sorts;

import application.SortingPanel;

/*
 * For reference:
 * https://en.wikipedia.org/wiki/Quicksort
 */
public class QuickSort implements Sortable {




    @Override
    public void sort(int[] arr,  SortingPanel visualizer) {

        // recursive divide and conquer algorithm

        quickSort(arr, 0, arr.length - 1, visualizer);


//        visualizer.updateDisplay();
    }


    @Override
    public String getSortName() {
        return "Quick Sort";
    }


    private static void quickSort(int[] arr, int start, int end, SortingPanel visualizer) {

        // base case
        if (end <= start) return;

        // get our pivot, once we find pivot we can start recursion
        int pivot = partition(arr, start, end, visualizer);

        // left partition
        quickSort(arr, start, pivot - 1, visualizer);

        // right partition
        quickSort(arr, pivot + 1, end, visualizer);



    }


    // helper function
    private static int partition(int[] arr, int start, int end, SortingPanel visualizer) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            if (arr[j] < pivot) {
                i++;
                swapValues(arr, i, j);
                visualizer.updateDisplay();
            }
        }
        i++;
        swapValues(arr, i, end);
        visualizer.updateDisplay();
        return i;
    }


    private static void swapValues(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
