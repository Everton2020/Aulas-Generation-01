package Exercicio;
import java.util.*;
public class TesteAnimal {
public static void main (String args[])
{
	Cachorro dog = new Cachorro ("Cachorro");
	Cavalo horse = new Cavalo("Cavalo");
	Pregui�a sloth = new Pregui�a("Pregui�a");
	Scanner ler = new Scanner (System.in);
	int resp;
	
	System.out.println("Qual animal voc� quer ver a informa��o? \n(1) Cachorro \n(2) Cavalo \n(3) Pregui�a");
	resp=ler.nextInt();
	
	switch(resp)
	{
	case 1:
	dog.setIdade(15);
	System.out.println("Nome: "+dog.getNome()+"\nIdade: "+dog.getIdade());	
	dog.locomocao();
	dog.som();
	
	break;
	case 2:
	horse.setIdade(20);
	System.out.println("Nome: "+horse.getNome()+"\nIdade: "+horse.getIdade());
	horse.locomocao();
	horse.som();
	break;
	case 3:
	sloth.setIdade(5);
	System.out.println("Nome: "+sloth.getNome()+"\nIdade: "+sloth.getIdade());
	sloth.locomocao();
	sloth.som();
	default: System.out.println("Isso n�o � um animal");
	}
}
}