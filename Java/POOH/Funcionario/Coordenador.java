package Funcionario;

public class Coordenador extends Pessoa {
private String curso;

public Coordenador (String nome, int matricula, String curso)
{
	super(nome,matricula);
	this.curso=curso;
}
public String getCoordenadorInfo()
{
	String FuncionarioInfo="\nNOME: "+nome+"\nMATRICULA: "+matricula+"\nCURSO: "+curso;
	return FuncionarioInfo;
}
}