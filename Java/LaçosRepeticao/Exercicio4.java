package LaçosRepeticao;
import java.util.*;
public class Exercicio4 {
@SuppressWarnings("unused")
public static void main (String args[])
{
		Scanner ler= new Scanner (System.in);
		int user=1,
			idade=0,
			sexo=0,zen=0,
			caso0=0,caso1=0,caso2=0,caso3=0,caso4=0,caso5=0;
		
	 while (user<=150)
	 {
		 	System.out.println("Entre com sua idade: ");
		 	idade=ler.nextInt();
		 	  while (idade<0 || idade>130)
		 	  {
		 	   System.out.println("Entre com sua idade: ");
				 idade=ler.nextInt();  
		 	  }
		 	
		 	System.out.println("Qual seu sexo? \n(Aperte: 1-Feminino / 2-Masculino / 3-Outros)");
		 	sexo=ler.nextInt();
		 	while (sexo<0 || sexo>3)
		 	  {
		 	   System.out.println("Qual seu sexo? \\n(Aperte: 1-Feminino / 2-Masculino / 3-Outros)\"");
				 sexo=ler.nextInt(); 
		 	  }
		 	System.out.println("Como você se considera? \n(Aperte: (1) Calma; (2) Nervosa (3) Agressiva)");
		 	zen=ler.nextInt();
		 	ler.nextLine();
		    
		 	
		 	if (zen==1)
		 	{
		 	caso0++;
		 	}
		 	if (sexo==1 && zen==2)
		 	{
		 	caso1++;
		 	}
		 	if (sexo==2 && zen==3)
		 	{	
		 	caso2++;
		 	}
		 	if (sexo==3 && zen==1)
		 	{		
		 	caso3++;
		 	}
		    if (idade>=40 && zen==2)
		 	{
		 	caso4++;
		 	}
		 	if (idade<=18 && zen==1)
		 	{
		 	caso5++;
		 	}
		 	user++;
		 	}
		     System.out.println("\nNumero de pessoas calmas:"+caso0);
		     System.out.println("\nNumero de Mulheres nervosas:"+caso1);
		     System.out.println("\nNúmero de Homens agressivos:"+caso2);
		     System.out.println("\nNúmero de Outros calmos:"+caso3);
		     System.out.println("\nNúmero de pessoas nervosas com mais de 40 anos:"+caso4);
		     System.out.println("\nNúmero de pessoas calmas com menos de 18 anos:"+caso5);
}
}
