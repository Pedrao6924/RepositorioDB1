package exercicio3;

import java.util.ArrayList;

public abstract class EstadoAbstrato{

	String nome = "";
	
	String capital = "";
	
	String siglaEstadual = "";
	
	ArrayList<String> listaDeCidades = new ArrayList<String>();
	
	public void inserir(String cidade)
	{
		if(listaDeCidades.contains(cidade))
		{
			System.out.println("cidade ja inserida");
		}
		 else
		 {
			this.listaDeCidades.add(cidade);
		 }
	}
	
	public void verificarEstado(String cidade)
	{ 
		if(listaDeCidades.contains(cidade))
		{
			System.out.println(cidade +" pretence a " + getClass().getSimpleName());
		}
	
	}

}