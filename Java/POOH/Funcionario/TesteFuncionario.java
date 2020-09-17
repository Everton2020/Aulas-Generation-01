package Funcionario;

public class TesteFuncionario {
public static void main (String args[])
{
	Pessoa pessoa1= new Pessoa ("Maria Joaquina",555);
	Funcionario func1 = new Funcionario ("Pedrinho",498,"Engenharia");
	Coordenador coo1= new Coordenador ("Juca",5948,"Produção");
	
	System.out.println(pessoa1.getPessoaInfo());
	System.out.println("\n"+func1.getFuncionarioInfo());
	System.out.println("\n"+coo1.getCoordenadorInfo());
	
}
}