
import java.util.Scanner;

public class Votos {

	public int Total;
	public float Val;
	public float Brancos;
	public float Nulos;
	public float Res1;
	public float Res2;
	public float Res3;

	
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
			
			Res1 = (Val/Total)*100;
			Res2 = (Brancos / Total)*100;
			Res3 =  (Nulos / Total)*100;
			
		
			System.out.println("Votos Válidos:" +Res1+ "%");
			System.out.println("votos brancos: " + Res2 + ("%"));
			System.out.println("votos nulos: " + Res3 + ("%"));
		}
		
}
 