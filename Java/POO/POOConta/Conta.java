package POOConta;

public class Conta {
private String Nome;
private String conta;
private double saldo;
private double saldonovo;

//Construtor

void deposito (double quantidade)
{
 this.saldonovo=this.saldo+quantidade;
 this.saldo=saldonovo;
}
void saque (double quantidade)
{
	this.saldonovo=this.saldo-quantidade;
	this.saldo=saldonovo;
}
public Conta (String primeiro, String segundo, double terceiro)
{
	 Nome=primeiro;
	 conta=segundo;
	 saldo=terceiro; 
 }
	public String getContaInfo()
	{
		String ContaInfo=(Nome+" "+conta+" "+saldo);
		return ContaInfo;		
	}
	public double getSaldo()
	{
	 double SaldoInfo=(saldo);
	 return SaldoInfo;
	}
	public void status()
	{
	System.out.println("Cliente: "+this.Nome);
	System.out.println("Conta:"+this.conta);
	System.out.println("R$");
	}
}