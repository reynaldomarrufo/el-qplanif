package global;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.DefaultComboBoxModel;
/*Clase Manipuladora de Archivos*/
public class ArchivoGral {
       //Leer un Archivo
	public DefaultComboBoxModel LeerTexto(String nom) 
    throws FileNotFoundException,IOException{
		String dir="visual/";
		dir=dir+nom+".txt";
     BufferedReader fileIn=new BufferedReader(new FileReader(dir));
     String linea="";
     DefaultComboBoxModel listamodel = new DefaultComboBoxModel(
	(new String[] {}));
    while ((linea=fileIn.readLine())!=null){
    listamodel.addElement(linea);
    }
    fileIn.close();
    return listamodel;
    }
	//Guardar un Archivo no realizado
	public void GuardarTexto() throws IOException{
			FileWriter fw = new FileWriter("escribeme.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			salida.println("Hola, soy la primera línea");
			salida.close();
			// Modo append
			bw = new BufferedWriter(new FileWriter("escribeme.txt", true));
			salida = new PrintWriter(bw);
			salida.print("Y yo soy la segunda. ");
			double b = 123.45;
			salida.println(b);
			salida.close();
		
	/*String Texto = "El Texto que se desea guardar";
	try{
	//System.getProperty("user.dir") Abre el JFileChooser donde esta el ejecutable
	   JFileChooser fc=new JFileChooser(System.getProperty("user.dir"));
	  fc.showSaveDialog(this); //Muestra el diálogo
	  File Guardar =fc.getSelectedFile();
	  if(Guardar !=null){
	    FileWriter  Guardx=new FileWriter(Guardar);
	    Guardx.write(Texto);
	    Guardx.close(); //Cierra el fichero
	   }
	 }
	 catch(IOException ioe){
	 System.out.println(ioe); //Muestra por consola los errores
	} */		
     }
	
	
	
	}
