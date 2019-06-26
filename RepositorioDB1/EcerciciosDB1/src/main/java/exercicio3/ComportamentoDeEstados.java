package exercicio3;

import java.util.*;

public class ComportamentoDeEstados {
	
	public void verificarEstadoDaCidade(String cidadeProcurada, ArrayList<Estado> listaProcurandoEstado)
	{
		Estado estadoTemporario = new Estado();
		
		for(int contador = 0 ; contador < listaProcurandoEstado.size(); contador++)
		{
			estadoTemporario = listaProcurandoEstado.get(contador);
			
			if(estadoTemporario.listaDeCidades.contains(cidadeProcurada))
			{
				System.out.println(cidadeProcurada + " esta localizada no estado do " 
			                                       + estadoTemporario.nome + " , " 
						                           + estadoTemporario.siglaEstadual );
				break;
			}
			
			if(listaProcurandoEstado.size()-1 == contador && !(estadoTemporario.listaDeCidades.contains(cidadeProcurada)))
			{
				System.out.println("A cidade não se encontra em nenhum estado. Verifique a digitação e tente novamente");
			}
					
			
		}	
		
	}

	
	
	public void verificarCapitalDoEstado(String cidadeProcurada, ArrayList<Estado> listaProcurandoEstado) 
	{
		
		Estado estadoTemporario = new Estado();
		
		for(int contador = 0; contador < listaProcurandoEstado.size() ; contador++ )
		{
			
			estadoTemporario = listaProcurandoEstado.get(contador);
		
			
			if((estadoTemporario.capital).equals(cidadeProcurada))
			{
		
				System.out.println(cidadeProcurada + " é capital do " + estadoTemporario.nome);
				break;
				
			}
			if(listaProcurandoEstado.size()-1 == contador && estadoTemporario.capital != cidadeProcurada)
			{
				System.out.println("A cidade "+ cidadeProcurada +" não é capital.");		
			}
			
		}
	}

	
	
	public void colecaoDeFuncoes(String cidadeProcurada, ArrayList<Estado> listaProcurandoEstado) {
		
		verificarEstadoDaCidade(cidadeProcurada, listaProcurandoEstado);
		verificarCapitalDoEstado(cidadeProcurada,listaProcurandoEstado);
		
	}
}
