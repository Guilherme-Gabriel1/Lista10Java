package lista10;

import java.util.Scanner;

public class Lista10Exercicio09 {
	
	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        int numero;
		        int maior = Integer.MIN_VALUE;
		        int menor = Integer.MAX_VALUE;

		        System.out.println("Digite valores inteiros positivos (digite um número negativo para encerrar):");

		        do {
		            System.out.print("Digite um número: ");
		            numero = sc.nextInt();

		            if (numero >= 0) {
		                if (numero > maior) {
		                    maior = numero;
		                }

		                if (numero < menor) {
		                    menor = numero;
		                }
		            }

		        } while (numero >= 0);

		        if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
		            System.out.println("\nMaior valor informado: " + maior);
		            System.out.println("Menor valor informado: " + menor);
		        } else {
		            System.out.println("\nNenhum valor positivo foi informado.");
		        }

		        sc.close();
		    
		




    }
}

