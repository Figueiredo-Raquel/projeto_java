package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String args[])
	{
	      Scanner sc = new Scanner(System.in);
		
		  double r,s,d,a,b,c;
		
		  System.out.print("Insira o valor de A :");
	      a = sc.nextDouble();
	      
	      System.out.print("Insira o valor de B :");
	      b = sc.nextDouble() ;
	      
	      System.out.print("Insira o valor de C :");
	      c = sc.nextDouble() ;

	      r=Math.pow((a+b), 2.0);
	      s=Math.pow((b+c),2.0);
	      d=(r+s)/2;

	      System.out.printf("\nO valor total de d é : "+d );      

	      sc.close();
		
		
		
		
	}
	
	
	
	
}
