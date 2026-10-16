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
		String[] controle = { "zwart", "wit", "niks" };
		// code
		String[] verborgenVakken = { kleur[3], kleur[2], kleur[0], kleur[4] };
		// controllen
		boolean[] heeftGelijk = { false, false, false, false };

		for (int loop = 1; (heeftGelijk[0] == false || heeftGelijk[1] == false || heeftGelijk[2] == false
				|| heeftGelijk[3] == false) && loop <= 10; loop++) {

//			String[] gekozePionen = new String[4];
			System.out.println("Kies 4 kleuren ronde " + loop);
			System.out.println("================");

			for (int teller = 0; teller < 4; teller++) {
				System.out.print("- Pion " + (teller + 1) + " :");
				vakken[teller] = sc.next();
			}

			System.out.println("================");

			// eerste pion controle
			if (vakken[0].equalsIgnoreCase(verborgenVakken[0])) {
				System.out.println(controle[0]);
				heeftGelijk[0] = true;
			} else if ((vakken[0].equalsIgnoreCase(verborgenVakken[1]))
					|| (vakken[0].equalsIgnoreCase(verborgenVakken[2]))
					|| (vakken[0].equalsIgnoreCase(verborgenVakken[3]))) {
				System.out.println(controle[1]);
			} else {
				System.out.println(controle[2]);
			}

			// eerste pion controle
			if (vakken[1].equalsIgnoreCase(verborgenVakken[1])) {
				System.out.println(controle[0]);
				heeftGelijk[1] = true;
			} else if ((vakken[1].equalsIgnoreCase(verborgenVakken[0]))
					|| (vakken[1].equalsIgnoreCase(verborgenVakken[2]))
					|| (vakken[1].equalsIgnoreCase(verborgenVakken[3]))) {
				System.out.println(controle[1]);
			} else {
				System.out.println(controle[2]);
			}

			// eerste pion controle
			if (vakken[2].equalsIgnoreCase(verborgenVakken[2])) {
				System.out.println(controle[0]);
				heeftGelijk[2] = true;
			} else if ((vakken[2].equalsIgnoreCase(verborgenVakken[1]))
					|| (vakken[2].equalsIgnoreCase(verborgenVakken[0]))
					|| (vakken[2].equalsIgnoreCase(verborgenVakken[3]))) {
				System.out.println(controle[1]);
			} else {
				System.out.println(controle[2]);
			}

			// eerste pion controle
			if (vakken[3].equalsIgnoreCase(verborgenVakken[3])) {
				System.out.println(controle[0]); 
				heeftGelijk[3] = true;
			} else if ((vakken[3].equalsIgnoreCase(verborgenVakken[1]))
					|| (vakken[3].equalsIgnoreCase(verborgenVakken[0]))
					|| (vakken[3].equalsIgnoreCase(verborgenVakken[2]))) {
				System.out.println(controle[1]);
			} else {
				System.out.println(controle[2]);
			}
			System.out.println("");

		}

		if (heeftGelijk[0] == true && heeftGelijk[1] == true && heeftGelijk[2] == true && heeftGelijk[3] == true) {
			System.out.println("================");
			System.out.println("Je hebt gewonnen");
		} else {
			System.out.println("================");
			System.out.println("je hebt verloren");
		}

	}
}
