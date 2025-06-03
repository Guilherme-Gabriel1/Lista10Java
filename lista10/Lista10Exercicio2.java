package lista10;

public class Lista10Exercicio2 {

	public static void main(String[] args) {
		
		int numero = 1;
		int acumuladora = 0;
		
		do {
            acumuladora += numero;
            numero++;
        }
		while (numero < 501);
		System.out.println("A somatória dos numeros de 1 a 500 é " + acumuladora);

	}

}
