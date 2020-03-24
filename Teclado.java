package br;
import java.util.Scanner;

public class Teclado {

	public static String lerString(String rotulo) {
		System.out.println(rotulo);
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
	
	public static int lerInt(String rotulo) {
		System.out.println(rotulo);
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	public static long lerLong(String rotulo) {
		System.out.println(rotulo);
		Scanner scan = new Scanner(System.in);
		return scan.nextLong();
	}
	
	public static float lerFloat(String rotulo) {
		System.out.println(rotulo);
		Scanner scan = new Scanner(System.in);
		return scan.nextFloat();
	}
	
	public static double lerDouble(String rotulo) {
		System.out.println(rotulo);
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}
	
}
