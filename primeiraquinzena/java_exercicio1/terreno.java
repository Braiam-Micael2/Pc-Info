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
 System.out.println("A base do ret�ngulo �: ");
 base = area1.nextDouble();
 System.out.println("A altura do ret�ngulo �: ");
 altura = area1.nextDouble();
 System.out.println("O preco do ret�ngulo �: ");
 preco = area1.nextDouble();
 m = base * altura * preco;
 System.out.println("O valor do ret�ngulo �: "+ m);
 }
}