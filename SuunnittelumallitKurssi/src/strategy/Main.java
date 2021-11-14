package strategy;

import java.util.Random;

public class Main {
    
    public static void main(String[] args){
        
        final int koko = 100000; //Järjestettävien määrä
        int[] array1 = new int[koko];
        int[] array2 = new int[koko];
        int[] array3 = new int[koko];
        long start, stop;
        
        for(int i = 0; i < koko; i++){ //Luodaan arrayt (jokaiselle lajittelulle oma)
            Random rand = new Random();
            array1[i] = rand.nextInt((koko - 1) + 1) + 1;
            array2[i] = array1[i];
            array3[i] = array1[i];
        }
        
        System.out.println("\nSekoitettu array");
        for(int i : array1){
            System.out.print(i + ", ");
        }
        
        Sort bubbleSort = new Sort(new BubbleSort());
        start = System.currentTimeMillis();
        bubbleSort.sort(array1);
        stop = System.currentTimeMillis();
        long bubbleSortTime = stop - start;
        
        Sort quickSort = new Sort(new QuickSort());
        start = System.currentTimeMillis();
        quickSort.sort(array2);
        stop = System.currentTimeMillis();
        long quickSortTime = stop - start;
        
        Sort mergeSort = new Sort(new MergeSort());
        start = System.currentTimeMillis();
        mergeSort.sort(array3);
        stop = System.currentTimeMillis();
        long mergeSortTime = stop - start;
        
        System.out.println("\nBubbleSortin aika: " + bubbleSortTime + "ms");
        System.out.println("QuickSortin aika: " + quickSortTime + "ms");
        System.out.println("MergeSortin aika: " + mergeSortTime + "ms");
    }
}
