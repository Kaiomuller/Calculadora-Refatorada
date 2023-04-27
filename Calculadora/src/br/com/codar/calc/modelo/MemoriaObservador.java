package br.com.codar.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	public void valorAlterado( String novoValor);

}
