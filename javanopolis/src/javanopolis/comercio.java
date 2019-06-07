package javanopolis;

public class comercio {
	String resultado;
	
	public String iptu_comercio(String matriz[][], int num) {
		String tamanho = matriz[3][num];
		float numero = Integer.valueOf(tamanho);	
		float iptu = numero * 10.70f;
		
		resultado = String.valueOf(iptu);
		 
		return resultado;
	}
	


}
