package basisProgameren;

import java.util.Scanner;

public class mastermind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// vakken
		String[] vakken = new String[4];
		// kleuren
		String[] kleur = { "blauw", "groen", "geel", "rood", "paars", "oranje" };
		// controllen
		String[] controllen = { "zwart", "wit", "niks" };
		// code
		String[] verborgenRijVak = { kleur[4], kleur[5], kleur[3], kleur[0] };
		// controllen
		boolean[] pinCorrect = { false, false, false, false };

		for (int loop = 1; (pinCorrect[0] == false || pinCorrect[1] == false || pinCorrect[2] == false
				|| pinCorrect[3] == false) && loop <= 10; loop++) {

//			String[] gekozePionen = new String[4];
			System.out.println("Kies 4 kleuren ronde " + loop);
			System.out.println("================");

			for(int i = 0; i<4 ;i++) {
			System.out.print("- Pion " + (i + 1) + " :");
			vakken[i] = sc.next();
			}
			
			System.out.println("================");

			// rij1Vak1
			if (vakken[0].equalsIgnoreCase(verborgenRijVak[0])) {
				System.out.println(controllen[0]);
				pinCorrect[0] = true;
			} else if ((vakken[0].equalsIgnoreCase(verborgenRijVak[1]))
					|| (vakken[0].equalsIgnoreCase(verborgenRijVak[2]))
					|| (vakken[0].equalsIgnoreCase(verborgenRijVak[3]))) {
				System.out.println(controllen[1]);
			} else {
				System.out.println(controllen[2]);
			}

			// rij1Vak2
			if (vakken[1].equalsIgnoreCase(verborgenRijVak[1])) {
				System.out.println(controllen[0]);
				pinCorrect[1] = true;
			} else if ((vakken[1].equalsIgnoreCase(verborgenRijVak[0]))
					|| (vakken[1].equalsIgnoreCase(verborgenRijVak[2]))
					|| (vakken[1].equalsIgnoreCase(verborgenRijVak[3]))) {
				System.out.println(controllen[1]);
			} else {
				System.out.println(controllen[2]);
			}

			// rij1Vak3
			if (vakken[2].equalsIgnoreCase(verborgenRijVak[2])) {
				System.out.println(controllen[0]);
				pinCorrect[2] = true;
			} else if ((vakken[2].equalsIgnoreCase(verborgenRijVak[1]))
					|| (vakken[2].equalsIgnoreCase(verborgenRijVak[0]))
					|| (vakken[2].equalsIgnoreCase(verborgenRijVak[3]))) {
				System.out.println(controllen[1]);
			} else {
				System.out.println(controllen[2]);
			}

			// rij1Vak4
			if (vakken[3].equalsIgnoreCase(verborgenRijVak[3])) {
				System.out.println(controllen[0]);
				pinCorrect[3] = true;
			} else if ((vakken[3].equalsIgnoreCase(verborgenRijVak[1]))
					|| (vakken[3].equalsIgnoreCase(verborgenRijVak[0]))
					|| (vakken[3].equalsIgnoreCase(verborgenRijVak[2]))) {
				System.out.println(controllen[1]);
			} else {
				System.out.println(controllen[2]);
			}
			System.out.println("");

		}

		if (pinCorrect[0] == true && pinCorrect[1] == true && pinCorrect[2] == true && pinCorrect[3] == true) {
			System.out.println("================");
			System.out.println("Je hebt gewonnen");
		} else {
			System.out.println("================");
			System.out.println("je hebt verloren");
		}

	}
}
