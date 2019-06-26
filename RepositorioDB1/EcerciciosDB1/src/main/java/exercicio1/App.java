package exercicio1;

import javax.swing.JOptionPane;

public class App {
	
	
	public static void main(String[] args) {
		
		
		funcoesMatematicas valor1 = new funcoesMatematicas();
		boolean usuarioQuerContinuar = true;
		
         while(usuarioQuerContinuar) {	
    	   
		    int numeroDigitado =  (int) Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
		    
		    
		    //Este if busca validar se realmente um numero foi digitado
		    //porem nao esta funcionando
	     	if(numeroDigitado/numeroDigitado - 1 == 0 && numeroDigitado!=0 ) 
		    {
	     		valor1.ColecaoDeFuncoes(numeroDigitado); 
	     		usuarioQuerContinuar = JOptionPane.showConfirmDialog(null, "Resultado obtido. Desja inserir um novo valor?","Confirme", JOptionPane.YES_NO_OPTION) == 0;
	     		System.out.println("||-----------------||");
		    }
	     	 else
	     	 {
	     	 	 usuarioQuerContinuar = JOptionPane.showConfirmDialog(null, "Valor inválido, deseja continuar?","Confirme", JOptionPane.YES_NO_OPTION) == 0;
	     	 }
	     	
	 	      
          }
         
         System.out.println("fim.");
         
         
         /*
         System.out.println("-------------");
         System.out.println("Exemplo da Funcao DeterminarMaiorNumero");
         
         valor1.DeterminarMaiorNumero(15);
         
         int variavelDeComparacao =  (int) Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
         valor1.DeterminarMaiorNumero(15, variavelDeComparacao);
            
         System.out.println("fim.");
         */
       
	}
	
}
