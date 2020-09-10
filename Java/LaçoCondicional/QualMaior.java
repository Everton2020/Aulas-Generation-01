package LaçoCondicional;
import java.util.*;
public class QualMaior {
public static void main(String args[])
{
  Scanner ler= new Scanner (System.in);
  
  int n1,n2,n3;
  
  System.out.println("Entre com o primeiro numero: ");
  n1=ler.nextInt();
  
  System.out.println("Entre com o segundo numero: ");
  n2=ler.nextInt();
  
  System.out.println("Entre com o terceiro numero: ");
  n3=ler.nextInt();
  
  if (n1>n2 && n1>n3)
  {
	System.out.println("O maior numero é: "+n1);
  }
  else if(n2>n1 && n2>n3)
  {
   System.out.println("O maior numero é: "+n2);
   }
  else if (n3>n1 && n3>n2)
  {
	  System.out.println("O maior numero é: "+n3);
  }
  else
  {
     System.out.println("Opção invalida");
  }
}
}