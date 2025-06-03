package lista10;

import java.util.Scanner;

public class Lista10Exercicio5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double somaFatoriais = 0;

        for (int inteiro = 1; inteiro <= 15; inteiro++) {
            System.out.print("Digite o " + inteiro + "º número inteiro: ");
            int numero = sc.nextInt();

            double fatorial = 1;
            int j = numero;

            while (j > 1) {
                fatorial *= j;
                j--;
            }

            System.out.println("Fatorial de " + numero + " é: " + fatorial);
            somaFatoriais += fatorial;
        }

        System.out.println("Soma dos fatoriais dos 15 números é: " + somaFatoriais);
        sc.close();
		
	}

}
