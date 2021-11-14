package strategy;

public class BubbleSort implements SortStrategy {

    @Override
    public void sort(int[] array) {
        int n = array.length;
        int k;
        System.out.println("\n\nBubbleSort");
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
        }
        printNumbers(array);
    }
    
    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    private static void printNumbers(int[] input) {
        for(int i : input){
            System.out.print(i + ", ");
        }
        System.out.print("\n");
    }
}
