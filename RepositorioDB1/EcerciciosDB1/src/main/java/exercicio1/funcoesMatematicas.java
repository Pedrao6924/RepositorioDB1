package exercicio1;

public class funcoesMatematicas {
	
	final int numeroComparacaoDefault=10;
	
	
	public void DeterminarParOuImpar(int numeroDigitado)
	{	
		if(numeroDigitado%2 == 0)
		{
			System.out.println(numeroDigitado + ": é par");
			System.out.println(numeroDigitado + ": não é impar");	
		}
		 else
		  {
			 System.out.println(numeroDigitado + ": não é par");
			 System.out.println(numeroDigitado + ": é impar");	

		  }	
	}
	
	
	public void DeterminarMaiorNumero(int numeroDigitado)
	{
		DeterminarMaiorNumero(numeroDigitado,numeroComparacaoDefault);	
	}
	
	
	
	
	
	
	public void DeterminarMaiorNumero(int numeroDigitado, int numeroComparacao)
	{
		
	 if(numeroDigitado == numeroComparacao)
	 {
		 
		 System.out.println(numeroDigitado + " é igual a " + numeroComparacao);
		 
     }
	  else 
	  {
		  
		 if(numeroDigitado <  numeroComparacao)
		 {
		 	System.out.println(numeroDigitado + " é menor que " + numeroComparacao);
		 }
		  else
		  {
			 System.out.println(numeroDigitado + " é maior que " + numeroComparacao);
		  }
	  }
	        //Este metodo poderia ter sido implementado porem o exercicio restringe o usuario 
			//a digitar apenas um numero, apesar de ainda estar no App este é apenas para
			//demonstrar o conceito
	}
	
	
	
	
	
	public void DeterminarDobroDoNumero(int numeroDigitado)
	{
		System.out.println("O dobro de " + numeroDigitado + " é " + numeroDigitado*2);
	}
	
	
	public void DeterminarNumeroPrimo(int numeroDigitado)
	{
		int variavelDeControle = numeroDigitado ;
		
		
		if(numeroDigitado%2 == 0 && numeroDigitado != 2)
		{
			System.out.println(numeroDigitado + ": não é primo");
		}
		else {
			
		
	      while(variavelDeControle > 1)
	      {
	    	  
	    	  if(numeroDigitado%variavelDeControle == 0 && numeroDigitado!=variavelDeControle)
	    	  {
	    	   System.out.println(numeroDigitado + ": não é primo");  
	    	   break;
	    	  }
	    	  else{variavelDeControle --;}
	    	  
	    	  
	    	  
	     }
	      System.out.println(numeroDigitado + ": é primo"); 
	      
	    }	
		
	 }
	
	
	

	public void ColecaoDeFuncoes(int numeroDigitado)
	{
		DeterminarParOuImpar(numeroDigitado);
		DeterminarMaiorNumero(numeroDigitado);
		DeterminarDobroDoNumero(numeroDigitado);
		DeterminarNumeroPrimo(numeroDigitado);		
	}


}
