package modelo;

import java.util.Vector;
import escuchadores.SimuladorRecursosListener;

public class SimuladorRecursos {
	 private Vector<SimuladorRecursosListener> listeners = new Vector<SimuladorRecursosListener>();
	 public void agregarListener(SimuladorRecursosListener listener){
		 this.listeners.add(listener);
		   }
	
		public void agregarRecurso(Recurso r){
			this.notificarRecursoagregado(r);
		}
		public void editarRecurso(Recurso r){
			this.notificarRecursoEditado(r);
		}

		public void notificarCambioListaRecursos(){
			   for (SimuladorRecursosListener listener : this.listeners) {
			   listener.listaDeRecursosModificada(this);
			   }
		}
		private void notificarRecursoagregado(Recurso r){
			for (SimuladorRecursosListener listener : this.listeners) {
			listener.nuevoRecursoAgregado(this,r);
			}
			}
		private void notificarRecursoEditado(Recurso r){
			for (SimuladorRecursosListener listener : this.listeners) {
			listener.recursoEditado(this,r);
			}
			}

}
