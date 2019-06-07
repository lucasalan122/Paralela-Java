package javanopolis;
import java.util.*;

public class casa {
	Scanner input = new Scanner(System.in);
	
	String condominio;
	float iptu;
	String resultado;
	
	public String cadastrasa(){
		System.out.println("Essa casa faz parte de um condominio? Y/N");
		condominio = input.nextLine();	
		condominio = condominio.toLowerCase();

		if (condominio.equals("y") ) {
			return "faz parte de um condominio";
		}
		else if (condominio.equals("n")) {
			return "nao faz parte de um condominio";
		} else {
			System.out.println("resposta invalida");
			return "erro";
		}
		
	}
	
	public String iptu_casa(String matriz[][], int num) {
		String tamanho = matriz[3][num];
		float numero = Integer.valueOf(tamanho);	
		
		String excecao = condominio;
		
		
		
		if (excecao.equals("y")){
			 iptu = numero * 7.00f;
		} else if(excecao.equals("n")){
			 iptu = numero * 9.00f;
		}
		resultado = String.valueOf(iptu);
		
		 
		return resultado;
	}
	

	
		 

}
