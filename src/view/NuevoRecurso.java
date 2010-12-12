package view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import modelo.Recurso;
import modelo.SimuladorRecursos;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NuevoRecurso extends javax.swing.JDialog implements ActionListener {
	private JPanel editPanel;
	private JLabel enomLabel;
	private JButton calButton;
	private JButton acepButton;
	private JButton colButton;
	private JTextField colTextField;
	private JLabel colLabel;
	private JTextField enomTextField;
	private Color color = Color.BLUE;
	private SimuladorRecursos modelo;
	private Recurso r;
		/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		
	}
	
	public NuevoRecurso(SimuladorRecursos modelo, VentanaPpal ventanaPpal) {
		super(ventanaPpal);
		initGUI();
		this.modelo=modelo;
	}
	public NuevoRecurso(SimuladorRecursos modelo,Recurso r,VentanaPpal ventanaPpal) {
		super(ventanaPpal);
		initGUI();
		this.modelo=modelo;
		this.r=r;
		ini(r);
	}
	private void initGUI() {
		try {
			{
				getContentPane().setLayout(null);
				this.setTitle("Nuevo Recurso");
			}
			{
				editPanel = new JPanel();
				getContentPane().add(editPanel, "Center");
				editPanel.setBorder(BorderFactory.createTitledBorder("Descripciòn"));
				editPanel.setLayout(null);
				editPanel.setBounds(0, 0, 384, 165);
				{
					enomLabel = new JLabel();
					editPanel.add(enomLabel);
					enomLabel.setText("Nombre:");
					enomLabel.setBounds(17, 33, 67, 16);
				}
				{
					enomTextField = new JTextField();
					editPanel.add(enomTextField);
					enomTextField.setBounds(84, 30, 201, 23);
				}
				{
					colLabel = new JLabel();
					editPanel.add(colLabel);
					colLabel.setText("Color:");
					colLabel.setBounds(17, 87, 55, 16);
				}
				{
					colTextField = new JTextField();
					editPanel.add(colTextField);
					colTextField.setEditable(false);
					colTextField.setBounds(84, 84, 201, 23);
				}
				{
					colButton = new JButton();
					editPanel.add(colButton);
					colButton.setText("Agregar Color");
					colButton.setBounds(107, 119, 114, 36);
					colButton.addActionListener(this);
				}
			}
			{
				acepButton = new JButton();
				getContentPane().add(acepButton);
				acepButton.setText("Aceptar");
				acepButton.setBounds(27, 170,85,35);
				acepButton.addActionListener(this);
			}
			{
				calButton = new JButton();
				getContentPane().add(calButton);
				calButton.setText("Cancelar");
				calButton.setBounds(278, 170, 85, 35);
				calButton.addActionListener(this);
			}
			this.setSize(400, 249);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==colButton){
			color = JColorChooser.showDialog( 
	                  NuevoRecurso.this, "Seleccione un color", color );

	               // establecer color predeterminado, si no se devuelve un color 
	               if ( color == null )
	                  color = Color.BLUE;
	               colTextField.setBackground(color);
		}else{
			if (arg0.getSource()==acepButton){
				Recurso recurso=new Recurso(enomTextField.getText(),colTextField.getBackground());
				  if (r!=null){
		    		   recurso.setIdIn(r.getIdIn());
		    		   modelo.editarRecurso(recurso);
		    	   }else{
				   modelo.agregarRecurso(recurso);
		    	   }
				  this.setVisible(false);
			}else{
				if(arg0.getSource()==calButton){
					this.setVisible(false);	
				}
			}
		}
		
	}
	private void ini(Recurso recur){
		enomTextField.setText(recur.getNombre());
		colTextField.setBackground(recur.getColor());
	}
}
