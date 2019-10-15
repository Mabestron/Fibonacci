package com.Fibonacci.app;

import java.util.Scanner;
public class FibonacciSerie {

	public static void main(String[] args) {
		int cont1=1;
		int cont2=0;
		int fibonacci=0;
		int bound=0;
		
		Scanner input = new Scanner (System.in);
		
		do
		{
			System.out.println("¿Cúantos fibonaccis desea calcular?: ");
			bound = input.nextInt();
			
			if (bound<=0)
			{
				System.out.println("Introduzca un numero positivo");
			}
			
			
		}while(bound<=0);
		
		
		for (int i=0;i<bound;i++) 
		{
			System.out.println(fibonacci);
			fibonacci=cont1+cont2;
			cont1=cont2;
			cont2=fibonacci;
			
		}

	}

}
