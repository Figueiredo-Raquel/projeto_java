package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String args[]) 
    {
	   
	    Scanner sc = new Scanner(System.in);
		
  	    int anos,meses,dias,totaldias;
  	  
  	    System.out.print("Digite os anos: \n");
		anos = sc.nextInt();
		
		System.out.print("Digite os meses: \n");
	    meses = sc.nextInt();
		
		System.out.print("Digite os dias: \n");
		dias = sc.nextInt();

		totaldias=anos*360;
		totaldias=totaldias+(meses*30);
		totaldias=totaldias+dias;

		System.out.printf("O total de dias é:\n"+totaldias);
  	  
		sc.close();
  	  
  	  
    }

	
	
	
	
	
	
	
	
	
	
	
}
