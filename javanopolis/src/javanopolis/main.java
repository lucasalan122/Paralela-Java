package javanopolis;
import java.util.*;

public class main {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	cadastro cadastro = new cadastro();
    	
    	boolean parar = false;
    	int escolha = 0;
    	
    	System.out.println("POGAMA DE REGISTRO E CALCULO DE IPTU");
    	System.out.println("-------------------------------------");
    	while(parar == false) {
    		System.out.println("");
     		System.out.println("MENU PRINCIPAL");
    		System.out.println("1- Cadastrar imovel, 2- remover imovel, 3- mostrar imoveis, 4 - sair");
    		escolha = input.nextInt();
    		
    		if(escolha == 1) {
    			System.out.println("");
    			System.out.println("-------------------------------------");
    			cadastro.cadastrar();
    			
    		}else if(escolha == 2) {
    			cadastro.eliminar();
    			
    		}else if (escolha == 3) {
    			cadastro.exibir();
    		}else if (escolha == 4) {
    			System.exit(0);
    		}
    		
    	} 
    }
}
