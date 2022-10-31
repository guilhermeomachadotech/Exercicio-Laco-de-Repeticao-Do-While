import java.util.Scanner;
public class Potencia2 {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int expoente,i=1;
		double base, potencia=1;
		System.out.println ("Digite a base da potência:");
		base=ler.nextDouble();
		System.out.println ("Digite o expoente da potência:");
		expoente=ler.nextInt();
		do {
			potencia=potencia*base;
			i++;
		}while (i<=expoente);
		System.out.println ("O resultado da potência é "+potencia);
		ler.close();
	}
}
