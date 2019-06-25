
package com.zup;

import java.util.Scanner;

public class SorteioEIdentificacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String resultado = "";
		int quantidadeTentativas = 1;
		String numeroSorteado = (int)
				(Math.random() * 10)+ ""+
				(int)(Math.random() * 10)+ "" +
				(int)(Math.random() * 10)+ "" +
				(int)(Math.random() * 10)+ "" +
				(int)(Math.random() * 10);

		do {
			resultado = "";
			System.out.println(" Digite numero de 5 posição");
			String numeroUsuario = sc.nextLine();
			if (numeroUsuario.length() == 5) {
				if (numeroUsuario == numeroSorteado) {
					resultado = "OOOOO";
				}else {
					for(int i = 0; i < 5; i ++) {

						if (numeroUsuario.charAt(i) == numeroSorteado.charAt(i)){
							resultado += "O";
						}else if(numeroSorteado.contains(numeroUsuario.charAt(i) + "")){
							resultado += "-";
						}else
							resultado += "X";
					}
				}
			}else {
				System.out.println("Vc digitou um numero sem 5 digitos");
			}
			System.out.println(resultado);
		}while(!resultado.equals("OOOOO") && quantidadeTentativas++ < 15);

		if(resultado.equals("OOOOO")) {
			System.out.println("Vc ganhou");
		}else {
			System.out.println("Vc perdeu");
		}
		System.out.println("Numero sorteado " + numeroSorteado);
		sc.close();

	}
}