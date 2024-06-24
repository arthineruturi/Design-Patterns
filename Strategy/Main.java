package Strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//    	SortContext sortContext = new SortContext(null);
        ISortStrategy defaultStrategy = new BubbleSortStrategy();
        SortContext sortContext = new SortContext(defaultStrategy); 

     
        int[] bubbleSortData = {5, 1, 4, 2, 8};
        System.out.println("Original Bubble Sort Data: " + Arrays.toString(bubbleSortData));
        sortContext.sort(bubbleSortData);
        System.out.println("Sorted Bubble Sort Data: " + Arrays.toString(bubbleSortData));

      
        int[] mergeSortData = {50, 20, 65, 42, 15, 75, 30, 80, 10, 60, 35, 5};
        System.out.println("\nOriginal Merge Sort Data: " + Arrays.toString(mergeSortData));
        ISortStrategy mergeSortStrategy = new MergeSortStrategy();
        sortContext.setStrategy(mergeSortStrategy);
        sortContext.sort(mergeSortData);
        System.out.println("Sorted Merge Sort Data: " + Arrays.toString(mergeSortData));

       
        int[] insertionSortData = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("\nOriginal Insertion Sort Data: " + Arrays.toString(insertionSortData));
        ISortStrategy insertionSortStrategy = new InsertionSortStrategy();
        sortContext.setStrategy(insertionSortStrategy);
        sortContext.sort(insertionSortData);
        System.out.println("Sorted Insertion Sort Data: " + Arrays.toString(insertionSortData));
    }
}
