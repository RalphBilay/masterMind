/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basisProgameren;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class AgeValidity {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	boolean drivingUnderAge = false;
    	
    	System.out.println("What is your age?");
    	int age = sc.nextInt();
    	
    	drivingUnderAge = age <= 17;
    	
    	System.out.println(drivingUnderAge);
    	
    	}

       
    }

