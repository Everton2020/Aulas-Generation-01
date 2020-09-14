package Matrizes;
import java.util.*;
public class ExemploVideo1 {
public static void main (String args[])
{
 Scanner entrada = new Scanner (System.in);
 
 int [][] matriz = new int [3][3];
 int maior=0;
 
 	
 	
 	for(int linha=0;linha<3;linha++) {
 	 for(int coluna=0;coluna<3;coluna++){
 		System.out.printf("Insira o elemento M[%d][%d]: ", linha+1,coluna+1);
 		matriz[linha][coluna]=entrada.nextInt();
 		if(matriz[linha][coluna]>10)
 		{
 		maior++;
 		}
 	 	}
 		}
 		for(int linha=0;linha<3;linha++) {
	 	     for(int coluna=0;coluna<3;coluna++){
	 		System.out.printf("\t [%d] \t",matriz[linha][coluna]);
	 	 }	 	 
	 	 System.out.println();
	}
 		System.out.println("Numeros maiores que (10): "+maior);
}
}