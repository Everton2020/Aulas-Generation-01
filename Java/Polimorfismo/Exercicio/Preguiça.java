package Exercicio;

public class Preguiça extends Animal {
private String nome;

	@Override
	public void som() {
	System.out.println("Preguiça tem som?");	
	}
	@Override
	public void locomocao() {
	System.out.println("Suuubinndo Arvoooores....");	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Preguiça(String nome)
	{
		this.nome=nome;
		
	}
}
