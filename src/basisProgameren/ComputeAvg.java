package basisProgameren;
import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	 int cijfer[] = new int[5];
    	 for(int index = 0;index < cijfer.length; index++) {
    		 cijfer[index] = sc.nextInt();
    	 } 
	   
    	 double sum = 0;
    	 for(int index = 0;index < cijfer.length; index++) {
    		 sum = sum + cijfer[index];
    	 }
    	 double gemiddelde = sum/cijfer.length;
	       System.out.println(sum);
	       
       
       
       
    }

}
