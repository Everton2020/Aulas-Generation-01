package PacoteJava;
import java.util.Scanner;
public class IdadeDias {
public static void main(String args[])
{
	int dias,meses,anos,conv1,conv2,soma;
	
	Scanner ler= new Scanner (System.in);

System.out.println("Entre com os anos: ");
anos=ler.nextInt();

System.out.println("Entre com os meses: ");
meses=ler.nextInt();

System.out.println("Entre com os dias: ");
dias=ler.nextInt();

conv1=anos*365;
conv2=meses*30;
soma=conv1+conv2+dias;

System.out.println("A conversão total para dias é: "+soma);
}
}