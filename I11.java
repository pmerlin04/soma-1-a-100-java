package exerciciosComandoFor;

import java.util.Scanner;

public class I11 {

	public static void main(String[] args) {
		int cont, numero, soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(cont = 1; cont <= 100; cont ++) {
			System.out.println(cont);
			soma =cont+soma;
		}
		
		System.out.println("A soma dos números é " + soma);
	}

}
