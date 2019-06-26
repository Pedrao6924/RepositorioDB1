package exercicio3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		
		ArrayList<Estado> listaTodasEstados= new ArrayList<Estado>();
		
		ComportamentoDeEstados comportamentoEstados = new ComportamentoDeEstados();
		
		Estado parana = new Estado();
		parana.capital = "Curitiba";
		parana.siglaEstadual = "PR";
		parana.nome = "Parana";
			
		parana.listaDeCidades.add("Curitiba");
		parana.listaDeCidades.add("Maringa");
		parana.listaDeCidades.add("Londrina");
		parana.listaDeCidades.add("Pinhais");
		
		listaTodasEstados.add(parana);	
		
		
		Estado santaCatarina = new Estado();
		santaCatarina.capital = "Florianopolis";
		santaCatarina.siglaEstadual = "SC";
		santaCatarina.nome = "SantaCatarina";
		
		santaCatarina.listaDeCidades.add("Chapeco");
		santaCatarina.listaDeCidades.add("Joinvile");
		santaCatarina.listaDeCidades.add("Chapeco");
		santaCatarina.listaDeCidades.add("Blumenau");
		santaCatarina.listaDeCidades.add("Florianopolis");
		
		listaTodasEstados.add(santaCatarina);
		
		
		Estado rioGrandeDoSul = new Estado();
		rioGrandeDoSul.capital = "PortoAlegre";
		rioGrandeDoSul.siglaEstadual = "RS";
		rioGrandeDoSul.nome = "RioGrandeDoSul";
		
		rioGrandeDoSul.listaDeCidades.add("PortoAlegre");
		rioGrandeDoSul.listaDeCidades.add("Gramado");
		
		listaTodasEstados.add(rioGrandeDoSul);
		
     boolean usuarioQuerContinuar = true;
		
        
		while(usuarioQuerContinuar) {	
   	  		    
		    String cidadeProcurada = JOptionPane.showInputDialog("Digite o nome da cidade que deseja procurar: ");
		    
		    
		    if(cidadeProcurada != null) {
	     	
	     		comportamentoEstados.colecaoDeFuncoes(cidadeProcurada, listaTodasEstados);
	     		usuarioQuerContinuar = JOptionPane.showConfirmDialog(null, "Resultado obtido. Desja inserir uma nova cidade?","Confirme", JOptionPane.YES_NO_OPTION) == 0;
	     		System.out.println("||-----------------||");
		    }
		     else 
		     {
	     	 	 usuarioQuerContinuar = JOptionPane.showConfirmDialog(null, "Valor inválido, deseja continuar?","Confirme", JOptionPane.YES_NO_OPTION) == 0;
		     }
	 	  
		    
         }
        
        System.out.println("fim.");
	}

		
	}


