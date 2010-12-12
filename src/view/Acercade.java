package view;
import global.Hipervinculo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.SwingUtilities;

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
public class Acercade extends javax.swing.JDialog implements ActionListener {
	private JPanel jPanel1;
	private JLabel jLabel3;
	private JButton verLButton;
	private JLabel pageLabel;
	private JLabel webLabel;
	private JLabel autorLabel;
	private JButton aceptarButton;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private VerLicencia licen;
	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Acercade inst = new Acercade(null);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);		
			}
		});
	}
	
	public Acercade(VentanaPpal p) {
		super(p);
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setPreferredSize(new java.awt.Dimension(500, 255));
			this.setTitle("Acerca de EL-Qplanif");
			{
				jPanel1 = new JPanel();
				getContentPane().add(jPanel1, BorderLayout.CENTER);
				jPanel1.setLayout(null);
				jPanel1.setBounds(12, 12, 460, 144);
				jPanel1.setBorder(BorderFactory.createTitledBorder(null, "", TitledBorder.LEADING, TitledBorder.DEFAULT_POSITION));
				{
					jLabel1 = new JLabel();
					jPanel1.add(jLabel1);
					jLabel1.setText("EL-QPlanif");
					jLabel1.setBounds(117, 7, 207, 53);
					jLabel1.setFont(new java.awt.Font("Chiller",1,50));
				}
				{
					jLabel2 = new JLabel();
					jPanel1.add(jLabel2);
					jLabel2.setText("Version 0.01");
					jLabel2.setBounds(178, 60, 88, 16);
				}
				{
					jLabel3 = new JLabel();
					jPanel1.add(jLabel3);
					jLabel3.setText("Leaño Edgar");
					jLabel3.setBounds(133, 100, 96, 16);
				}
				{
					autorLabel = new JLabel();
					jPanel1.add(autorLabel);
					autorLabel.setText("Autor:");
					autorLabel.setBounds(79, 97, 60, 18);
					autorLabel.setFont(new java.awt.Font("Segoe UI",0,16));
					
				}
				{
					String t="http://www.edgarlea.com.ar";
					pageLabel = new Hipervinculo(t , null, t);
					jPanel1.add(pageLabel);
					pageLabel.setText(t);
					pageLabel.setBounds(277, 100, 164, 16);
					
				}
				{
					webLabel = new JLabel();
					jPanel1.add(webLabel);
					webLabel.setText("Web:");
					webLabel.setFont(new java.awt.Font("Segoe UI",0,16));
					webLabel.setBounds(233, 97, 47, 18);
				}

			}
			{
				aceptarButton = new JButton();
				getContentPane().add(aceptarButton);
				aceptarButton.setText("Aceptar");
				aceptarButton.setBounds(333, 168, 114, 38);
				aceptarButton.addActionListener(this);
			}
			{
				verLButton = new JButton();
				getContentPane().add(verLButton);
				verLButton.setText("Ver Licencia");
				verLButton.setBounds(39, 168, 107, 37);
				verLButton.addActionListener(this);
			}
			
			setSize(500, 255);
			pack();
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
 
    	 
    	 public void actionPerformed(ActionEvent arg0)  {
    		 if (arg0.getSource()==aceptarButton){
    		 this.setVisible(false);
    		 }else{
    			 if (arg0.getSource()==verLButton){
    				 licen = new VerLicencia(this); 
    				 licen.setVisible(true);
    			  }
    		 }
    	 }
}
