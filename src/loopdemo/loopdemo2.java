package loopdemo;

import java.util.Scanner;

public class loopdemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numb for which you want to get the factorial");
		
		
		int numb = sc.nextInt();
		
		long fact = 1;
		
		for (int i = 1; i <=numb; i++) {
			System.out.println(i);
			fact = fact * i;
		}
			System.out.println("factorial of the nmber is" +fact);	
			sc.close();
		
		
		
	

	}

}
