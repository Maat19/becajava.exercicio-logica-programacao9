
import java.util.Scanner;

public class Votos {

	public int Total;
	public float Val;
	public float Brancos;
	public float Nulos;
	public float Calcularvalidos;
	public float Calcularbrancos;
	public float Calcularnulos;

	
	public Scanner Leitura = new Scanner(System.in);
	
		

		public void coletandoDados() {
			
			System.out.println("Total de votos:");
			Total = Leitura.nextInt();
			
			System.out.println("Total de votos válidos:");
			Val = Leitura.nextFloat();
			
			System.out.println("Total de votos brancos:");
			Brancos = Leitura.nextFloat();
			
			System.out.println("Total de votos nulos:");
			Nulos = Leitura.nextFloat();
		}
			
		
		public void resolvendoConta() {
			
			Calcularvalidos = (Val/Total)*100;
			Calcularbrancos = (Brancos / Total) *100;
			Calcularnulos =   (Nulos / Total)*100;
			
		}
	
		public void mostrandoResultados() {
			System.out.println("Votos Válidos:" +Val+ "%");
			System.out.println("votos brancos: " + Brancos + ("%"));
			System.out.println("votos nulos: " + Nulos + ("%"));
		}
		
}
 