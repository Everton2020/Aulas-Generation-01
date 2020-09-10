package PacoteJava;

import java.util.Scanner;
public class CarroNovo {
public static void main(String args[])
{
	double carnov,custfab,dist,imp;

	Scanner ler= new Scanner (System.in);
	
System.out.println("Entre com o custo da fabrica: ");
custfab=ler.nextDouble();

dist=(custfab*0.28);
imp=(custfab*0.45);
carnov=custfab+dist+imp;

System.out.println("Baseado no custo da fabrica..."+"\nO Percentual do vendedor será: "+dist+"\nO Imposto será: "+imp+"\nLogo o valor do carro novo será: "+carnov);
}
}