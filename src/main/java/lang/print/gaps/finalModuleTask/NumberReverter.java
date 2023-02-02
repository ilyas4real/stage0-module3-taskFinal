package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int result = 0;
        while (number >= 1) {
            result = result * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(result);
    }
}
