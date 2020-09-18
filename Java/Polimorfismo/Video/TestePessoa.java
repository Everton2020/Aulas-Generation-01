package Video;

public class TestePessoa {
public static void main (String args[])
{
     
	PessoaFisica fisica = new PessoaFisica();
	fisica.setNome("Juliana");
	fisica.setCpf(1234154684132132L);
	
	PessoaJuridica juridica = new PessoaJuridica();
	juridica.setNome("Empresa Fantasma");
	juridica.setCnpj(132165431321L);
	
	Pessoa1[] pessoas = new Pessoa1 [2];
	pessoas[0] = fisica;
	pessoas[1] = juridica;
	
	for(Pessoa1 pessoa:pessoas)
	{
		System.out.println(pessoa.getNome());	
	}
}
}