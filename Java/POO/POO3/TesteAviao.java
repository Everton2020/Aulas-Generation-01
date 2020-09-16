package POO3;
import java.util.*;
public class TesteAviao {
public static void main (String args[])
{
	Scanner ler= new Scanner (System.in);
	Aviao aviao1= new Aviao ("A320","\n901 km/h ","\n174 passageiros");
	Aviao aviao2= new Aviao ("A321 NEO","\n871 km/h  ","\n206 passageiros");
	Aviao aviao3= new Aviao ("A319 NEO","\n850 km/h ","\n165 passageiros");
	int resp=0;
	
	do
	{
	System.out.println("Qual avião gostaria \n(1) Veloz \n(2) Economico \n(3) Confortavel\nR: ");
	resp=ler.nextInt();
	
	switch(resp)
	{
	case 1:
	System.out.println("Boa viagem!\n"+aviao1.getAviaoInfo());
	 break;
	case 2:
	System.out.println("Boa viagem!\n"+aviao2.getAviaoInfo());
	 break;
	case 3:
	System.out.println("Boa viagem!\n"+aviao2.getAviaoInfo());
	 break;
	 default: System.out.println("Opção Invalida");
	}
	}	
	while(resp!=1 && resp!=2 && resp!=3);
	{
	System.out.println("\nObrigado por usar nosso sistema!");
	}
}
}