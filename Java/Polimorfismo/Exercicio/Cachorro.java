package Exercicio;

public class Cachorro extends Animal {
private String nome;

@Override
public void som() {
System.out.println("Au Au Au");
}

@Override
public void locomocao() 
{
System.out.println("Correndo");
}
public Cachorro(String nome)
{
	this.nome=nome;
	
}
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
}
