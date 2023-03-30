package practiseclasss;

import java.util.Scanner;

public class scannerdemo2 {

	public static void main(String[] args) {
		
		Scanner nitin = new Scanner(System.in);
		
		
		System.out.println("enter place1");
		String place1 = nitin.next();
		
		
	 System.out.println("enter place2");
	 String place2 = nitin.next();
	 
	 if(place1.equals("sector15") && place2.equals("sector16")) {
		 System.out.println("you are in noida");
		 
	 }else
	 { System.out.println("you are not");
	 }
	 
nitin.close();
	}

}
