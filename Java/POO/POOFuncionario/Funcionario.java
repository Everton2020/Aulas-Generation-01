package POOFuncionario;

public class Funcionario {
	private String nome;
	private String cadastro;
	private double salario1=1500;
	

	//Construtor

	public Funcionario(String n, String c)
	{
		nome=n;
		cadastro=c;
	}

	public String getFuncionarioInfo()
	{
	 String FuncionarioInfo=(nome+" "+cadastro);
	 return FuncionarioInfo;
	}
	public double getSalarioInfo()
	{
		double SalarioInfo = (salario1);
		return SalarioInfo;
	}
	public void getExtras(int horas)
	{
	this.salario1=(salario1/220);	}
	}
