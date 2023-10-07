package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void main(String[] args) {
        DigitsSumCalculator dsc = new DigitsSumCalculator();
        dsc.calculateSum(9999);
    }
    public void calculateSum(int number) {
        if (number > 999 && number < 10000) {
            int tenThousandths = (number / 1000) % 10;
            int hundreds = (number / 100) % 10;
            int tens = (number / 10) % 10;
            int units = number % 10;
            System.out.println(tenThousandths + units + tens + hundreds);
        }
    }
}
