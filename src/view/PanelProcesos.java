package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListModel;
import escuchadores.SimuladorProcesosListener;
import global.Mensajes;
import modelo.OperES;
import modelo.Proceso;
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
public class PanelProcesos extends javax.swing.JPanel implements ActionListener,SimuladorProcesosListener {
	private JScrollPane jScrollPane1;
	private JLabel nomLabel;
	private JLabel iniLabel;
	private JTextField iniTextField;
	private JButton simuButton;
	private JButton elimButton;
	private JButton nueButton;
	private JScrollPane jScrollPane2;
	private JPanel recurPanel;
	private JTextField prioTextField;
	private JLabel prioLabel;
	private JTextField durTextField;
	private JLabel durLabel;
	private JTextField nomTextField;
	private JPanel desPanel;
	private JList procList;
    private SimuladorProcesos modeloSimulador;
    private Simulador modelo;
	private JButton editButton;
	private static Vector<Proceso> procesos;
	private static boolean vf;
	private JTable recurTable;
	private static Proceso proc;
	private static OperES op;
	private static int cont=-1;
	private DefaultTableModel recurTableModel;
	private VentanaPpal ventanaPpal;
	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	public static void main(String[] args) {
		
	}
	
	public PanelProcesos(Simulador modelo, VentanaPpal ventanaPpal) {
		super();
		if (modeloSimulador == null) {
			this.modeloSimulador = new SimuladorProcesos();
			this.modeloSimulador.agregarListener(this);
			this.ventanaPpal=ventanaPpal;
		}
		this.modelo=modelo;
		procesos = new Vector<Proceso>();
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(612, 410));
			this.setLayout(null);
			this.setBorder(BorderFactory.createTitledBorder("Procesos a Simular"));
			{
				jScrollPane1 = new JScrollPane();
				this.add(jScrollPane1);
				jScrollPane1.setBounds(12, 21, 257, 277);
				{
					ListModel procListModel = 
						new DefaultComboBoxModel(
								new String[] {});
					procList = new JList();
					jScrollPane1.setViewportView(procList);
					procList.setModel(procListModel);
					procList.setForeground(new java.awt.Color(255,0,0));
					procList.addListSelectionListener(new ListSelectionListener() {
						public void valueChanged(ListSelectionEvent evt) {
							procListValueChanged(evt);
						}
					});
				}
			}
			{
				desPanel = new JPanel();
				this.add(desPanel);
				desPanel.setLayout(null);
				desPanel.setBounds(281, 21, 325, 277);
				desPanel.setBorder(BorderFactory.createTitledBorder("Descripciòn"));
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
					durLabel.setText("Duracion:");
					durLabel.setBounds(168, 75, 74, 16);
				}
				{
					durTextField = new JTextField();
					desPanel.add(durTextField);
					durTextField.setBounds(232, 72, 55, 23);	
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
					desPanel.add(recurPanel);
					recurPanel.setBounds(10, 137, 305, 130);
					recurPanel.setBorder(BorderFactory.createTitledBorder("Tareas de Acceso a Recursos"));
					recurPanel.setLayout(null);
					{
						jScrollPane2 = new JScrollPane();
						recurPanel.add(jScrollPane2);
						jScrollPane2.setBounds(5, 21, 288, 102);
						{
							recurTableModel = 
								new DefaultTableModel(
										new String[][] { { "", "", "" } },
										new String[] { "Nombre", "Inicio","Duraciòn"});
							recurTable = new JTable();
							jScrollPane2.setViewportView(recurTable);
							recurTable.setModel(recurTableModel);
						}
					}
				}
			}
			{
				nueButton = new JButton();
				this.add(nueButton);
				nueButton.setText("Nuevo");
				nueButton.setBounds(17, 310, 100, 30);
				nueButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("recursos/imag/add_over.png")));
				nueButton.addActionListener(this);
			}
			{
				elimButton = new JButton();
				this.add(elimButton);
				elimButton.setText("Eliminar");
				elimButton.setBounds(179, 310, 100, 30);
				elimButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("recursos/imag/close_mini.png")));
				elimButton.addActionListener(this);
			}
			{
				editButton = new JButton();
				this.add(editButton);
				editButton.setText("Editar");
				editButton.setBounds(402, 310, 100, 30);
				editButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("recursos/imag/reload_mini.png")));
				editButton.addActionListener(this);
			}
			{
				simuButton = new JButton();
				this.add(simuButton);
				simuButton.setText("Simular");
				simuButton.setBounds(226, 351, 170, 45);
				simuButton.setFont(new java.awt.Font("Segoe UI",1,24));
				simuButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("recursos/imag/ok.png")));
				simuButton.addActionListener(this);
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==nueButton){
			NuevoProceso np=new NuevoProceso(modeloSimulador,modelo,ventanaPpal);
			np.setTitle("Nuevo Proceso");
			np.setVisible(true);
			setearTextField();
			vf = false;
			cont++;
		}else{
			if (arg0.getSource()==elimButton){
				if ((proc!=null)&&(procesos.size()>0)){
				if (procesos.size()>1){
					for (int i=proc.getIdin()+1;i<procesos.size();i++){
					 Proceso proca=procesos.elementAt(i);
			    	 proca.setIdin(proca.getIdin()-1);
			    	 procesos.removeElementAt(proca.getIdin());
			    	 procesos.insertElementAt(proca, proca.getIdin());
					 }
					procesos.removeElementAt(procesos.lastElement().getIdin());
					cont=procesos.size()-1;
				 }else{
					 cont=-1;
					 procesos=null;
				 }
					setearTextField();
					vf=false;
					modeloSimulador.notificarCambioListaProcesos();
				}else{
					Mensajes mensaje=new Mensajes();
					mensaje.MensajeError("No Hay Procesos a Elimnar o no seleciono ninguno");
				}
			}else{
				if (arg0.getSource()==editButton){
					if (proc!=null){
					NuevoProceso ep=new NuevoProceso(modeloSimulador,modelo,proc,ventanaPpal);
					ep.setTitle("Editar Proceso");
					ep.setVisible(true);
					setearTextField();
					vf=false;
					}else{
						Mensajes mensaje=new Mensajes();
						mensaje.MensajeError("No Hay Procesos a Editar o no seleciono ninguno");
					}
				}else{
					if(arg0.getSource()==simuButton){
						VentanaSimulacion vs=new VentanaSimulacion(modeloSimulador);
						vs.setVisible(true);
					}
				}
			}
		}
		
	}

private void setearTextField(){
	nomTextField.setText("");
	iniTextField.setText("");
	durTextField.setText("");
	prioTextField.setText("");
	op=null;
	proc=null;
	recurTableModel = new DefaultTableModel(
				new String[][] { {} },
				new String[] { "Nombre", "Inicio","Duraciòn"});
	recurTable.setModel(recurTableModel);
}
public void agregarProc(Proceso p){
	if (procesos==null){
		procesos = new Vector<Proceso>();
	}
	p.setIdin(cont);
	procesos.addElement(p);
	actualizarProcList();
}
public void EditProc(Proceso p){
	//System.out.println("EditProc id: "+p.getIdin());
	procesos.removeElementAt(p.getIdin());
	procesos.insertElementAt(p, p.getIdin());
	actualizarProcList();
}
public void actualizarProcList(){
	((DefaultComboBoxModel) procList.getModel()).removeAllElements();
	if (procesos!=null){
	for (Proceso proceso : procesos) {
		((DefaultComboBoxModel) procList.getModel()).addElement(proceso);
	}
	procList.updateUI();
	vf = true;
	}
}
@Override
	public void listaDeProcesosModificada(SimuladorProcesos simulador) {
		actualizarProcList();	
	}

	@Override
	public void nuevoProcesoAgregado(SimuladorProcesos simulador, Proceso p) {
		agregarProc(p);
	}
	
	private void procListValueChanged(ListSelectionEvent evt) {
		if (vf==true){
			proc=(Proceso)procList.getSelectedValue();
			nomTextField.setText(proc.getNom());
			iniTextField.setText(""+proc.getIni());
			durTextField.setText(""+proc.getDur());
			prioTextField.setText(""+proc.getPrio());
			actualizarRecuTable(proc.getOperEntSalida());
		}
	}

	@Override
	public void ProcesoEditado(SimuladorProcesos simulador, Proceso p) {
		EditProc(p);
	}
	@SuppressWarnings("serial")
	private void actualizarRecuTable(Vector<OperES> opers){
		recurTableModel = new DefaultTableModel(new String[][] {},
				new String[] { "Nombre", "Inicio", "Duraciòn"}) {
	            public boolean isCellEditable(int f, int c) {
		        return false;
	            }
        };
		if (opers!=null){
		for (OperES opera : opers) {
			recurTableModel.addRow(new String[] {
					opera.getRecur().getNombre(),""+opera.getIni(),""+opera.getDur()});
		}
		}
		recurTable.setModel(recurTableModel);
	}

	@Override
	public void RecibirProcesos(SimuladorProcesos simulador, Vector<Proceso> rs) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void PedirProcesos(SimuladorProcesos simulador) {
			simulador.DarProcesos(procesos);	
	}
	

}
