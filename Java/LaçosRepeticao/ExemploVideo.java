package LaçosRepeticao;
import java.util.*;
public class ExemploVideo {
public static void main(String args[])
{
	Scanner ler=new Scanner (System.in);
	int num=0;
	float termo=0,soma=0,media=0;
	
	while (num>=0)
{ 
	soma=num+soma;
	termo++;
    System.out.println("Entre com um valor: ");
    num=ler.nextInt();
    
}
	media=soma/termo;
	System.out.println("A soma foi de: "+soma+"\nA quantidade de termos foi de: "+termo+"\nA media é de: "+media);
}
}