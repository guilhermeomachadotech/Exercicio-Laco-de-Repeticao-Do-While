import java.util.Scanner;
public class Fatora��o2 {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int num, fat=1, i=1;
		System.out.println ("Digite o n�mero a ser fatorado:");
		num=ler.nextInt();
		do {
			fat=i*fat;
			i++;
		}while (i<=num);
		System.out.println ("O resultado da fatora��o � "+fat);
		ler.close();
	}
}
