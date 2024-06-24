package Strategy;

public class SortContext {
    private ISortStrategy strategy;

    public SortContext(ISortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ISortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] data) {
        strategy.sort(data);
    }
}
