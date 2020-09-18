package Exercicio;

public class Cavalo extends Animal {
private String nome;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

@Override
public void som() {
System.out.println("Hiin in in ");
}

@Override
public void locomocao() {
System.out.println("Trotando");
}
public Cavalo(String nome)
{
	this.nome=nome;
}
}