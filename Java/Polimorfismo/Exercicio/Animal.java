package Exercicio;
public abstract class Animal {
protected int idade;

public abstract void som();
public abstract void locomocao();
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
}
