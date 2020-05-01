package mx.com.app.prueba;

import java.util.Scanner;

public class HolaMundoGit {

	
	public static void main(String[] args) {
		System.out.println("Hola mundo con git");
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa tu nombre ");
		String nombre = sc.next();
		System.out.println("Bienvenido " + nombre);
	}
}
