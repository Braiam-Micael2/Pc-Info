import java.util.Scanner;
import java.io.*;

import java.util.Scanner;
import java.io.*;

public class terreno
{
 public static void main (String args[])
 {
 Scanner area1 = new Scanner (System.in);
 double base, altura, preco, m;
 System.out.println("A base do retângulo é: ");
 base = area1.nextDouble();
 System.out.println("A altura do retângulo é: ");
 altura = area1.nextDouble();
 System.out.println("O preco do retângulo é: ");
 preco = area1.nextDouble();
 m = base * altura * preco;
 System.out.println("O valor do retângulo é: "+ m);
 }
}