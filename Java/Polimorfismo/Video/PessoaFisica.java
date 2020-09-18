package Video;

public class PessoaFisica extends Pessoa1 {
private long cpf;

public PessoaFisica()
{

}

public long getCpf(long cpf) {
	return cpf;
}

public void setCpf(long cpf) 
{
	this.cpf = cpf;
}
public String getNome()
{
	return "Pessoa fisica: "+super.getNome()+" CPF: "+this.cpf;
}
}