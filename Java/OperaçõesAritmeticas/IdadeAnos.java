package PacoteJava;

import java.util.Scanner;
public class IdadeAnos {
public static void main (String args[])
{
int dias,anos,meses;

Scanner ler= new Scanner(System.in);

System.out.println("Entre com dias: ");
dias=ler.nextInt();

anos=(dias/365);
meses=(dias%365)/30;
dias=(dias%365)%30;

System.out.println("Dias convertidos em anos: "+anos+" ano(s)");
System.out.println("Dias convertidos em meses: "+meses+" mes(es)");
System.out.println("Dias convertidos em meses: "+dias+" dias(s)");
}
}