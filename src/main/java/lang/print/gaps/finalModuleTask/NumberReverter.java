package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int firstDigit = (number / 100);
        int middleDigit = ((number % 100) / 10) * 10;
        int lastDigit = (number % 10) * 100;

        System.out.println(firstDigit + middleDigit + lastDigit);
    }
}
