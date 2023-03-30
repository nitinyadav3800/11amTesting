package practiseclasss;

import java.util.Scanner;

public class scannerdemo3 {

	public static void main(String[] args) {
		
		Scanner rahul = new Scanner(System.in);
		
		System.out.println("please enter your age");
		int age =rahul.nextInt();

	if(age<18) {
		System.out.println("you can not vote");
	}else
		
	{System.out.println("you can vote");
	}
	rahul.close();
	}

}
