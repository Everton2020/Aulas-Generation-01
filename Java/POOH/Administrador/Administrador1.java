package Administrador;

public class Administrador1 extends Pessoa {
private double ajudacusto;
private double despesa1;
private double despesa2;
private double despesa3;
private double salario;

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public Administrador1(String nome, int cpf, double ajudacusto,double despesa1,double despesa2,double despesa3,double salario)
{
	super (nome,cpf);
	this.ajudacusto=ajudacusto;
	this.despesa1=despesa1;
	this.despesa2=despesa2;
	this.despesa3=despesa3;
	this.salario=salario;
}

public double getAjudacusto() {
	return ajudacusto;
}

public void setAjudacusto(double ajudacusto) {
	this.ajudacusto = despesa1+despesa2+despesa3;
}

public double getDespesa1() {
	return despesa1;
}

public void setDespesa1(double despesa1) {
	this.despesa1 = despesa1;
}

public double getDespesa2() {
	return despesa2;
}

public void setDespesa2(double despesa2) {
	this.despesa2 = despesa2;
}

public double getDespesa3() {
	return despesa3;
}

public void setDespesa3(double despesa3) {
	this.despesa3 = despesa3;
}
}