package Funcionario;

public class Funcionario extends Pessoa {
private String departamento;

public Funcionario(String nome, int matricula,String departamento) 
	{
		super(nome, matricula);
		this.departamento=departamento;
	}
public String getFuncionarioInfo()
{
	String FuncionarioInfo="NOME: "+nome+"\nMATRICULA: "+matricula+"\nDEPARTAMENTO: "+departamento;
	return FuncionarioInfo;
}
}
