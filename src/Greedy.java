public class Greedy {
    private int total;
    private int result;

    public Greedy(int total) {
        this.total = total;
        this.result = 0;
        System.out.printf("%d\n", total);
    }

    public void start() {
        result += total / 500;
        total %= 500;
        result += total / 100;
        total %= 100;
        result += total / 50;
        total %= 50;
        result += total / 10;
        System.out.printf("%d", result);
    }
}
