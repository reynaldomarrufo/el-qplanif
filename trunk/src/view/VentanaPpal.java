package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.SwingUtilities;
import modelo.*;


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
public class VentanaPpal extends javax.swing.JFrame implements 
     ActionListener{
	private Simulador modelo;
	private JMenuBar jMenuBar1;
	private JLabel estadoLabel;
	private JTabbedPane tab;
	private JMenuItem acercaMenuItem;
	private JSeparator jSeparator2;
	private JMenuItem ayudaMenuItem;
	private JMenuItem salirMenuItem;
	private JMenuItem cargarMenuItem;
	private JMenuItem nuevoMenuItem;
	private JMenu jMenu3;
	private JSeparator jSeparator1;
	private JMenu jMenu1;
	private Acercade acer;


	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				VentanaPpal inst = new VentanaPpal();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public VentanaPpal() {
		super();
		modelo=new Simulador();
		initGUI();
	}
	
	private void initGUI() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			UIManager.put("AuditoryCues.playList", UIManager.get("AuditoryCues.allAuditoryCues") );
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("EL-Qplanif: Simulador de algoritmos de Planificaciòn");
			this.setPreferredSize(new java.awt.Dimension(700, 540));
			this.setLayout(null);
			{
				tab = new JTabbedPane();
				getContentPane().add(tab);
				tab.setBounds(5, 5, 672, 440);
				tab.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent evt) {
						tabStateChanged(evt);
					}
				});
				String[] flavors = { "Procesos","Recursos","Ajustes"};
				PanelProcesos procPanel=new PanelProcesos(modelo,this);
				PanelRecursos recuPanel=new PanelRecursos(modelo,this);
				tab.addTab(flavors[0], procPanel);
				tab.addTab(flavors[1], recuPanel);
			}
			{
				estadoLabel = new JLabel();
				getContentPane().add(estadoLabel);
				estadoLabel.setText("En Linea");
				estadoLabel.setBounds(17, 451, 71, 17);
			}
			{
				jMenuBar1 = new JMenuBar();
				setJMenuBar(jMenuBar1);
				{
					jMenu1 = new JMenu();
					jMenuBar1.add(jMenu1);
					jMenu1.setText("Archivos");
					{
						nuevoMenuItem = new JMenuItem();
						jMenu1.add(nuevoMenuItem);
						nuevoMenuItem.setText("Nueva Ventana");
						nuevoMenuItem.setAccelerator(KeyStroke.getKeyStroke(
								java.awt.event.KeyEvent.VK_N,
								java.awt.event.InputEvent.CTRL_DOWN_MASK));
					}
					{
						cargarMenuItem = new JMenuItem();
						jMenu1.add(cargarMenuItem);
						cargarMenuItem.setText("Cargar Archivo");
						cargarMenuItem.addActionListener(this);
						cargarMenuItem.setAccelerator(KeyStroke.getKeyStroke(
								java.awt.event.KeyEvent.VK_F,
								java.awt.event.InputEvent.CTRL_DOWN_MASK));
					}
					{
						jSeparator1 = new JSeparator();
						jMenu1.add(jSeparator1);
					}
					{
						salirMenuItem = new JMenuItem();
						jMenu1.add(salirMenuItem);
						salirMenuItem.setText("Salir");
						salirMenuItem.addActionListener(this);
						salirMenuItem.setAccelerator(KeyStroke.getKeyStroke(
								java.awt.event.KeyEvent.VK_Q,
								java.awt.event.InputEvent.CTRL_DOWN_MASK));
					}

				}
				{
					jMenu3 = new JMenu();
					jMenuBar1.add(jMenu3);
					jMenu3.setText("Ayuda");
					jMenu3.setToolTipText("Menu Ayuda");

					{
						ayudaMenuItem = new JMenuItem();
						jMenu3.add(ayudaMenuItem);
						ayudaMenuItem.setText("Ver la ayuda");
												ayudaMenuItem.addActionListener(this);
						ayudaMenuItem.setAccelerator(KeyStroke.getKeyStroke(
								java.awt.event.KeyEvent.VK_F1,
								java.awt.event.InputEvent.CTRL_DOWN_MASK));
					}
					{
						jSeparator2 = new JSeparator();
						jMenu3.add(jSeparator2);
					}
					{
						acercaMenuItem = new JMenuItem();
						jMenu3.add(acercaMenuItem);
						acercaMenuItem.setText("Acerca de");	
						acercaMenuItem.addActionListener(this);
						
						
				   }
				}

			}
			this.setSize(691, 540);
			this.setResizable(false);
			pack();
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}




	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==salirMenuItem){
		System.exit(0);
		}else{
		    if (arg0.getSource()==acercaMenuItem){
		    acer= new Acercade(this);
		    acer.setVisible(true);
		    }else{
		    	
		    }
		}
		
	}

	private void tabStateChanged(ChangeEvent evt) {
	//	System.out.println("tab.stateChanged, event="+evt);
		//TODO add your code for tab.stateChanged
	}

}
