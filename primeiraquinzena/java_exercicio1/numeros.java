import java.util.Scanner;
import java.io.*;
public class numeros
{
 public static void main (String args[])
 {
 int n1, n2, n3, soma, quadrado;
Scanner entrada = new Scanner(System.in); 
System.out.print("Digite o primeiro n�mero:");
n1 = entrada.nextInt();
System.out.println("Digite o segundo n�mero :");
n2 = entrada.nextInt();
System.out.println("Digite o terceiro : ");
n3 = entrada.nextInt();
soma = n1+n2+n3;
quadrado = soma *soma;
  System.out.println("A soma quadrada � = "+ quadrado);
 }
}