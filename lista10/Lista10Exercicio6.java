package lista10;

import java.util.Scanner;

public class Lista10Exercicio6 {

	public static void main(String[] args) {
	
		
		        Scanner sc = new Scanner(System.in);

		        int quantidade = 0;
		        double soma = 0;
		        double valor;

		        System.out.println("Digite valores positivos (um número negativo para encerrar):");

		        do {
		            System.out.print("Digite um valor: ");
		            valor = sc.nextDouble();

		            if (valor >= 0) {
		                soma += valor;
		                quantidade++;
		            }

		        } while (valor >= 0);

		        if (quantidade > 0) {
		            double media = soma / quantidade;
		            System.out.println("\nTotal de valores lidos: " + quantidade);
		            System.out.println("Somatório: " + soma);
		            System.out.println("Média: " + media);
		        }

		        sc.close();
		
		

		
	}

}
