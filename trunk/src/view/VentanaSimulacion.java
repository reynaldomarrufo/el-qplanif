package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.BorderFactory;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;
import javax.swing.SwingUtilities;

import algoritmos.FCFS;

import modelo.Proceso;
import modelo.SimuladorProcesos;

import escuchadores.SimuladorProcesosListener;
import graficadoras.DiagramaTorta;
import graficadoras.StackedBarChart;


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
public class VentanaSimulacion extends javax.swing.JFrame implements 
ActionListener,ItemListener,SimuladorProcesosListener {
	private JComboBox algComboBox;
	private JLabel algLabel;
	private JPanel confPanel;
	private JButton estButton;
	private JButton clistoButton;
	private Vector<Proceso> procesos;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VentanaSimulacion inst = new VentanaSimulacion(null);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public VentanaSimulacion(SimuladorProcesos modeloSimulador) {
		super();
		initGUI();
		modeloSimulador.agregarListener(this);
		modeloSimulador.pedirProcesos();
		ini();
	}
	
	private void ini() {
		FCFS alg=new FCFS();
		StackedBarChart c=new StackedBarChart();
		JPanel grafPanel = c.crearPanel(alg.TransFormarADataSet(procesos), alg.darTareas());
		getContentPane().add(grafPanel);
		grafPanel.setLayout(null);
		grafPanel.setBounds(12, 102, 660, 306);
		grafPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Ventana de Simulaciòn");
			{
				confPanel = new JPanel();
				getContentPane().add(confPanel);
				confPanel.setLayout(null);
				confPanel.setBounds(12, 12, 660, 78);
				confPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
				{
					algLabel = new JLabel();
					confPanel.add(algLabel);
					algLabel.setText("Algoritmo:");
					algLabel.setBounds(12, 32, 71, 16);
				}
				{
					ComboBoxModel algComboBoxModel = 
						new DefaultComboBoxModel(
								new String[] { "FCFS", "Round Robin","SJF","Prioridades","Prioridades Expulsivas","Prioridades Expulsivas + Round Robin" });
					algComboBox = new JComboBox();
					confPanel.add(algComboBox);
					algComboBox.setModel(algComboBoxModel);
					algComboBox.setBounds(81, 20, 214, 40);
					algComboBox.addItemListener(this);
				}
			}
			{
				clistoButton = new JButton();
				getContentPane().add(clistoButton);
				clistoButton.setText("Ver Cola de Listos");
				clistoButton.setBounds(42, 420, 150, 32);
			}
			{
				estButton = new JButton();
				getContentPane().add(estButton);
				estButton.setText("Ver Estadisticas");
				estButton.setBounds(507, 420, 130, 32);
			}
			pack();
			this.setSize(700, 500);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		String items;
		if(arg0.getItem().toString()=="Prioridades Expulsivas + Round Robin"){
			System.out.println("Prioridades Expulsivas");
		}
		/*items=arg0.getItem().toString();
		if (items=="FCFS"){
			System.out.println("FCFS");
		}else{
			if (items=="Round Robin"){
				System.out.println("Round Robin");
			}else{
				if (items=="SJF"){
					System.out.println("SJF");
				}else{
					if (items=="Prioridades"){
						System.out.println("Prioridades");
					}else{
						if (items=="Prioridades Expulsivas"){
							System.out.println("Prioridades Expulsivas");
						}else{
							if (items=="Prioridades Expulsivas + Round Robin"){
								System.out.println(items);
							}
						}
					}
				}
			}
			
			}*/
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listaDeProcesosModificada(SimuladorProcesos simulador) {}

	@Override
	public void nuevoProcesoAgregado(SimuladorProcesos simulador, Proceso p) {}

	@Override
	public void ProcesoEditado(SimuladorProcesos simulador, Proceso p) {}

	@Override
	public void RecibirProcesos(SimuladorProcesos simulador, Vector<Proceso> rs) {
		procesos=rs;
		
	}

	@Override
	public void PedirProcesos(SimuladorProcesos simulador) {}
}
