package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.WindowConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.jfree.ui.RefineryUtilities;

import escuchadores.SimuladorListener;
import global.Mensajes;
import modelo.OperES;
import modelo.Proceso;
import modelo.Recurso;
import modelo.Simulador;
import modelo.SimuladorProcesos;


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
public class NuevoProceso extends javax.swing.JDialog implements ActionListener,SimuladorListener{
	private JPanel desPanel;
	private JLabel nomLabel;
	private JLabel iniLabel;
	private JTextField iniTextField;
	private JButton elimButton;
	private JButton agreButton;
	private JList recuAccList;
	private JScrollPane jScrollPane1;
	private JPanel tareaESPanel;
	private JCheckBox recurCheckBox;
	private JTextField recurdurTextField;
	private JLabel recurdurLabel;
	private JTextField recuriniTextField;
	private JScrollPane jScrollPane2;
	private JButton canButton;
	private JButton acepButton;
	private JLabel recuriniLabel;
	private JList recurList;
	private JPanel recurPanel;
	private JTextField prioTextField;
	private JLabel prioLabel;
	private JTextField durTextField;
	private JLabel durLabel;
	private  JTextField nomTextField;
	private SimuladorProcesos modelo;
	private Proceso p;
	private Vector<Recurso> recursos;
	private OperES oper,op;
	private Vector<OperES> opers;
	private Simulador model;
	private static int cont=0;
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		
	}
	public NuevoProceso(SimuladorProcesos modelo,Simulador model, VentanaPpal ventanaPpal) {
		super(ventanaPpal);
		initGUI();
		this.modelo=modelo;
		if (model!=null){
		this.model=model;
		this.model.agregarListener(this);
		}
		
	}

	public NuevoProceso(SimuladorProcesos modelo,Simulador model,Proceso p, VentanaPpal ventanaPpal) {
		super(ventanaPpal);
		this.modelo=modelo;
		this.p=p;
		if (model != null) {
			this.model=model;
			this.model.agregarListener(this);
		}
		initGUI();
		ini(p);
		
	}
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setResizable(false);
			{
				desPanel = new JPanel();
				getContentPane().add(desPanel, "Center");
				desPanel.setBorder(BorderFactory.createTitledBorder("Descripciòn"));
				desPanel.setLayout(null);
				desPanel.setBounds(0, 0, 489, 170);
				{
					nomLabel = new JLabel();
					desPanel.add(nomLabel);
					nomLabel.setText("Nombre:");
					nomLabel.setBounds(17, 33, 62, 16);
				}
				{
					nomTextField = new JTextField();
					desPanel.add(nomTextField);
					nomTextField.setBounds(91, 30, 217, 23);
				}
				{
					durLabel = new JLabel();
					desPanel.add(durLabel);
					durLabel.setText("Duraciòn:");
					durLabel.setBounds(215, 75, 74, 16);
				}
				{
					durTextField = new JTextField();
					desPanel.add(durTextField);
					durTextField.setBounds(279, 72, 71, 23);
				}
				{
					iniLabel = new JLabel();
					desPanel.add(iniLabel);
					iniLabel.setText("Inicio:");
					iniLabel.setBounds(17, 75, 62, 16);
				}
				{
					iniTextField = new JTextField();
					desPanel.add(iniTextField);
					iniTextField.setBounds(91, 72, 59, 23);
				}
				{
					prioLabel = new JLabel();
					desPanel.add(prioLabel);
					prioLabel.setText("Prioridad:");
					prioLabel.setBounds(17, 111, 74, 16);
				}
				{
					prioTextField = new JTextField();
					desPanel.add(prioTextField);
					prioTextField.setBounds(91, 108, 60, 23);
				}
				{
					recurPanel = new JPanel();
					getContentPane().add(recurPanel, "West");
					recurPanel.setBorder(BorderFactory.createTitledBorder("Recursos del Sistema"));
					recurPanel.setLayout(null);
					recurPanel.setBounds(0, 176, 489, 152);
					recurPanel.setVisible(false);
					{
						jScrollPane2 = new JScrollPane();
						recurPanel.add(jScrollPane2);
						jScrollPane2.setBounds(10, 21, 122, 114);
						{
							ListModel recurListModel = 
								new DefaultComboBoxModel(
										new String[] {});
							recurList = new JList();
							jScrollPane2.setViewportView(recurList);
							recurList.setModel(recurListModel);
							recurList.addListSelectionListener(new ListSelectionListener() {
								public void valueChanged(ListSelectionEvent evt) {
									recurListValueChanged(evt);
								}
							});
						}
					}
					{
						recuriniLabel = new JLabel();
						recurPanel.add(recuriniLabel);
						recuriniLabel.setText("Inicio:");
						recuriniLabel.setBounds(138, 28, 43, 16);
					}
					{
						recuriniTextField = new JTextField();
						recurPanel.add(recuriniTextField);
						recuriniTextField.setBounds(199, 25, 69, 23);
					}
					{
						recurdurLabel = new JLabel();
						recurPanel.add(recurdurLabel);
						recurdurLabel.setText("Duraciòn:");
						recurdurLabel.setBounds(138, 60, 60, 16);
					}
					{
						recurdurTextField = new JTextField();
						recurPanel.add(recurdurTextField);
						recurdurTextField.setBounds(198, 57, 70, 23);
					}
					{
						tareaESPanel = new JPanel();
						recurPanel.add(tareaESPanel);
						tareaESPanel.setBounds(279, 12, 203, 129);
						tareaESPanel.setBorder(BorderFactory.createTitledBorder("Recursos a Accesar"));
						tareaESPanel.setLayout(null);
						{
							jScrollPane1 = new JScrollPane();
							tareaESPanel.add(jScrollPane1);
							jScrollPane1.setBounds(12, 21, 181, 96);
							{
								ListModel recuAccListModel = 
									new DefaultComboBoxModel(
											new String[] {});
								recuAccList = new JList();
								jScrollPane1.setViewportView(recuAccList);
								recuAccList.setModel(recuAccListModel);
								recuAccList.addListSelectionListener(new ListSelectionListener() {
									public void valueChanged(ListSelectionEvent evt) {
										recuAccListValueChanged(evt);
									}
								});
							}
						}
					}
					{
						agreButton = new JButton();
						recurPanel.add(agreButton);
						agreButton.setText(">>");
						agreButton.setBounds(219, 96, 55, 40);
						agreButton.setFont(new java.awt.Font("Calibri",1,14));
						agreButton.addActionListener(this);
					}
					{
						elimButton = new JButton();
						recurPanel.add(elimButton);
						elimButton.setText("<<");
						elimButton.setBounds(150, 96, 55, 40);
						elimButton.setFont(new java.awt.Font("Calibri",1,14));
						elimButton.addActionListener(this);
					}
				}
				{
					acepButton = new JButton();
					getContentPane().add(acepButton);
					acepButton.setText("Aceptar");
					acepButton.setBounds(69, 182, 85, 35);
					acepButton.addActionListener(this);
					
				}
				{
					canButton = new JButton();
					getContentPane().add(canButton);
					canButton.setText("Cancelar");
					canButton.setBounds(341, 182, 85, 35);
					canButton.addActionListener(this);
					
				}
				{
					recurCheckBox = new JCheckBox();
					desPanel.add(recurCheckBox);
					recurCheckBox.setText("Acceso a Recursos");
					recurCheckBox.setBounds(17, 141, 143, 20);
					recurCheckBox.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							recurCheckBoxActionPerformed(evt);
						}
					});
				}
			}
			pack();
			this.setSize(510, 260);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void recurCheckBoxActionPerformed(ActionEvent evt) {
		if (recurCheckBox.isSelected()){
			recurCheckBoxFunc(true);
			
		}else{
			recurCheckBoxFunc(false);
		}
	}
private void recurCheckBoxFunc(boolean vf){
	if (vf){
		model.pedirRecursos();
		actualizarRecurList();
		oper=new OperES();
		this.setSize(510,420);
		recurPanel.setBounds(0, 176, 489, 152);
		recurPanel.setVisible(true);
		canButton.setBounds(330, 335, 85, 35);
		acepButton.setBounds(69, 182, 85, 35);
		acepButton.setBounds(63, 335, 85, 35);
	}else{
		this.setPreferredSize(new java.awt.Dimension(510, 260));
		recurPanel.setVisible(false);
		canButton.setBounds(341, 182, 85, 35);
		acepButton.setBounds(69, 182, 85, 35);
		pack();
		if ((opers!=null)&&(opers.size()>0))opers=null;
		cont=0;
	}
}
private void ini(Proceso proc){
	nomTextField.setText(proc.getNom());
	iniTextField.setText(""+proc.getIni());
	durTextField.setText(""+proc.getDur());
	prioTextField.setText(""+proc.getPrio());
	if ((proc.getOperEntSalida()!=null)&&(proc.getOperEntSalida().size()>0)){
	recurCheckBoxFunc(true);
	recurCheckBox.setSelected(true);
	recurCheckBox.setEnabled(false);
	opers=proc.getOperEntSalida();
	actualizarRecuAccList();
	cont=proc.getOperEntSalida().size();
	}
}
private void actualizarRecurList(){
	((DefaultComboBoxModel) recurList.getModel()).removeAllElements();
	if (recursos!=null){
	for (Recurso recurso : recursos) {
		((DefaultComboBoxModel) recurList.getModel()).addElement(recurso);
	}
	recurList.updateUI();
	}
}
private void actualizarRecuAccList(){
	((DefaultComboBoxModel) recuAccList.getModel()).removeAllElements();
	if (opers!=null){
	for (OperES opera : opers) {
		((DefaultComboBoxModel) recuAccList.getModel()).addElement(opera);
	}
	recuAccList.updateUI();
	}
}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==canButton){
			this.setVisible(false);
			cont=0;
		}else{
		    if(arg0.getSource()==acepButton){
			Proceso proc=new Proceso(nomTextField.getText(),Integer.parseInt(iniTextField.getText()),Integer.parseInt(durTextField.getText()),Integer.parseInt(prioTextField.getText()));
		     if ((opers!=null)&&(opers.size()>0)){
		    	 proc.setOperEntSalida(opers);
		     }else{
		    	 proc.setOperEntSalida(null);
		     }  
			   if (p!=null){
			   System.out.println("EditProc id: "+p.getIdin());
    		   proc.setIdin(p.getIdin());
    		   modelo.editarProceso(proc);
    	       }else{
		       modelo.agregarProceso(proc);
    	       }
			cont=0;
		    this.setVisible(false);	
		    }else{
		    	if(arg0.getSource()==agreButton){
		    		if((oper!=null)&&(oper.getRecur()!=null)){
		    			if(opers==null){
		    				opers=new Vector <OperES>();
		    			}
		    			System.out.println("ID Asignado: "+cont);
		    		oper.setIdIn(cont);
		    		oper.setIni(Integer.parseInt(recuriniTextField.getText()));
		    		oper.setDur(Integer.parseInt(recurdurTextField.getText()));
		    		opers.addElement(oper);
		    		cont++;
					recuriniTextField.setText("");
		    		recurdurTextField.setText("");
		    		oper=null;
					actualizarRecuAccList();
					actualizarRecurList();
		    		}else{
		    			Mensajes mensaje=new Mensajes();
    					mensaje.MensajeError("No Hay Recursos del sistema para agregar o no seleciono ninguno");
		    		}
		    	}else{
		    		if(arg0.getSource()==elimButton){
		    			if ((op!=null)&&(opers.size()>0)){
		    				if (opers.size()>0){
		    					System.out.println("Opc elegida: "+op.getIdIn());
		    					for (int i=op.getIdIn()+1;i<opers.size();i++){
		    						System.out.println("I vale:"+i+" Tamaño: "+opers.size());
		    					 OperES aux=opers.elementAt(i);
		    			    	 aux.setIdIn(aux.getIdIn()-1);
		    			    	 opers.removeElementAt(aux.getIdIn());
		    			    	 opers.insertElementAt(aux, aux.getIdIn());
		    					 }
		    					opers.removeElementAt(opers.lastElement().getIdIn());
		    					System.out.println("Cont vale: "+cont);
		    					cont=opers.size();
		    				 }else{
		    					 cont=0;
		    					 opers=null;
		    				 }
		    				actualizarRecuAccList();
		    				op=null;
		    				}else{
		    					Mensajes mensaje=new Mensajes();
		    					mensaje.MensajeError("No Hay Recursos a Acceder a Elimnar o no seleciono ninguno");
		    				}
		    			
		    		}
		    	}
		    }
		}
	}
	@Override
	public void PedirRecursos(Simulador simulador) {
		// TODO Auto-generated method stub
	}
	@Override
	public void RecibirRecursos(Simulador simulador, Vector<Recurso> rs) {
		recursos=rs;
	}
	
	private void recurListValueChanged(ListSelectionEvent evt) {
		if (oper==null){
		oper=new OperES();	
		}else{
		oper.setRecur((Recurso)recurList.getSelectedValue());
		}
	}
	
	private void recuAccListValueChanged(ListSelectionEvent evt) {
		op=(OperES)recuAccList.getSelectedValue();
	}

}
