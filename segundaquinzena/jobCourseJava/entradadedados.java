package jobCourseJava;
import java.util.Scanner;

public class entradadedados {

	public static void main(String[] args) {
		
		System.out.println("Entre com o seu nome: ");
		Scanner lerNome = new Scanner(System.in);
		String nome = lerNome.next();
		
		System.out.println("Entre com a sua idade: ");
		Scanner lerIdade = new Scanner(System.in);
		int idade = lerIdade.nextInt();
		
		System.out.println("meu nome é "+nome+" e tenho "+idade+" anos");
	}
}
