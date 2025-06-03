package lista10;

public class Lista10Exercicio4 {

	public static void main(String[] args) {
	
		        double graosNaCasa = 1;
		        double totalGraos = 0;
		        double casa = 1;

		        do {
		        	totalGraos += graosNaCasa;
		            System.out.println("Casa " + casa + ": " + graosNaCasa + " grãos");
		            graosNaCasa *= 2;
		            casa++;
		        }while(casa < 65);
		        

		        System.out.println("\nTotal de grãos no tabuleiro: " + totalGraos);
		
		

		
	}

}
