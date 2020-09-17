package Administrador;
import java.util.*;
public class TesteAdministrador1 {
public static void main (String args[])
{
	Scanner ler = new Scanner (System.in);
	Administrador1 adm1 = new Administrador1 ("João Pereira",123456789,0,0,0,0,7500);
	double resp1,resp2,resp3;
	
	System.out.println("Bem vindo Sr(a): "+adm1.getNome());
	System.out.println("Sr(a)"+adm1.getNome()+" por favor, declare seus gastos com viagens: ");
	resp1=ler.nextDouble();
	adm1.setDespesa1(resp1);
	
	System.out.println("Sr(a)"+adm1.getNome()+" por favor, declare seus gastos com estadia: ");
	resp2=ler.nextDouble();
	adm1.setDespesa2(resp2);
	
	System.out.println("Sr(a)"+adm1.getNome()+" por favor, declare seus gastos com alimentação: ");
	resp3=ler.nextDouble();
	
	adm1.setDespesa3(resp3);
	adm1.setAjudacusto(resp1+resp2+resp3);
	
	System.out.println("\nHOLERITE");
	System.out.println("--------------------------------");
	System.out.println(adm1.getNome()+" CPF:"+adm1.getCpf()+"\n\nSALARIO BASE: R$"+adm1.getSalario()+"\nAJUDA CUSTO: R$"+adm1.getAjudacusto());
	System.out.printf("TOTAL: R$ %2f ",adm1.getAjudacusto()+adm1.getSalario());
}
}