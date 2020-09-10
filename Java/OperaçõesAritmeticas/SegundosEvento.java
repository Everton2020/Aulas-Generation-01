package PacoteJava;

import java.util.Scanner;
public class SegundosEvento {
public static void main (String args[])
{
	int horas,minutos,segundos;
		
	Scanner ler= new Scanner(System.in);
		
	System.out.println("Entre com os segundos: ");
	segundos=ler.nextInt();
		
	horas=segundos/3600;
	minutos=(segundos%3600)/60;
	segundos=(segundos%3600)%60;
		
	System.out.println("Segundos convertidos em: "+"\n"+horas+" hora(s)"+"\n"+minutos+" minuto(s)"+"\n"+segundos+" segundo(s)");
}
}

