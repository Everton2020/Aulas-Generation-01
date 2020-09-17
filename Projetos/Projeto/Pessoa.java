package Projeto;
public class Pessoa {
private String nome;
private int acesso;
private String rotina;
private int tempo;
private String psico;
public Pessoa(String nome, int usuario,String rotina, int tempo,String psico)
{
 this.nome=nome;
 this.acesso=acesso;
 this.rotina=rotina;
 this.tempo=tempo;
 this.psico=psico;
}

public int getTempo() {
	return tempo;
}

public void setTempo(int tempo) {
	this.tempo = tempo;
}

public String getRotina() {
	return rotina;
}

public void setRotina(String rotina) {
	this.rotina = rotina;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getAcesso() {
	return acesso;
}

public void setAcesso(int acesso) {
	this.acesso = acesso;
}
public String getPsico() {
	return psico;
}

public void setPsico(String psico) {
	this.psico = psico;
}

public String getPessoaInfo()
{
String PessoaInfo=nome+" "+acesso+" "+" "+psico;
return PessoaInfo;
}
}
