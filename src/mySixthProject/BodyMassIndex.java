package mySixthProject;
import java.util.Scanner;

public class BodyMassIndex {
	public static void main(String[]args) {
		double height,weight,bodyMassIndex;
		Scanner input=new Scanner(System.in);
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz:");
		height=input.nextDouble();
		System.out.print("Lütfen ağırlıgınızı giriniz:");
		weight=input.nextDouble();
		bodyMassIndex=weight/Math.pow(height, 2);
		System.out.println("Vücut kitle endeksiniz: "+bodyMassIndex);
		
		
	}

}
