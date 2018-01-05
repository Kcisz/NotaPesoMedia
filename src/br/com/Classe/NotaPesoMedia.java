package br.com.Classe;

import java.util.Scanner;

public class NotaPesoMedia {

	public static void main(String ars[]) {

		Double n1, n2, n3;
		int p1, p2, p3;
		Double mediaDecimal;

		@SuppressWarnings("resource")
		Scanner dado = new Scanner(System.in);
		System.out.println("Por favor insira a N1:");
		n1 = dado.nextDouble();
		System.out.println("Por favor insira a N2:");
		n2 = dado.nextDouble();
		System.out.println("Por favor insira a N3:");
		n3 = dado.nextDouble();
		System.out.println("Por favor insira a P1:");
		p1 = dado.nextInt();
		System.out.println("Por favor insira a P2:");
		p2 = dado.nextInt();
		System.out.println("Por favor insira a P3:");
		p3 = dado.nextInt();

		int s1, s2, s3;

		s1 = (int) (n1 * p1);
		s2 = (int) (n2 * p2);
		s3 = (int) (n3 * p3);

		int totalP = p1 + p2 + p3;
		Double media = (double) (s1 + s2 + s3) / totalP;
		System.out.println("A media é: " + media);

	}

}
