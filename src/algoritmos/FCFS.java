package algoritmos;

import java.util.Vector;

import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import modelo.Proceso;
import modelo.Tarea;

public class FCFS {
 //private Vector<Proceso>listos;
private Vector<Tarea>t=new Vector<Tarea>();
private DefaultCategoryDataset result = new DefaultCategoryDataset();
private int durt=0,tot=0;
private Proceso p;

public void asignarEspera(int id,int d, String nom){
	Tarea a=new Tarea("e",id,false);
	result.addValue(d, "e", nom);
	t.addElement(a);
	tot=tot+1;
}	
//public void Mapeo(Proceso p){
	
//}
 public CategoryDataset TransFormarADataSet(Vector<Proceso>rs){
	Tarea a;
	//Mapeo(p);
	for(int i=0;i<rs.size();i++){
	p=rs.elementAt(i);
	asignarEspera(tot,durt,p.getNom());	
	result.addValue(p.getDur(), "CPU", p.getNom());
	a=new Tarea("CPU",tot,true);
	t.addElement(a);
	tot=tot+1;
	durt=durt+p.getDur();
	}
  return result;	
 }
 public Vector<Tarea>darTareas(){
	 return t;
 }   
}
