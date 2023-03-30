package practiseclasss;

import java.util.Scanner;

public class tforloopdemo {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter your name");
		String name = sc.next();
		for(int i=1;i<=5;i++) {
			System.out.println(name);
		}
		sc.close();
	}

}
