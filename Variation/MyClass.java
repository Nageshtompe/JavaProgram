package Variation;

public class MyClass 
{
	public static void main(String[] args) {
		//adv.24
		CanYouGuess.System("a", "b", "c", "d", "e", "f");
		CanYouGuess.Radio('f', 'e', 'd', 'c', 'b', 'a');
		CanYouGuess.TV(1, 2, 3, 4, 5, 6, 7, 8, 9);
        new CanYouGuess().Mobile(0.0, 0, 0, 2.0);
	}	
}

class CanYouGuess {
   
    void Mobile(double... d) {
        System.out.print(d[3]);
    }
    static void System(String... str) {
        for (String c : str)
            System.out.print(c);
        System.out.println();
    }
    static void Radio(char... chr) {
        for (char c : chr)
            System.out.print(c);
        System.out.println();
    }
    static void TV(int... is) {
        for (int i : is)
            System.out.print(i);
        System.out.println();
    }
}