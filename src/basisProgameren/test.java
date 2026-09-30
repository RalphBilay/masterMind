package basisProgameren;
import java.util.Scanner;

public class test extends Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aantal;
		String teken;
		System.out.println("hoeveel tekens wil je hebben?");
		aantal = sc.nextInt();
		System.out.println("welk teken wil je hebben");
		teken = sc.next();
		for(int i = 1; i <= aantal; i++) {
			for(int j = 1; j <= aantal; j++) {
				System.out.print(teken + "  ");
			} 
			System.out.println("");

		}
	}
}
