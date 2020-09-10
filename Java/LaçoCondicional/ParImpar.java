package LaçoCondicional;
import java.util.*;
public class ParImpar {
public static void main (String args[])
{
	Scanner ler= new Scanner(System.in);
	
	double num,par,impar;
	
	System.out.println("Entre com numero: ");
	num=ler.nextDouble();
	
	par=Math.sqrt(num);
	impar=Math.pow(num,2);
	
	if(num%2==0)
	{
	System.out.println("O numero "+num+" é par. Então sua raiz é: "+par);
	}
	else if(num%2!=0 && num>=0)
	{
	System.out.println("O numero "+num+" é impar. Então seu quadrado é: "+impar);
	}
	else
	{
	System.out.println("ERROR");
	}
}
}