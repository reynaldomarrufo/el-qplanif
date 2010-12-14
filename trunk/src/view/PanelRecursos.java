package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Recurso;
import modelo.Simulador;
import modelo.SimuladorRecursos;
import escuchadores.SimuladorListener;
import escuchadores.SimuladorRecursosListener;
import global.Mensajes;



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
public class PanelRecursos extends javax.swing.JPanel implements ActionListener,SimuladorRecursosListener,SimuladorListener {
	private JScrollPane jScrollPane1;
	private JButton editButton;
	private JLabel nomLabel;
	private JButton eliButton;
	private JButton NueButton;
	private JTextField colorTextField;
	private JTextField nomTextField;
	private JLabel colorLabel;
	private JPanel recurPanel;
	private JList recurList;
	private SimuladorRecursos modeloSimulador;
	private static Vector<Recurso> recursos;
	private static Recurso recur;
	private static int cont=-1;
	private static boolean vf;
	private VentanaPpal ventanaPpal;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		
	}
	
	public PanelRecursos(Simulador modelo, VentanaPpal ventanaPpal) {
		super();
		if (modelo!= null) {
			modelo.agregarListener(this);
			this.ventanaPpal=ventanaPpal;
		}
		this.modeloSimulador = new SimuladorRecursos();
		this.modeloSimulador.agregarListener(this);
		recursos = new Vector<Recurso>();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(612, 410));
			this.setBorder(BorderFactory.createTitledBorder("Recursos del Sistema"));
			this.setLayout(null);
			{
				jScrollPane1 = new JScrollPane();
				this.add(jScrollPane1);
				jScrollPane1.setBounds(12, 21, 257, 277);
				{
					ListModel recurListModel = 
						new DefaultComboBoxModel(
								new String[] {});
					recurList = new JList();
					jScrollPane1.setViewportView(recurList);
					recurList.setModel(recurListModel);
					recurList.addListSelectionListener(new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent evt) {
							recurListValueChanged(evt);
						}
					});
				}
			}
			{
				recurPanel = new JPanel();
				this.add(recurPanel);
				recurPanel.setBounds(281, 21, 314, 100);
				recurPanel.setBorder(BorderFactory.createTitledBorder("Descripciòn"));
				recurPanel.setLayout(null);
				{
					nomLabel = new JLabel();
					recurPanel.add(nomLabel);
					nomLabel.setText("Nombre:");
					nomLabel.setBounds(17, 33, 78, 16);
				}
				{
					colorLabel = new JLabel();
					recurPanel.add(colorLabel);
					colorLabel.setText("Color:");
					colorLabel.setBounds(17, 68, 52, 16);
				}
				{			
					nomTextField = new JTextField();
					recurPanel.add(nomTextField);
					nomTextField.setBounds(87, 30, 203, 23);
					
					
				}
				{
					colorTextField = new JTextField();
					recurPanel.add(colorTextField);
					colorTextField.setBounds(87, 65, 203, 23);
					colorTextField.setEditable(false);
				}
			}
			{
				NueButton = new JButton();
				this.add(NueButton);
				NueButton.setText("Nuevo");
				NueButton.setBounds(17, 310, 100,30);
				NueButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("recursos/imag/add_over.png")));
				NueButton.addActionListener(this);
			}
			{
				eliButton = new JButton();
				this.add(eliButton);
				eliButton.setText("Eliminar");
				eliButton.setBounds(176, 310, 100, 30);
				eliButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("recursos/imag/close_mini.png")));
				eliButton.addActionListener(this);
			}
			{
				editButton = new JButton();
				this.add(editButton);
				editButton.setText("Editar");
				editButton.setBounds(400, 127, 100, 30);
				editButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("recursos/imag/reload_mini.png")));
				editButton.addActionListener(this);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void recurListValueChanged(ListSelectionEvent evt) {
		if(vf==true){
			recur=(Recurso)recurList.getSelectedValue();
			nomTextField.setText(recur.getNombre());
			colorTextField.setBackground(recur.getColor());
			
		}
		
	}

	@Override
	public void listaDeRecursosModificada(SimuladorRecursos simulador) {
		actualizarRecurList();
		
	}

	@Override
	public void nuevoRecursoAgregado(SimuladorRecursos simulador, Recurso r) {
		agregarRecur(r);
		
	}

	@Override
	public void recursoEditado(SimuladorRecursos simulador, Recurso r) {
		EditRecur(r);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==NueButton){
			NuevoRecurso nr=new NuevoRecurso(modeloSimulador,ventanaPpal);
			nr.setVisible(true);
			setearTextField();
			vf = false;
			cont++;
		}else{
			if (arg0.getSource()==eliButton){
				if ((recur!=null)&&(recursos.size()>0)){
				   if (recursos.size()>1){
					    for (int i=recur.getIdIn()+1;i<recursos.size();i++){
					    Recurso recurs=recursos.elementAt(i);
			    	    recurs.setIdIn(recurs.getIdIn()-1);
			    	    recursos.removeElementAt(recurs.getIdIn());
			    	    recursos.insertElementAt(recurs, recurs.getIdIn());
					    }
					recursos.removeElementAt(recursos.lastElement().getIdIn());
					cont=recursos.size()-1;
				    }else{
					 cont=-1;
					 recursos=null;
				    }
				setearTextField();
				vf=false;
				modeloSimulador.notificarCambioListaRecursos();
				}else{
					Mensajes mensaje=new Mensajes();
					mensaje.MensajeError("No Hay Recursos a Elimnar o no seleciono ninguno");
				}
			}else{
				if(arg0.getSource()==editButton){
					if (recur!=null){
						NuevoRecurso er=new NuevoRecurso(modeloSimulador,recur,ventanaPpal);
						er.setTitle("Editar Recurso");
						er.setVisible(true);
						setearTextField();
						vf=false;
						}else{
							Mensajes mensaje=new Mensajes();
							mensaje.MensajeError("No Hay Recurso a Editar o no seleciono ninguno");
						}
				}
			}
		}
		
	}
	private void setearTextField(){
		nomTextField.setText("");
		colorTextField.setBackground(null);
		recur=null;
	}
	public void agregarRecur(Recurso r){
		if (recursos==null){
			recursos = new Vector<Recurso>();
		}
		r.setIdIn(cont);
		recursos.addElement(r);
		actualizarRecurList();
	}
	public void EditRecur(Recurso r){
		recursos.removeElementAt(r.getIdIn());
		recursos.insertElementAt(r, r.getIdIn());
		actualizarRecurList();
	}
	public void actualizarRecurList(){
		((DefaultComboBoxModel) recurList.getModel()).removeAllElements();
		if (recursos!=null){
		for (Recurso recurso : recursos) {
			((DefaultComboBoxModel) recurList.getModel()).addElement(recurso);
		}
		recurList.updateUI();
		vf = true;
		}
	}

	@Override
	public void PedirRecursos(Simulador simulador) {
		simulador.darRecurso(recursos);
	}

	@Override
	public void RecibirRecursos(Simulador simulador, Vector<Recurso> rs) {
		// TODO Auto-generated method stub
	}

}
