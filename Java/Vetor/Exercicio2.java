package Vetor;
import java.util.*;
public class Vetor6 {
public static void main (String args[])
{
	Scanner ler= new Scanner (System.in);
	
	int vetor6[]= new int [6];
	int i=0,impar=0,somap=0;
	
	for(i=0;i<6;i++)
	{
		System.out.println("Entre com um valor: ");
		vetor6[i]=ler.nextInt();
		
		if(vetor6[i]%2==0)
		{
		 somap = somap+vetor6[i];
		 System.out.println("Par: "+vetor6[i]);
		}
	else
	{
	impar++;
	System.out.println("Impar: "+vetor6[i]);
	}
	}
	System.out.println("\nSoma:"+somap);
	System.out.println("\nQuantos impares:"+impar);
}
}
