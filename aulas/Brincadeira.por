programa
{
	inclua biblioteca Util --> u
	funcao inicio()
	{
 	cadeia tipo[6] = {"Prédios", "Chá Mate", "Pão de Queijo", "Moqueca", "Axé", "Árveres"} 
 	inteiro estado escreva("Escolha um Estado:\n(0) SP\t(2) MG\n(1) RJ\t(3) ES\n(4) BA\t(5) AM\n") 
 	
 	leia(estado) 
 	
 	se (estado >=0 e estado < 6) 
 	{ 
 	escreva("O local escolhido foi...") 
 	u.aguarde(3000) 
 	escreva("\n",tipo[estado],"!") 
 	} 
 	senao 
 	{
 	escreva("Escolha um número válido!") 
 	} 
 	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 417; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */