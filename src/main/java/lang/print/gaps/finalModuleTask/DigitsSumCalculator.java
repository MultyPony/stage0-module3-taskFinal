package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int d1 = number / 1000;
        int d2 = (number % 1000) / 100;
        int d3 = ((number % 1000) % 100) / 10;
        int d4 = number % 10;

        System.out.println(d1 + d2 + d3 + d4);
    }
}
