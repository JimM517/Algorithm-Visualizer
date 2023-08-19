package sorts;

import application.SortingPanel;

public class InsertionSort implements Sortable {
    /*
     * For reference:
     * https://en.wikipedia.org/wiki/Insertion_sort
     */
    @Override
    public void sort(int[] arr, SortingPanel visualizer) {

        int i = 1;
        while (i < arr.length) {
            int currentIndex = i;
            while (currentIndex > 0 && arr[currentIndex - 1] > arr[currentIndex]) {
                // create temp to store val at current index before swapping
                int temp = arr[currentIndex];

                // swap our values at the current index to the one before it
                arr[currentIndex] = arr[currentIndex - 1];

                // now the swapped val is our temp aka original val
                arr[currentIndex - 1] = temp;

                // repeat, update this index after swapping vals
                currentIndex--;

                // update our visualizer
                visualizer.updateDisplay();

            }
            // iterate i
            i++;



        }



    }

    @Override
    public String getSortName() {
        return "Insertion Sort";
    }
}
