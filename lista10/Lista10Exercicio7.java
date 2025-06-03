package lista10;

public class Lista10Exercicio7 {

	public static void main(String[] args) {
		
		int numero = 1;
		
		do {
		    if (numero % 2 != 0) {
		long fatorial = 1;
		int contador = 1;
		
		do {
		    fatorial *= contador;
		    contador++;
		} while (contador <= numero);
		
		System.out.println("Fatorial de " + numero + " é: " + fatorial);
		            }
		
		            numero++;
		        } while (numero <= 10);
		    }
		}

