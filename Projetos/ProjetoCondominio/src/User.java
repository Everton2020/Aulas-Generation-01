
public class User {
protected String nome;
protected int senha;
protected String servi�o;
protected String contato;
protected int id;

public User(String nome, int senha, String servi�o,String contato, int id)
{
	this.nome=nome;
	this.senha=senha;
	this.servi�o=servi�o;
	this.contato=contato;
	this.id=id;
}

public String getContato() {
	return contato;
}

public void setContato(String contato) {
	this.contato = contato;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getSenha() {
	return senha;
}

public void setSenha(int senha) {
	this.senha = senha;
}

public String getServi�o() {
	return servi�o;
}

public void setServi�o(String servi�o) {
	this.servi�o = servi�o;
}
public String getStatus() {
	String UserInfo = "NOME: "+this.nome+"\nSERVI�O: "+this.servi�o+"\nCONTATO: "+this.contato;
	 return UserInfo;
}
}