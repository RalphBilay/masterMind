package basisProgameren;

import java.util.Scanner;

public class Main extends ShoppingCart {

	public static void main(String[] args) {
		System.out.println("de for loop start nu");
		for (int aantal = 0; aantal <= 10; aantal++) {

			System.out.print(aantal);
			if (  (aantal % 2)== 0) {
				System.out.println(" => even");
			}
			else if ( (aantal % 2)> 0) {
				System.out.println(" => oneven");
			}}
		System.out.println("de for loop is geeindigt");









	}

}
