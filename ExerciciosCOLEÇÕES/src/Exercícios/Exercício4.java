package Exercícios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercício4 {

	public static void main(String[] args) {

		Set<Integer> numeros = new HashSet();
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("------------------------------------------------");
		System.out.println("Digite um número para procurar na Collection: ");
		Integer numero = leia.nextInt();
		
		
		if(numeros.contains(numero)) {
			System.out.println("---------------------------");
			System.out.println("O número "+numero+" foi encontrado!");
			System.out.println("---------------------------");
		}else {
			System.out.println("---------------------------");
			System.out.println("O número "+numero+" não foi encontrado!");
			System.out.println("---------------------------");
		}

	}

}
