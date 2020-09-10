package PacoteJava;

import java.util.Scanner;
public class RaizQuadrada {
public static void main (String args[])
{
	int x1,x2,y1,y2;
	double d,p1,p2;
	
	Scanner ler= new Scanner(System.in);
	
	System.out.println("Entre com o valor de X1: ");
	x1=ler.nextInt();
	
	System.out.println("Entre com o valor de X2: ");
	x2=ler.nextInt();
	
	System.out.println("Entre com o valor de Y1: ");
	y1=ler.nextInt();
	
	System.out.println("Entre com o valor de Y2: ");
	y2=ler.nextInt();
	
	p1=Math.pow((x2-x1),2);
	p2=Math.pow((y2-y1),2);
	d=Math.sqrt(p1+p2);
	
	System.out.println("O valor de P1: "+p1+"\nO valor de P2: "+p2+"\nO valor de (d): "+d);
}
}