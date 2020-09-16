package POO3;

public class Aviao {
	
private	String Modelo;
private	String Velocidade;
private	String Capacidade;
	
	//Construtor
	
	public Aviao (String primeiro, String segundo, String terceiro)
  {
	 Modelo=primeiro;
	 Velocidade=segundo;
	 Capacidade=terceiro; 
   }
	public String getAviaoInfo()
	{
		String AviaoInfo=(Modelo+" "+Velocidade+" "+Capacidade);
		return AviaoInfo;		
	}
}