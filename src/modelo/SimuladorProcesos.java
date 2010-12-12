package modelo;

import java.util.Vector;
import escuchadores.SimuladorProcesosListener;

public class SimuladorProcesos {
	 private Vector<SimuladorProcesosListener> listeners = new Vector<SimuladorProcesosListener>();
    
public void agregarListener(SimuladorProcesosListener listener){
 this.listeners.add(listener);
 }

public void agregarProceso(Proceso p){
	this.notificarProcesoagregado(p);
}
public void editarProceso(Proceso p){
	this.notificarProcesoEditado(p);
}
public void pedirProcesos(){
	this.notificarPedidoProcesos();
}
private void notificarPedidoProcesos() {
	 for (SimuladorProcesosListener listener : this.listeners) {
		   listener.PedirProcesos(this);
		   }
	
}
public void DarProcesos(Vector<Proceso>rs){
	this.notificarEnvioProcesos(rs);
}
private void notificarEnvioProcesos(Vector<Proceso> rs) {
	 for (SimuladorProcesosListener listener : this.listeners) {
		   listener.RecibirProcesos(this, rs);
		   }
}
public void notificarCambioListaProcesos(){
	   for (SimuladorProcesosListener listener : this.listeners) {
	   listener.listaDeProcesosModificada(this);
	   }
}
private void notificarProcesoagregado(Proceso p){
	for (SimuladorProcesosListener listener : this.listeners) {
	listener.nuevoProcesoAgregado(this,p);
	}
	}
private void notificarProcesoEditado(Proceso p){
	for (SimuladorProcesosListener listener : this.listeners) {
	listener.ProcesoEditado(this,p);
	}
	}
}
