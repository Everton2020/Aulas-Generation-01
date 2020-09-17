package Funcionario;
public class Pessoa {
	String nome;
	int matricula;
	
public Pessoa(String nome, int matricula) //colocar o xxx.this
{
 this.nome=nome;
 this.matricula=matricula;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}
public String getPessoaInfo()
{
 String PessoaInfo = "NOME: "+nome+"\n"+"MATRICULA: "+" "+matricula;
 return PessoaInfo;
}
}
