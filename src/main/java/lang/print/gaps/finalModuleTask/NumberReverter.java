package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void main(String[] args) {
        NumberReverter nr = new NumberReverter();
        nr.revert(687);
    }
    public void revert(int number) {
        if (number < 0) {
            number *= -1;
        }
        if (number > 99 && number < 1000) {
            int hundreds = (number / 100) % 10;
            int tens = (number / 10) % 10;
            int units = number % 10;
            System.out.printf("%d%d%d", units, tens, hundreds);
        }
    }
}
