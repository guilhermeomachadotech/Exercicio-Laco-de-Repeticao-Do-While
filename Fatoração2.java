import java.util.Scanner;
public class Fatoração2 {
	public static void main (String[]args) {
		Scanner ler=new Scanner (System.in);
		int num, fat=1, i=1;
		System.out.println ("Digite o número a ser fatorado:");
		num=ler.nextInt();
		do {
			fat=i*fat;
			i++;
		}while (i<=num);
		System.out.println ("O resultado da fatoração é "+fat);
		ler.close();
	}
}
