package Variation;
public class FirstNonRepeatingCharacterInAString {
    public static void main(String[] args) {
        String s1 = "abcdabce";
        myCode(s1);
    }

    private static void myCode(String s1) {
        char[] charArray = s1.toCharArray();
        int[] charCount = new int[256];

        for (char c : charArray) {
            charCount[c]++;
        }

        for (char c : charArray) {
            if (charCount[c] == 1) {
                System.out.println(c);
                return;
            }
        }

        System.out.println("No non-repeated character found in the string.");
    }
}
