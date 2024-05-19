package Variation;

public class Depreciation {
    // StartOfMainMethod
    public static void main(String[] args) {
        long amount = 100000;
        long deppercent = 10;
        long year = 3;
        myCode(amount, deppercent, year);
    }
    // EndOfMainMethod

    private static void myCode(long amount, long deppercent, long year) {
        long num = amount;

        for (int i = 0; i < year; i++) {
            num = ((100 - deppercent) * num) / 100;
        }

        System.out.println("after depreciation = " + num);
    }
}
