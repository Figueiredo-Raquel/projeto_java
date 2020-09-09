package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String args[])
	{
		
		 Scanner sc = new Scanner(System.in);
		
		 double n1,n2,n3,med;
		
		 System.out.print("Digite a primeira nota: ");
         n1 = sc.nextDouble();
         
         System.out.print("Digite a segunda nota: ");
         n2 = sc.nextDouble();
         
         System.out.print("Digite a terceira nota: ");
         n3 = sc.nextDouble();
         
         med=((n1*2)+(n2*3)+(n3*5))/10;
         
         System.out.print("\nA média ponderada é : "+med);
         
         
         sc.close();
		
		
		
		
	}
	
}
