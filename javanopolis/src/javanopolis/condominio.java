package javanopolis;
import java.util.*;

public class condominio {
	Scanner input = new Scanner(System.in);
	
	String andar;
	String resultado;
	public String cadascondo(){
		System.out.println("Qual o andar do condominio");
		andar = input.nextLine();
		return "esta no andar " + andar;
	
	}
	
	public String iptu_condominio(String matriz[][], int num) {
		String tamanho = matriz[3][num];
		float numero = Integer.valueOf(tamanho);	
		float iptu = numero * 8.50f;
		
		resultado = String.valueOf(iptu);
		 
		return resultado;
	}
	

	
		 

}
