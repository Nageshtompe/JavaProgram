package Variation;

public class AllFActorial {
    public static void main(String[] args) {
        int n = 100; // Change this to your desired value
        printFactorialNumbers(n);
    }

    public static void printFactorialNumbers(int n) {
        int factorial = 1;
        int i = 1;

        while (factorial <= n) {
            System.out.print(factorial + " ");
            i++;
            factorial = factorial * i;
        }
    }
}
