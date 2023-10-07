package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public static void main(String[] args) {
        NumbersPrinter n = new NumbersPrinter();
        n.printIsPositive(0);
    }
    public void printIsPositive(int number) {
        System.out.println(number > 0);
    }
}
