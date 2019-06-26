package exercicio2;

import javax.swing.JOptionPane;

public class FuncoesString {
	
	public int verificarQuantidadeDeCaracteres(String stringDigitada) 
	{
		return stringDigitada.length(); 
	}

	public int verificarQunatidade(String stringDigitada, char quantidadeDeVar)
	{
		
	    int quantidade = 0;
	 
		for(int contador = 0; contador < stringDigitada.length() ; contador++) 
		{
			
			if(stringDigitada.charAt(contador) == quantidadeDeVar )
			{
				quantidade ++;
			}
			
		}
		
		return quantidade;
	}
    public int verificarQuantidadeVogais(String stringDigitada)
    {
    	int quantidadeDeVogais = 0;
	
    	quantidadeDeVogais += verificarQunatidade(stringDigitada, 'A');  	
    	quantidadeDeVogais += verificarQunatidade(stringDigitada, 'a');
    
    	quantidadeDeVogais += verificarQunatidade(stringDigitada, 'E');
    	quantidadeDeVogais += verificarQunatidade(stringDigitada, 'e');
    
    	quantidadeDeVogais += verificarQunatidade(stringDigitada, 'I');
    	quantidadeDeVogais += verificarQunatidade(stringDigitada, 'i');
    
    	quantidadeDeVogais += verificarQunatidade(stringDigitada, 'O');
    	quantidadeDeVogais += verificarQunatidade(stringDigitada, 'o');
    
    	quantidadeDeVogais += verificarQunatidade(stringDigitada, 'U');
    	quantidadeDeVogais += verificarQunatidade(stringDigitada, 'u');
    
    return quantidadeDeVogais;
    	
    	
    } 
    
    public void colecaoDeFuncoes(String stringDigitada) 
    {
    	
    	
    	System.out.println(stringDigitada + " A string ao lado possui " 
                                          + verificarQuantidadeDeCaracteres(stringDigitada)
                                          + " caracteres.");
    	
    	
    	char quantidadeDeVar = JOptionPane.showInputDialog(
      			                 "Digite o caracter que deseja encontrar na string: "
      			                 + "(Para encontrar espacos em branco presione a tecla ESPAÇO)"
    			                 ).charAt(0);
    	
    	System.out.println(stringDigitada + " A string ao lado possui "
    			                          + verificarQunatidade(stringDigitada, quantidadeDeVar)
    			                          + " do caracter " + quantidadeDeVar
    			                          + ".");
    	
        System.out.println(stringDigitada + " A string ao lado possui "
        		                          + verificarQuantidadeVogais(stringDigitada)
        		                          + " de vogais.");
    }
}
