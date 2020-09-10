package PacoteJava;

import java.util.Scanner;
public class Potencia {
public static void main(String args[])
{
	int a,b,c;
	double d,r,s;
	
	Scanner ler= new Scanner(System.in);
	
	System.out.println("Entre com valor de (a): ");
	a= ler.nextInt();
	
	System.out.println("Entre com valor de (b): ");
	b= ler.nextInt();
	
	System.out.println("Entre com valor de (c): ");
	c= ler.nextInt();
	
	r=Math.pow((a+b),2);
	s=Math.pow((b+c),2);
	d=(r+s)/2;
	
	System.out.println("O valor de R: "+r+"\n"+"O valor de S: "+s+"\n"+"O valor de D: "+d);
}
}