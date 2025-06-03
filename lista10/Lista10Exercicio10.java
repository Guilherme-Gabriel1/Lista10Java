package lista10;

import java.util.Scanner;

public class Lista10Exercicio10 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o dividendo: ");
		int dividendo = sc.nextInt();
		
		System.out.print("Digite o divisor: ");
		int divisor = sc.nextInt();
		
		if (divisor == 0) {
		    System.out.println("Erro: divisão por zero não é permitida.");
		} else {
		    int quociente = 0;
		    int resto = dividendo;
		
		    while (resto >= divisor) {
		        resto -= divisor;
		        quociente++;
		    }
		
		    System.out.println("Resultado da divisão inteira:");
		    System.out.println("Quociente: " + quociente);
		    System.out.println("Resto: " + resto);
		}
		
		sc.close();
		    
    }
}

