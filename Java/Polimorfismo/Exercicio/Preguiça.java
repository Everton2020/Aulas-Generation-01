package Exercicio;

public class Pregui�a extends Animal {
private String nome;

	@Override
	public void som() {
	System.out.println("Pregui�a tem som?");	
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
	public Pregui�a(String nome)
	{
		this.nome=nome;
		
	}
}
