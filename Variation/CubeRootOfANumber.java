package Variation;

public class CubeRootOfANumber {
    public static void main(String[] args) {
        int n = 69;
        myCode(n);
    }

    public static void myCode(int n) {
        int cubeRoot = 1;

        while (cubeRoot * cubeRoot * cubeRoot <= n) {
            cubeRoot++;
        }

        System.out.println(cubeRoot - 1);
    }
}
