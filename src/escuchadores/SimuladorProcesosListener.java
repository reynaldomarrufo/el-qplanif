package escuchadores;

import java.util.Vector;
import modelo.Proceso;
import modelo.SimuladorProcesos;


public interface SimuladorProcesosListener {
  	public void listaDeProcesosModificada(SimuladorProcesos simulador);
  	public void nuevoProcesoAgregado(SimuladorProcesos simulador,Proceso p);
	public void ProcesoEditado(SimuladorProcesos simulador, Proceso p);
	 public void RecibirProcesos(SimuladorProcesos simulador,Vector<Proceso>rs);
	public void PedirProcesos(SimuladorProcesos simulador);
}
