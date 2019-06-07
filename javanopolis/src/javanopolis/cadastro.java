package javanopolis;
import java.util.*;

public class cadastro {
	Scanner input = new Scanner(System.in);
	casa casa2 = new casa();
	condominio condominio2 = new condominio();
	comercio comercio2 = new comercio();
	
	//proprietário, endereço, tamanho, ano e pertence ao um condominio
	
	String proprietario = "";
	String endereco = "";
	String loop = "";
	String del_imovel = "";
	int tipo;
	int escolha;
	int tamanho = 0;
	int ano = 0;
	int num_cadastro = -1;
	int num_casa = -1;
	int num_condo = -1;
	int num_comercio = -1;
	int contador_casa = 0;

	int numero = 0;
	boolean parar;
	
	String casa[][] = new String[8][20];
	//casa[0][0] =proprietario
	//casa[1][0] = endereço
	//casa[2][0]  = numero
	//casa[3][0] = area
	//casa[4][0] = ano
	//casa[5][0]  = condominio
	//casa[6][0] = tipo
	//casa[7][0] = iptu
	String condominio[][] = new String[8][20];
	//condominio[0][0] =proprietario
	//condominio[1][0] = endereço
	//condominio[2][0]  = numero
	//condominio[3][0] = area
	//condominio[4][0] = ano
	//condominio[5][0]  = condominio
	//condominio[6][0] = tipo
	//condominio[7][0] = iptu
	String comercio[][] = new String [8][20];
	//comercio[0][0] =proprietario
	//comercio[1][0] = endereço
	//comercio[2][0]  = numero
	//comercio[3][0] = area
	//comercio[4][0] = ano

	//comercio[6][0] = tipo
	//comercio[7][0] = iptu
	
	 public void cadastrar(){
		 parar = false;
		 while(parar == false) { 
		 System.out.println("   CADASTRO DE IMÓVEIS");
		 System.out.println("-------------------------------------");
		 System.out.println("Escolha um tipo de imóvel");
		 System.out.println("1- Casa / 2- apartamento / 3- Comercial");
		 System.out.println("-------------------------------------");
		 	 
		 escolha = input.nextInt();

		 if (escolha == 1) {
			 num_cadastro = num_cadastro + 1;
			 num_casa = num_casa + 1;
			 contador_casa++;
			 System.out.println(num_casa);
			 geral(casa, num_casa);
			 casa[5][num_casa] = casa2.cadastrasa();
			 casa[6][num_casa] = "Casa";
			 String resultado1 =  casa2.iptu_casa(casa, num_casa);
			 casa[7][num_casa] = resultado1;
			 System.out.println("-------------------------------------");
			
		 }  if (escolha ==2) {
			 num_cadastro = num_cadastro + 1;
			 num_condo = num_condo + 1;
			 System.out.println(num_condo);
			 geral(condominio, num_condo);
			 condominio[5][num_condo] = condominio2.cadascondo();
			 condominio[6][num_condo] = "Condominio";
			 String resultado2 = condominio2.iptu_condominio(condominio, num_condo);
			 condominio[7][num_condo] = resultado2;
			 System.out.println("-------------------------------------");
		 } if(escolha == 3) {
			 num_cadastro = num_cadastro + 1;
			 num_comercio = num_comercio + 1;
			 System.out.println(num_comercio);
			 geral(comercio, num_comercio);
			 comercio[6][num_comercio] = "Comercio";

			 String resultado3 = comercio2.iptu_comercio(comercio, num_comercio);
			 comercio[7][num_comercio] = resultado3;
			 System.out.println("-------------------------------------");
		 }
		 
		 System.out.println("Deseja cadastrar mais um imovel? Y/N");
		  input.nextLine();
		  loop = input.nextLine();	
		  loop =loop.toLowerCase();
		  
			if (loop.equals("y") ) {
				parar = false;
				
			}
			else if (loop.equals("n")) {
				parar = true;
				
			} else {
				System.out.println("resposta invalida");
			}	 
		 }	
	 }

	 public void geral(String[][] matriz, int num) {
	     
	     if(num >=20) {
	    	 System.out.println("Numero de cadastros máximos atingidos");
	     } else {
	    	 System.out.println("Nome do proprietario");
			 input.nextLine();
			 proprietario = input.nextLine();
		     
			 System.out.println("Bairro e Rua");
			 endereco = input.nextLine();
			 
			 System.out.println("numero do imovel");
			 numero = input.nextInt();
			 
		
			 System.out.println("Area do imóvel em metros quadrados");
			 tamanho = input.nextInt();
			 System.out.println("ano de construcao");
			 ano = input.nextInt();
			 
			 
			 
			// System.out.println(proprietario + " " + endereco + " " + numero + " "+ tamanho + " " + ano + " " + num_cadastro);
		     matriz[0][num] = proprietario;
		     matriz[1][num] = endereco;
		     matriz[2][num] = String.valueOf(numero);
		     matriz[3][num] = String.valueOf(tamanho);;
		     matriz[4][num] = String.valueOf(ano);
	    	 
	     }
		 
		 

	    
	     
	 }
	 
	 public void mostrar(String[][] matriz, int num) {

		for(int i = 0; i <= num; i++){
			  if (!matriz[0][i].equals("excluido")) {
    		 		 System.out.println("Tipo do imovel: " + matriz[6][i]);
    				 System.out.println("Iptu total: " + matriz[7][i] + "R$");
    				 System.out.println("Proprietario: " + matriz[0][i]);
    				 System.out.println("endereco: " + matriz[1][i]);
    				 System.out.println("Numero do imovel: " + matriz[2][i]);
    				 System.out.println("Area do imovel: " + matriz[3][i]);
    				 System.out.println("Ano do imovel: " + matriz[4][i]);
    				 if(matriz[5][i] != null) {
    					 System.out.println("O imovel " + matriz[5][i]);
        				
    				 }
    				 System.out.println("-------------------------------------"); 
    				
    			}		
		 }

	 }
	 
	 public void exibir() {
		 System.out.println("-------------------------------------");

			 mostrar(casa, num_casa);
			 mostrar(condominio, num_condo);
			 mostrar(comercio, num_comercio);
			
				System.out.println(" ");
				 System.out.println("Total Cadastro " + (num_cadastro + 1));

				

	 }
	 
	 public void eliminar() {
		
		 System.out.println("Digite o numero do imovel");
		 del_imovel = input.nextLine();
		
		 System.out.println("-------------------------------------");
		 System.out.println("o imovel que você deseja apagar eh o: "+ del_imovel);
		
		 System.out.println("Voce confirma essa operacao? Y/N");
		 
		 String oppsie = input.nextLine();
		 oppsie = oppsie.toLowerCase();
		 
		 System.out.println("-------------------------------------");
		 
		 if(oppsie.equals("y")) {
			 num_cadastro = num_cadastro - 1;
				
		            for(int coluna=0; coluna <= num_casa; coluna++){
		            	
		            	if(casa[3][coluna].equals(del_imovel)) {     
		            		for(int i = 0; i < casa.length; i++) {
		            			casa[i][coluna] = "excluido";
		            			
		            		}
		            	
		            		
		            		
		            	} 
		              }
		            
		            for(int coluna2=0; coluna2 <= num_condo; coluna2++){
		            	if(condominio[3][coluna2].equals(del_imovel)) { 
		            	
		            	
		            		for(int i = 0; i < condominio.length; i++) {
		            			condominio[i][coluna2] = "excluido";
		            			
		            		}
		            		
		            	
		            	
		            	} 
		              }
		            
		            for(int coluna3=0; coluna3 <= num_comercio; coluna3++){
		            	if(comercio[3][coluna3].equals(del_imovel)) { 
		            
		            		for(int i = 0; i < comercio.length; i++) {
		            			comercio[i][coluna3] = "excluido";
		            			
		            		}
		            		
		            		
		            	} 
		              }

		           
		 } else {
			 System.out.println("NÃO EXCLUI");
			 num_cadastro = num_cadastro + 1;
		 }
		 
		 System.out.println("Total Cadastro " + (num_cadastro + 1));

		 System.out.println("-------------------------------------");
	 }
	 

	 
}
