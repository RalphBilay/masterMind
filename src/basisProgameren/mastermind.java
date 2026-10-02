package basisProgameren;
import java.util.Scanner;

public class mastermind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String speler1 = "code kraker";
		String speller2 = "code maker";

		String blouwePion = "blauw";
		String groenePion =  "groen";
		String gelePion = "geel";
		String rodePion = "rood";
		String paarsePion = "paars";
		String oranjePion = "oranje";

		//controllen
		String zwartePin = "zwart";
		String wittePin = "wit";
		String geenPin = "niks";
		
		//code
		String verborgenRijVak1 = paarsePion;
		String verborgenRijVak2 = oranjePion;
		String verborgenRijVak3 = rodePion;
		String verborgenRijVak4 = blouwePion;
		
		boolean pin1Correct = false;
		boolean pin2Correct = false;
		boolean pin3Correct = false;
		boolean pin4Correct = false;
		

for (int loop = 1;(pin1Correct == false || pin2Correct == false || pin3Correct == false || pin4Correct == false) && loop<10; loop++){
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
		//rij1Vak1
		if (rij1Vak1.equalsIgnoreCase(verborgenRijVak1))
		{
			System.out.println(zwartePin);
			pin1Correct = true;
		}
		else if( (rij1Vak1.equalsIgnoreCase(verborgenRijVak2)) 
				|| (rij1Vak1.equalsIgnoreCase(verborgenRijVak3)) 
				|| (rij1Vak1.equalsIgnoreCase(verborgenRijVak4)) )
		{
			System.out.println(wittePin);
		}
		else {
			System.out.println(geenPin);
		}

		//rij1Vak2
		if (rij1Vak2.equalsIgnoreCase(verborgenRijVak2))
		{
			System.out.println(zwartePin);
			pin2Correct = true;
		}
		else if( (rij1Vak2.equalsIgnoreCase(verborgenRijVak1)) 
				|| (rij1Vak2.equalsIgnoreCase(verborgenRijVak3)) 
				|| (rij1Vak2.equalsIgnoreCase(verborgenRijVak4)) )
		{
			System.out.println(wittePin);
		}
		else {
			System.out.println(geenPin);
		}

		//rij1Vak3
		if (rij1Vak3.equalsIgnoreCase(verborgenRijVak3))
		{
			System.out.println(zwartePin);
			pin3Correct = true;
		}
		else if( (rij1Vak3.equalsIgnoreCase(verborgenRijVak2)) 
				|| (rij1Vak3.equalsIgnoreCase(verborgenRijVak1)) 
				|| (rij1Vak3.equalsIgnoreCase(verborgenRijVak4)) )
		{
			System.out.println(wittePin);
		}
		else {
			System.out.println(geenPin);
		}

		//rij1Vak4
		if (rij1Vak4.equalsIgnoreCase(verborgenRijVak4))
		{
			System.out.println(zwartePin);
			pin4Correct = true;
		}
		else if( (rij1Vak4.equalsIgnoreCase(verborgenRijVak2)) 
				|| (rij1Vak4.equalsIgnoreCase(verborgenRijVak1)) 
				|| (rij1Vak4.equalsIgnoreCase(verborgenRijVak3)) )
		{
			System.out.println(wittePin);
		}
		else {
			System.out.println(geenPin);
		}
		

}



if(pin1Correct == true && pin2Correct == true && pin3Correct == true && pin4Correct == true) {
	System.out.println("Je hebt gewonnen");}
else {
	System.out.println("je hebt verloren");
}


	}}










