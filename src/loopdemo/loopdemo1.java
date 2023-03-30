package loopdemo;

import java.util.Scanner;

public class loopdemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("please give the number up to which you want sum");
		 
		 
		 int numb = sc.nextInt();
		 int sum= 1;
		 for (int i =1; i<=numb;i++) {
		 System.out.println(i);
          sum=sum + i;
		 }
		 System.out.println("the sum of the number is =" +sum);
		 sc.close();
	}

}
