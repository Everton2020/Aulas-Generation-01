package Projeto;
import java.util.*;
public class TesteProjeto {
public static void main (String args[])
{
 Scanner ler = new Scanner (System.in);
 
 Pessoa user = new Pessoa ("null",0546,"(QUA e SEX)",0,"null");
 user.setAcesso(0546);
 
 int resp=0, resp2=0,acesso,tempo = 0;
 String nome,dias,perfil;
 
 System.out.println("Entre com seu nome: ");
 nome=ler.nextLine();
 user.setNome(nome);
 
 System.out.println("Como você se considera? (CALMO) (ESTRESSADO) (IRRITADO): ");
 perfil=ler.nextLine();
 user.setPsico(perfil);
 
 System.out.println("Entre com seu dia da semana que quer meditar EX: (QUA e SEX): ");//Tem um bug por aqui
 dias=ler.nextLine();
 user.setRotina(dias);
 
 System.out.println("Quantos minutos gostaria de meditar?: ");
 acesso=ler.nextInt();
 user.setTempo(tempo);
 
  
 	do
 	{
	System.out.println("\nBoa Tarde Sr(a) "+user.getNome()+"\n\nO que gostaria de fazer hoje \n(1) Meu Perfil \n(2) Rotina Meditação \n(3) Inserir Meditação \n(0) Sair");
	resp=ler.nextInt();
	
		switch(resp)
		{
		case 1: System.out.println("NOME: "+user.getNome()+"\nACESSO: "+user.getAcesso()+"\nPERFIL PSI: "+user.getPsico());
		break;
		case 2: System.out.println("\nDIAS: "+user.getRotina()+"\nTEMPO: "+user.getTempo()+"min");
		 break;
		case 3:System.out.println("Quantos minutos meditou hoje?");
		resp2=ler.nextInt();
		
			if(resp2>=user.getTempo() && resp2!=0)
			{
			System.out.println("Parabens!!! Mantenha o ritmo");
			}
			else if (resp2<user.getTempo() && resp2>0)
			{
			System.out.println("Muito bem, tente mais na proxima");
			}
			else if (resp2==0)
			{
			System.out.println("Puxa. Que tal tentar hoje?");
			}
			else
			{
			System.out.println("ERROR");
			}
		break;
 		default:
 		break;
		}
 	}while(resp!=0);{
 System.out.println("Obrigado por usar nosso sistema");
 	}
 	
}
}
		 