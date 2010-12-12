package modelo;

import java.util.Vector;

public class Proceso {
  private String nom;
  private int prio,ini,dur,id,idin;
  public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getIdin() {
	return idin;
}
public void setIdin(int idin) {
	this.idin = idin;
}
private Vector<OperES> operEntSalida = new Vector<OperES>();
  
 public Proceso(String nom,int ini,int dur,int prio){
		this.nom=nom;
		this.ini=ini;
		this.dur=dur;
		this.prio=prio;
	}
public Vector<OperES> getOperEntSalida() {
	return operEntSalida;
}

public void setOperEntSalida(Vector<OperES> operEntSalida) {
	this.operEntSalida = operEntSalida;
}

public String getNom() {
	return nom;
}

public int getPrio() {
	return prio;
}

public int getIni() {
	return ini;
}

public int getDur() {
	return dur;
}
public String toString() {
	// TODO Auto-generated method stub
	return ("Nombre: "+this.getNom()+" | Inicio: "+this.getIni());
}
 
}
