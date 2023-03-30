package practiseclasss;

import java.util.Scanner;

public class uifelseladder {

	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number");
			
			int numb = sc.nextInt();
			
			if (numb>0) {
				System.out.println("number is positive");
				
			}else if (numb<0) {
				System.out.println("number is negative");
			}
			else {
				System.out.println("number is o");
			}
			sc.close();
		}

	


}





