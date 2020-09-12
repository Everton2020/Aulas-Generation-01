package Vetor;
import java.util.*;
public class VetorA {
public static void main (String args[])
{
  Scanner ler=new Scanner (System.in);
  int[]	vetorA= {1,0,5,-2,-6,7};
  int soma=0;
  
  for(int i=0;i<6;i++)
  {
	 System.out.println(i+":"+vetorA[i]);//demonstração valores
	 
	 if(i==3)//mudar o valor
	 {
		 vetorA[4]=100;
	 }
  }
  soma=vetorA[0]+vetorA[1]+vetorA[5];//realizar soma posições definidas
  System.out.println("Soma: "+soma); 
  }
}
