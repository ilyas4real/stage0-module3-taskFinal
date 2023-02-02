package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int result = 0;
        while (number >= 1) {
            result = result + number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }
}
