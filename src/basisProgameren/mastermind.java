package basisProgameren;

import java.util.Scanner;

public class mastermind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// kleuren
		String[] kleur = {"blauw","groen","geel","rood","paars","oranje"};
//		kleur[0] = "blauw";
//		kleur[1] = "groen";
//		kleur[2] = "geel";
//		kleur[3] = "rood";
//		kleur[4] = "paars";
//		kleur[5] = "oranje";

		// controllen
		String[] controllen = {"zwart","wit","niks"};
//		 controllen[0] = "zwart";
//		 controllen[1] = "wit";
//		 controllen[2] = "niks";

		// code
		String[] verborgenRijVak = {kleur[4],kleur[5],kleur[3],kleur[0]};
//		verborgenRijVak[0] = kleur[4];
//		verborgenRijVak[1] = kleur[5];
//		verborgenRijVak[2] = kleur[3];
//		verborgenRijVak[3] = kleur[0];
		boolean[] pinCorrect = {false,false,false,false};
//		pinCorrect[0] = false;
//		pinCorrect[1] = false;
//		pinCorrect[2] = false;
//		pinCorrect[3] = false;

		for (int loop = 1; (pinCorrect[0] == false || pinCorrect[1] == false || pinCorrect[2] == false
				|| pinCorrect[3] == false) && loop < 10; loop++) {
			
			
			System.out.println("Kies 4 kleuren ronde " + loop);
			System.out.println("================");

			System.out.print("- Pion 1 :");
			String gekozePion1Rij1 = sc.next();
			System.out.print("- Pion 2 :");
			String gekozePion2Rij1 = sc.next();
			System.out.print("- Pion 3 :");
			String gekozePion3Rij1 = sc.next();
			System.out.print("- Pion 4 :");
			String gekozePion4Rij1 = sc.next();
			System.out.println("================");
			String rij1Vak1 = gekozePion1Rij1;
			String rij1Vak2 = gekozePion2Rij1;
			String rij1Vak3 = gekozePion3Rij1;
			String rij1Vak4 = gekozePion4Rij1;

			// rij1Vak1
			if (rij1Vak1.equalsIgnoreCase(verborgenRijVak[0])) {
				System.out.println(controllen[0]);
				pinCorrect[0] = true;
			} else if ((rij1Vak1.equalsIgnoreCase(verborgenRijVak[1])) || (rij1Vak1.equalsIgnoreCase(verborgenRijVak[2]))
					|| (rij1Vak1.equalsIgnoreCase(verborgenRijVak[3]))) {
				System.out.println(controllen[1]);
			} else {
				System.out.println(controllen[2]);
			}

			// rij1Vak2
			if (rij1Vak2.equalsIgnoreCase(verborgenRijVak[1])) {
				System.out.println(controllen[0]);
				pinCorrect[1] = true;
			} else if ((rij1Vak2.equalsIgnoreCase(verborgenRijVak[0])) || (rij1Vak2.equalsIgnoreCase(verborgenRijVak[2]))
					|| (rij1Vak2.equalsIgnoreCase(verborgenRijVak[3]))) {
				System.out.println(controllen[1]);
			} else {
				System.out.println(controllen[2]);
			}

			// rij1Vak3
			if (rij1Vak3.equalsIgnoreCase(verborgenRijVak[2])) {
				System.out.println(controllen[0]);
				pinCorrect[2] = true;
			} else if ((rij1Vak3.equalsIgnoreCase(verborgenRijVak[1])) || (rij1Vak3.equalsIgnoreCase(verborgenRijVak[0]))
					|| (rij1Vak3.equalsIgnoreCase(verborgenRijVak[3]))) {
				System.out.println(controllen[1]);
			} else {
				System.out.println(controllen[2]);
			}

			// rij1Vak4
			if (rij1Vak4.equalsIgnoreCase(verborgenRijVak[3])) {
				System.out.println(controllen[0]);
				pinCorrect[3] = true;
			} else if ((rij1Vak4.equalsIgnoreCase(verborgenRijVak[1])) || (rij1Vak4.equalsIgnoreCase(verborgenRijVak[0]))
					|| (rij1Vak4.equalsIgnoreCase(verborgenRijVak[2]))) {
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
