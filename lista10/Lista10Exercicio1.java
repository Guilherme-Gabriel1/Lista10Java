package lista10;

public class Lista10Exercicio1 {

	public static void main(String[] args) {
		
		int numero = 15;
		
		do {
            int quadrado = numero * numero;
            System.out.println("O quadrado de " + numero + " é " + quadrado);
            numero++;
        }while(numero < 201);    

	}

}
