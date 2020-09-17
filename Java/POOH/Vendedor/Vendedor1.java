package Vendedor;

public class Vendedor1 extends Pessoa{
private double valorVendas;
private double comissao;
private double salario;

	public Vendedor1(String nome, int cpf, double valorVendas, double comissao,double salario) 
	{
		super(nome, cpf);
		this.valorVendas=valorVendas;
		this.comissao=comissao;
		this.salario=salario;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public void setComissao1(double comissao1)
	{
	this.comissao=valorVendas*0.05;
	}
	public double getComissao1(double comissao1)
	{
	 return comissao;
	}
}