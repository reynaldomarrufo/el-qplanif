package global;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.JLabel;

public class Hipervinculo extends JLabel{
	String url;
	Color rc=Color.BLUE;
	private static CrearHiperVinculo hv=new CrearHiperVinculo();;
	
	public Hipervinculo(String text, Icon icon, String url) { 
		super (text); 
		this.setIcon(icon); 
		this.url=url; 
		this.setForeground(rc);
		addListeners(); 
	} 
	private void addListeners() { 
		final String thisUrl=url; 
		this.addMouseListener( new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { 
			hv.displayURL(thisUrl); 
			} 
		    public void mouseEntered(MouseEvent e) {
			Hipervinculo.this.rc=Hipervinculo.this.getForeground(); 
			Hipervinculo.this.setCursor( new Cursor(Cursor.HAND_CURSOR)); 
			Hipervinculo.this.setForeground(Color.red); 
			} 
		    public void mouseExited(MouseEvent e) { 
			Hipervinculo.this.setForeground(Hipervinculo.this.rc); 
			Hipervinculo.this.setCursor( new Cursor(Cursor.DEFAULT_CURSOR)); 
			} 
		} ); 
		} 

}
