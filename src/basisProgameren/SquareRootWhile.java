
package basisProgameren;

import java.util.Scanner;

public class SquareRootWhile {
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.print("Type a non-negative integer: ");
		int number = console.nextInt();
		int som = 0;
		
		while (number != -1) {
			som+=number;
			number = console.nextInt();


		}

		System.out.println("total= " + som);

	}

}
