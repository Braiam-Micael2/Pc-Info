import java.util.Scanner;
import java.io.*;

public class areadoretangulo
{
 public static void main (String args[])
 {
 Scanner area1 = new Scanner (System.in);
 double base, altura, area;
 System.out.println("Digite a base do ret�ngulo: ");
 base = area1.nextDouble();
 System.out.println("Digite a altura do ret�ngulo: ");
 altura = area1.nextDouble();
 area = base * altura;
 System.out.println("A �rea do ret�ngulo � "+ area);
 }
}