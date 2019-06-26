package exercicio2;

import javax.swing.JOptionPane;

public class App {

	
	public static void main(String[] args) {
		
		FuncoesString exercicio2 = new FuncoesString();
		
		boolean usuarioQuerContinuar = true;
		
        
		while(usuarioQuerContinuar) {	
   	  		    
		    String stringDigitada = JOptionPane.showInputDialog("Digite sua string: ");
		    
		    
		    if(stringDigitada != null) {
	     	
	     		exercicio2.colecaoDeFuncoes(stringDigitada); 
	     		usuarioQuerContinuar = JOptionPane.showConfirmDialog(null, "Resultado obtido. Desja inserir um novo valor?","Confirme", JOptionPane.YES_NO_OPTION) == 0;
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
