package escuchadores;

import modelo.Recurso;
import modelo.SimuladorRecursos;

public interface SimuladorRecursosListener {
	public void listaDeRecursosModificada(SimuladorRecursos simulador);
  	public void nuevoRecursoAgregado(SimuladorRecursos simulador,Recurso r);
	public void recursoEditado(SimuladorRecursos simulador, Recurso r);
	
}
