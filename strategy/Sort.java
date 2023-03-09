package strategy;

public class Sort {
    private SortStrategy strategy;
    
    public Sort(SortStrategy strategy){
        this.strategy = strategy;
    }
    
    public void sort(int[] array){
        strategy.sort(array);
    }
}
