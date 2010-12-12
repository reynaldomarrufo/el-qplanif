package modelo;

import java.util.Vector;

import escuchadores.SimuladorListener;

public class Simulador {
	 private Vector<SimuladorListener> simulisteners=new Vector<SimuladorListener>();
	 public void agregarListener(SimuladorListener simulistener){
		 this.simulisteners.add(simulistener);
		 }
	  public void darRecurso(Vector<Recurso>rs){
		  this.notificarEnvioRecursos(rs);
	  }
	  public void pedirRecursos(){
		 this.notificarPedidoRecursos();
	  }

		private void notificarEnvioRecursos(Vector<Recurso>rs){
			for (SimuladorListener simulistener : this.simulisteners) {
			simulistener.RecibirRecursos(this,rs);
			}
			}
		public void notificarPedidoRecursos(){
			for (SimuladorListener simulistener : this.simulisteners) {
				simulistener.PedirRecursos(this);
				}
		}
		
}
