import java.util.*;
public class UserTeste {
public static void main (String args[])
{
	User user1= new User("Maria Joaquina",4545,"manicure","(11)9*8798-8978",89798);
	User user2= new User ("João Pedro",5644,"Reparos Gerais","(11)9*8657-8971",87654);
	User user3= new User("Vanessa Santos",46574,"PF","(11)9*6548-8974",85421);
	User user4= new User("Leila Barbosa",65476,"Cabeleireiro","(11)9*4657-46574",6547);
	Scanner ler = new Scanner (System.in);
	int resp=0,resp2=0,resp3=0,resp4,pass;
	String job,name,contact,job2;
	
	do
	{
	System.out.println("\nBem vindo Sr(a) "+user1.getNome()+". O que gostaria hoje? \n(1) Meus Dados \n(2) Quero solicitar serviço  \n(0) Sair");
	resp=ler.nextInt();
	
	switch(resp)
	{
	case 2: System.out.println("Qual serviço gostaria de solicitar? \n(1) Alimentação \n(2) Estetica \n(3) Consertos \n(0) Voltar");
	resp4=ler.nextInt();
	
	switch(resp4)
	{
	case 1: System.out.println(user3.getStatus().toUpperCase());
	break;
	case 2: System.out.println(user4.getStatus().toUpperCase());
	break;
	case 3: System.out.println(user2.getStatus().toUpperCase());
	break;
	default: System.out.println("Opção Invalida");
	break;
	}
	break;
	
	
	case 1: System.out.println("NOME: "+user1.getNome().toUpperCase()+"\nID: "+user1.getId()+"\nSERVIÇO: "+user1.getServiço().toUpperCase()+"\nCONTATO:"+user1.getContato());
	System.out.println("\nGostaria de alterar algum dado? \n(1) Sim \n(2) Não");
	resp2=ler.nextInt();
	if(resp2==1)
	{
	System.out.println("Qual? \n(1) Meu Nome \n(2) Meu Contato \n(3) Meu serviço");
	resp3=ler.nextInt();
	
	switch(resp3)
	{
	case 1: System.out.println("Qual seu nome?: ");
	name=ler.next();
	user1.setNome(name);
	break;
	case 2: System.out.println("Qual seu contato?");
	contact=ler.next();
	user1.setContato(contact);
	break;
	case 3: System.out.println("Qual seu serviço");
	job2=ler.next();
	break;
	default: System.out.println("Opção Invalida");
	break;
	}
	}else System.out.println("Opção invalida");
	default:
	break;
	}
	}while (resp!=0);
	{
		System.out.println("Obrigado por usar nosso sistema");
	}
	
}
}