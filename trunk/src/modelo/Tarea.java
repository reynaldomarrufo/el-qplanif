package modelo;

public class Tarea {
   private int n;
   public int getN() {
	return n;
}

public void setN(int n) {
	this.n = n;
}

public boolean isEj() {
	return ej;
}

public void setEj(boolean ej) {
	this.ej = ej;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

private boolean ej;
   private String nom;
   
   public Tarea(String nom,int n,boolean ej){
	   this.nom=nom;
	   this.n=n;
	   this.ej=ej;
   }
}
