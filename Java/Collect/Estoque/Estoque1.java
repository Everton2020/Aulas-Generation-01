package Estoque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Estoque1 {
public static void main (String arg[])
{
	Scanner ler = new Scanner (System.in);
	Collection <String> estoque = new ArrayList();
	int resp=0,resp2;
	String produto = null,novo,verifica;
	
	do
	{
	System.out.println("\nOlá! O que gostaria de fazer hoje? \n(1) Mostrar produtos no estoque \n(2) Adicionar produtos ao estoque \n(3) Remover produto do estoque \n(4) Substituir produto no estoque \n(0) Sair ");
	resp2=ler.nextInt();
	
	switch(resp2)
	{
	case 2: System.out.println("Adicione produto ao estoque");
	produto=ler.next();
	estoque.add(produto);
	System.out.println("Adicionado: "+produto);
	 break;
	case 3: 
		if (estoque.contains(produto))
		{
			System.out.println("Remova produto:"+estoque);
			produto=ler.next();
			estoque.remove(produto);
		 System.out.println("Removido: "+produto);
		}
		else
		{
		System.out.println("O estoque não possui o produto");
		}
	break;
	case 4: if (estoque.isEmpty())
	{
	System.out.println("O estoque não possui produto");
	}else
	{
		System.out.println("Qual produto gostaria de substituir? "+estoque);
		produto = ler.next();
		System.out.println("Digite o nome do produto que entrará no lugar de "+produto+":");
		novo = ler.next();
		
		if(estoque.contains(produto))
		{
			estoque.remove(produto);
			estoque.add(novo);
		}
		System.out.println(estoque);
		
	}
		break;
	case 1: if(estoque.isEmpty())
	{
		System.out.println("O estoque não possui produto");
	}else
		System.out.println("O estoque atual possui "+estoque);
	 break;

	default:
	}
	}
	while (resp2!=0);
	{
	System.out.println("Obrigado por usar nosso sistema!");
	}
}
}