package global;


	//: c13:MessageBoxes.java
	// Demuestra JoptionPane.
	// <applet code=MessageBoxes
	// width=200 height=150> </applet>
import javax.swing.*;

import view.NuevoProceso;

import java.awt.event.*;
import java.awt.*;

public class Mensajes extends JFrame {
	
	/*JButton[] b = { new JButton("Alert"),
	new JButton("Yes/No"), new JButton("Color"),
	new JButton("Input"), new JButton("3 Vals")
	};*/
	/*JTextField txt = new JTextField(15);
	ActionListener al = new ActionListener() {*/

	public void MensajeError(String men){
	JOptionPane.showMessageDialog(null,	men, "EL-QPlanif dice:",
			JOptionPane.ERROR_MESSAGE);
}
/*public void actionPerformed(ActionEvent e){
String id =((JButton)e.getSource()).getText();
if(id.equals("Alert"))
	JOptionPane.showMessageDialog(null,	"There's a bug on you!", "Hey!",
	JOptionPane.ERROR_MESSAGE);
	else if(id.equals("Yes/No"))
	JOptionPane.showConfirmDialog(null,	"or no", "choose yes",
	JOptionPane.YES_NO_OPTION);
	else if(id.equals("Color")) {
	Object[] options = { "Red", "Green" };
	int sel = JOptionPane.showOptionDialog(
	null, "Choose a Color!", "Warning",
	JOptionPane.DEFAULT_OPTION,
	JOptionPane.WARNING_MESSAGE, null,
	options, options[0]);
	if(sel != JOptionPane.CLOSED_OPTION)
	txt.setText(
	"Color Selected: " + options[sel]);
	} else if(id.equals("Input")) {
	String val = JOptionPane.showInputDialog(
	"How many fingers do you see?");
	txt.setText(val);
	} else if(id.equals("3 Vals")) {
	Object[] selections = {
	"First", "Second", "Third" };
	Object val = JOptionPane.showInputDialog(
	null, "Choose one", "Input",
	JOptionPane.INFORMATION_MESSAGE,
	null, selections, selections[0]);
	if(val != null)
	txt.setText(
	val.toString());
	}
	}
	};
	public void init() {
	Container cp = getContentPane();
	cp.setLayout(new FlowLayout());
	for(int i = 0; i < b.length; i++) {
	b[i].addActionListener(al);
	cp.add(b[i]);
	}
	cp.add(txt);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Mensajes inst = new Mensajes();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
}
	public Mensajes(){
		super();
		init();
	}*/
	
}


                           