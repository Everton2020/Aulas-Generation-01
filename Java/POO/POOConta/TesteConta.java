package POOConta;
import java.util.*;
public class TesteConta {
public static void main (String args[])
{
	Conta conta1= new Conta ("Everton Souza","\n000123-4" ,50);
	int resp=0,resp2=0;
	@SuppressWarnings("resource")
	Scanner ler = new Scanner (System.in);
			
	do
	{
	System.out.println("\nBoa Tarde, o que gostaria de fazer hoje? \n(1) Extrato \n(2) Saque \n(3) Deposito \n(0) Sair");
	resp=ler.nextInt();
	
		switch(resp)
		{
		case 1: System.out.println("Boa Tarde\n"+conta1.getContaInfo()+"\n");//EXTRATO
		 break;
		 case 2: System.out.println("Quanto Gostaria de Sacar");  //SAQUE
		 	    resp2=ler.nextInt();
		 	    if (resp2>conta1.getSaldo())
		 	    {
		 	     System.out.println("Sinto muito, não possui saldo suficiente. Por favor tente outro valor");
		 	    }
		 	    else if (resp2<1)
		 	    {
			 	  System.out.println("Opção invalida");
			 	 }
		 	    else 
		 	    conta1.saque(resp2); System.out.println("\nSaldo:"+conta1.getSaldo());
		 	   break;
		 	   
		 case 3: System.out.println("Quanto Gostaria de Depositar?");//DEPOSITO
	 	 resp2=ler.nextInt(); 
	 	
	 	 if(resp2<1)
	 	 {
	 		 System.out.println("Opção Invalida");
	 	 }else
	 	conta1.deposito(resp2); System.out.println("\nSaldo:"+conta1.getSaldo());
	 		break;
		 }
		}
	while (resp!=0);
	{
	System.out.println("\nObrigado por usar nossos sistemas!");
	}
	
	}
	
}