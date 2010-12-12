package global;


import java.awt.Image;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;




public class CargarImagenes{
	/** Retorna un ImageIcon, o retorna null si la ruta es inválida */
	public ImageIcon createImageIcon(String path) {
	    java.net.URL imgURL = getClass().getResource(path);
		    if (imgURL != null) {
		        return new ImageIcon(imgURL);
		    } else {
		        System.err.println("No se encontró el archivo: " + path);
		        return null;
		    }
		}
	
	/* public ImageIcon getLogo(String path) {
        Image logo=null;
	         URL imageURL = this.getClass().getClassLoader().getResource(
	                    path);
	            if (imageURL != null) {
	                ImageIcon temp = new ImageIcon(imageURL);
	                    // use ImageIcon because it waits for the image to load...
	                logo = temp.getImage();
	               }
	        
	        return logo;
	    }*/


}
