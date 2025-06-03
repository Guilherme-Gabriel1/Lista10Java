package lista10;

import java.util.Scanner;

public class Lista10Exercicio8 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        double areaTotal = 0;
        String resposta;

        do {
            System.out.print("Nome do cômodo: ");
            String nomeComodo = sc.nextLine();

            System.out.print("Largura do " + nomeComodo + " (em metros): ");
            double largura = sc.nextDouble();

            System.out.print("Comprimento do " + nomeComodo + " (em metros): ");
            double comprimento = sc.nextDouble();

            double areaComodo = largura * comprimento;
            System.out.println("Área do " + nomeComodo + ": " + areaComodo + " m²\n");

            areaTotal += areaComodo;
            
            System.out.print("Deseja continuar adicionando cômodos? (Digite NAO para sair): ");
            resposta = sc.nextLine();

            System.out.println();

        } while (resposta == ("não"));

        System.out.println("Área total da residência: " + areaTotal + " m²");
        sc.close();



    }
}

