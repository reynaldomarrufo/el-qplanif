package modelo;

public class OperES {
 private int idIn,ini,dur;
 private Recurso recur;
 public int getIdIn() {
	return idIn;
}
public void setIdIn(int idIn) {
	this.idIn = idIn;
}
public int getDur() {
	return dur;
}
public void setDur(int dur) {
	this.dur = dur;
}

public int getIni() {
	return ini;
}
public void setIni(int ini) {
	this.ini = ini;
}
public Recurso getRecur() {
	return recur;
}
public void setRecur(Recurso recur) {
	this.recur = recur;
}
public String toString() {
	return ("Nombre: "+this.getRecur().getNombre()+" | "+this.getIni()+" | "+this.getDur());
}
}
