package practiseclasss;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		
		Scanner pb = new Scanner(System.in);
	
	
	System.out.println("enter numb1:");
	int a = pb.nextInt();
	
	System.out.println("enter numb2:");
	int b = pb.nextInt();
	
	int sum = a+b;
	System.out.println("the sum of the two numb:" +sum);
	
	int sub = (a-b);
	System.out.println( +sub);
	
	int mul = (a*b);
	System.out.println("the sub of the two numb:" +mul);
	
	int div = (a/b);
	System.out.println("the sub of the two numb:" +div);
	
	
	
	pb.close();
	
	

	}

}
