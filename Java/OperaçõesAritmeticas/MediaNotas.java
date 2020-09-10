package PacoteJava;

import java.util.Scanner;
public class MediaNotas {
public static void main(String args[])
{
  double n1,n2,n3,pn1,pn2,pn3,media;
  
  Scanner ler= new Scanner (System.in);
  
  System.out.println("Entre com a primeira nota: ");
  n1=ler.nextInt();
  
  System.out.println("Entre com a segunda nota: ");
  n2=ler.nextInt();
  
  System.out.println("Entre com a terceira nota: ");
  n3=ler.nextInt();
  
  pn1=(n1*2);
  pn2=(n2*3);
  pn3=(n3*5);
  media=(pn1+pn2+pn3)/(2+3+5);
  
  System.out.println("A media das notas é: "+media);
   
}
}