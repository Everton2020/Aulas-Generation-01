package LaçoCondicional;
import java.util.*;
public class IdadeNome {
public static void main(String args[])
{
	Scanner ler= new Scanner (System.in);
	
	int idade;
	String nome;
	
	System.out.println("Entre com sua idade: ");
	idade=ler.nextInt();
	
	ler.nextLine(); /*limpar buffer*/
	
	System.out.println("Entre com seu nome: ");
	nome=ler.nextLine();
	
	System.out.printf("Seu nome é: %s",nome);
	System.out.printf("\nSua idade é: %d",idade);
	
	if(idade>=18)
	{
	System.out.println("\nVocê é de Maior");
	}
	else if(idade<18 && idade>=0)
	{
	System.out.println("\nVocê é de Menor");
	}
	else
	{
	System.out.println("\nOpção Invalida");
	}
}
}
