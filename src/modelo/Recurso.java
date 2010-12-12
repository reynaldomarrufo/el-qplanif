package modelo;

import java.awt.Color;

public class Recurso {
private String nombre;
private Color color;
private int idIn;

public int getIdIn() {
	return idIn;
}
public void setIdIn(int idIn) {
	this.idIn = idIn;
}
public Recurso(String nom,Color color){
	nombre=nom;
	this.color=color;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Color getColor() {
	return color;
}
public void setColor(Color color) {
	this.color = color;
}
public String toString() {
	return ("Nombre: "+this.getNombre());
}

}
