
public class User {
protected String nome;
protected int senha;
protected String serviço;
protected String contato;
protected int id;

public User(String nome, int senha, String serviço,String contato, int id)
{
	this.nome=nome;
	this.senha=senha;
	this.serviço=serviço;
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

public String getServiço() {
	return serviço;
}

public void setServiço(String serviço) {
	this.serviço = serviço;
}
public String getStatus() {
	String UserInfo = "NOME: "+this.nome+"\nSERVIÇO: "+this.serviço+"\nCONTATO: "+this.contato;
	 return UserInfo;
}
}