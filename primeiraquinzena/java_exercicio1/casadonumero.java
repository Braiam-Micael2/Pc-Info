import java.util.Scanner;
import java.io.*;
public class casadonumero
{
 public static void main (String args[])
 {
 int n1, b = 1;
Scanner entrada = new Scanner(System.in); 
System.out.print("Digite um número:");
n1 = entrada.nextInt();
if (n1 < 0){
	n1 = -(n1);
}
if (n1 < 0){
	b = 0;
	while(n1 > 0){
		n1 = n1 / 10;
		b++;
	}
}
  System.out.println("A casa do número é = "+ b);
 }
}