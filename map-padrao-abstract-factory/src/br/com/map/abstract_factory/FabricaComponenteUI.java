package br.com.map.abstract_factory;

import br.com.map.abstract_factory.button;

public abstract class FabricaComponenteUI {
	
	public abstract Window criarJanela();
	
	public abstract Button criarButton();

}
