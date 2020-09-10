package LaçosRepeticao;
/*3-	Solicitar a idade de várias pessoas e imprimir: 
 * Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. 
 * O programa termina quando idade for =-99.(WHILE)
 */

import java.util.*;
public class Exercicio3 {
public static void main (String args[])
{
 Scanner ler= new Scanner (System.in);
 int idade=0,juve=0,adult=0,idos=0;
 		 
 while (idade>=0 && idade!=-99)
{
System.out.println("Entre com a idade (Aperte -99 para sair): ");
idade=ler.nextInt();
if (idade>=0 && idade<21)
{
juve++;
}
else if (idade>50 && idade!=-99)
{
idos++;
}
else if(idade>=0 && idade!=-99)
{
adult++;
}
}
System.out.println("O total de pessoas com menos de 21: "+juve);
System.out.println("O total de pessoas com mais de 50: "+idos);
System.out.println("O total de pessoas com mais de 21 e menos 50: "+adult);
}
}