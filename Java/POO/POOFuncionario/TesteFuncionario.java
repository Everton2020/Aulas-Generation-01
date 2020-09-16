package POOFuncionario;
import java.util.*;
public class TesteFuncionario {
public static void main (String args[])
{
 Funcionario func1= new Funcionario ("Everton Souza","6134");
 Scanner ler = new Scanner (System.in);
 int resp=0,horas;
 
 System.out.println("Olá:"+func1.getFuncionarioInfo());
 do
 {
 System.out.println("O que gostaria de fazer? \n(1)Salario Fixo \n(2)Extras \n(0)Sair");
 resp=ler.nextInt();
 
 switch(resp)
 {
 case 1:System.out.println("Salario R$:"+func1.getSalarioInfo());
 break;
 case 2:System.out.println("Entre com as horas trabalhadas:");
 horas=ler.nextInt();
 int extras= (int) (func1.getSalarioInfo()/220*horas);
 System.out.println("Extras R$"+extras);
 break;
 default:
  break;
 }
 }while(resp!=0);
System.out.println("Obrigado por usar nosso sistema");
}
}