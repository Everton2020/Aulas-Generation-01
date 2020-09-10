package LaçosRepeticao;
import java.util.*;
public class Exercicio6 {
public static void main(String args[])
{
	Scanner ler=new Scanner(System.in);

	float num=0,soma=0,termo=0,media=0;
	
	do
	{
	System.out.println("Entre com um numero. (Aperte 0 para sair) : ");
	num=ler.nextFloat();
	
	if (num%3==0)
	{
     soma=num+soma;
 	 media=soma/termo;
 	 termo++;
	}
	}
	while(num!=0);
	{
	System.out.println("A Soma: "+soma+"\nA Media: "+media);
	}
}
}