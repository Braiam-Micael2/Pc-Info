import java.util.Scanner;
import java.io.*;
public class areadotriangulo
{
 public static void main (String args[])
 {
 float base, altura, area;
Scanner entrada = new Scanner(System.in); 
System.out.print("Digite a base:");
base = entrada.nextFloat();
System.out.println("Digite a altura:");
altura = entrada.nextFloat();
area = (base * altura )/2;
  System.out.println("A área do triângulo é = "+ area);
 }
}