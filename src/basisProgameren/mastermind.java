package basisProgameren;
import java.util.Scanner;

public class mastermind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String speler1 = "code kraker";
		String speller2 = "code maker";

		String blouwePion = "blouw";
		String groenePion =  "groen";
		String gelePion = "geel";
		String rodePion = "rood";
		String paarsePion = "paars";
		String oranjePion = "oranje";

		//controllen
		String zwartePin = "zwart";
		String wittePin = "wit";
		String geenPin = "niks";



		String verborgenRijVak1 = "paars";
		String verborgenRijVak2 = "oranje";
		String verborgenRijVak3 = "rood";
		String verborgenRijVak4 = "blouw";

		System.out.println("Kies 4 kleuren:");
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

		String rij2Vak1 ="";
		String rij2Vak2 ="";
		String rij2Vak3 ="";
		String rij2Vak4 ="";

		String rij3Vak1 ="";
		String rij3Vak2 = "";
		String rij3Vak3 ="";
		String rij3Vak4 ="";

		String rij4Vak1 ="";
		String rij4Vak2 ="";
		String rij4Vak3 ="";
		String rij4Vak4 ="";

		String rij5Vak1 ="";
		String rij5Vak2 ="";
		String rij5Vak3 ="";
		String rij5Vak4 ="";

		String rij6Vak1 ="";
		String rij6Vak2 ="";
		String rij6Vak3 ="";
		String rij6Vak4 ="";

		String rij7Vak1 ="";
		String rij7Vak2 = "";
		String rij7Vak3 ="";
		String rij7Vak4 ="";

		String rij8Vak1 ="";
		String rij8Vak2 ="";
		String rij8Vak3 ="";
		String rij8Vak4 ="";

		String rij9Vak1 ="";
		String rij9Vak2 ="";
		String rij9Vak3 ="";
		String rij9Vak4 ="";

		String rij10Vak1 ="";
		String rij10Vak2 ="";
		String rij10Vak3 ="";
		String rij10Vak4 ="";

		String controlerRij1Vak1 ="";
		String controlerRij1Vak2 ="";
		String controlerRij1Vak3 ="";
		String controlerRij1Vak4 ="";

		String controlerRij2Vak1 ="";
		String controlerRij2Vak2 ="";
		String controlerRij2Vak3 ="";
		String controlerRij2Vak4 ="";

		String controlerRij3Vak1 ="";
		String controlerRij3Vak2 ="";
		String controlerRij3Vak3 ="";
		String controlerRij3Vak4 ="";

		String controlerRij4Vak1 ="";
		String controlerRij4Vak2 ="";
		String controlerRij4Vak3 ="";
		String controlerRij4Vak4 ="";

		String controlerRij5Vak1 ="";
		String controlerRij5Vak2 ="";
		String controlerRij5Vak3 ="";
		String controlerRij5Vak4 ="";

		String controlerRij6Vak1 ="";
		String controlerRij6Vak2 ="";
		String controlerRij6Vak3 ="";
		String controlerRij6Vak4 ="";

		String controlerRij7Vak1 ="";
		String controlerRij7Vak2 ="";
		String controlerRij7Vak3 ="";
		String controlerRij7Vak4 ="";

		String controlerRij8Vak1 ="";
		String controlerRij8Vak2 ="";
		String controlerRij8Vak3 ="";
		String controlerRij8Vak4 ="";

		String controlerRij9Vak1 ="";
		String controlerRij9Vak2 ="";
		String controlerRij9Vak3 ="";
		String controlerRij9Vak4 ="";

		String controlerRij10Vak1 ="";
		String controlerRij10Vak2 ="";
		String controlerRij10Vak3 ="";
		String controlerRij10Vak4 ="";

		//rij1Vak1
		if (rij1Vak1.equalsIgnoreCase(verborgenRijVak1))
		{
			System.out.println(zwartePin);
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

		//rij1Vak3
		if (rij1Vak4.equalsIgnoreCase(verborgenRijVak4))
		{
			System.out.println(zwartePin);
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


		//				} else if(rij1Vak1 == verborgenRijVak2);{
		//					System.out.println(wittePin);
		//					}}

	}}










