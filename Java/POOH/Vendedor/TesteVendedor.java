package Vendedor;
import java.util.*;
public class TesteVendedor {
public static void main (String args[])
{
	Scanner ler= new Scanner (System.in);
	Vendedor1 v1= new Vendedor1 ("Everton Souza",123,500,0,1500);
	int resp;
	double resp2=0;
	
	
	System.out.println("Qual quantidade vendas?");
	resp2=ler.nextDouble();
	v1.setValorVendas(resp2);
	v1.setComissao1(resp2);
	System.out.println(v1.getComissao1(resp2));
	System.out.printf("Salario final: R$ %2f",v1.getSalario()+v1.getComissao1(resp2));
	}
}

