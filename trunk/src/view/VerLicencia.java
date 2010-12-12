package view;

import javax.swing.JLabel;
import javax.swing.JScrollPane;


public class VerLicencia extends javax.swing.JDialog {
	private JScrollPane jScrollPane1;
	private JLabel licLabel;

	/**
	* Auto-generated main method to display this 
	* JPanel inside a new JFrame.
	*/
	
	public VerLicencia(Acercade acer) {
		super(acer);
		initGUI();
	}
	
	private void initGUI() {
		try {
			this.setPreferredSize(new java.awt.Dimension(415, 490));
			this.setLayout(null);
			this.setSize(415, 490);
			this.setTitle("Licencia de EL-QPlanif");
			
			{
				
				jScrollPane1 = new JScrollPane();
				this.add(jScrollPane1);
				jScrollPane1.setBounds(12, 21, 376, 419);
				{
					licLabel = new JLabel();
					jScrollPane1.setViewportView(licLabel);
					licLabel.setText(dameTexto());
					
					
				}
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  private static String dameTexto(){
	  String t="";
	  t = "<html>      GNU GENERAL PUBLIC LICENSE<P>"+
		"<html> <P>"+"<html>Version 3, 29 June 2007<P>"+
		"<html> <P>"+
		"<html>Copyright © 2007 Free Software Foundation,Inc.<P>"+
		"<html> <P>"+
		"<html> Everyone is permitted to copy and distribute verbatim<P>"+
		"<html>copies of this license document, but changing it is not<P>"+
		"<html>allowed.<P>"+
		"<html> <P>"+
		"<html>	Preamble<P>"+
		"<html> <P>"+
		"<html>The GNU General Public License is a free, copyleft<P>"+
		"<html>license for software and other kinds of works.<P>"+
		"<html> <P>"+
		"<html>The licenses for most software and other practical<P>"+
		"<html>works are designed to take away your freedom to share <P>"+
		"<html>and change the works. By contrast, the GNU General<P>"+
		"<html>Public License is intended to guarantee your freedom to<P>"+
		"<html>share and change all versions of a program--to make<P>"+
		"<html>sure it remains free software for all its users. We,<P>"+
		"<html>the Free Software Foundation, use the GNU General Public<P>"+
		"<html>License for most of our software; it applies also to any<P>"+
		"<html>other work released this way by its authors.You can apply<P>"+
	  "<html>it to your programs, too.<P>"+"<html> <P>"+
	  "<html>When we speak of free software, we are referring to<P>"+
	  "<html>freedom, not price. Our General Public Licenses are<P>"+ 
	  "<html>designed to make sure that you have the freedom to<P>"+ 
	  "<html>distribute copies of free software (and charge for them<P>"+ 
	  "<html>if you wish), that you receive source code or can get it<P>"+
	  "<html>if you want it, that you can change the software or use<P>"+
	  "<html>pieces of it in new free programs, and that you know you<P>"+
	  "<html>can do these things.<P>"+"<html> <P>"+
      "<html> To protect your rights, we need to prevent others from<P>"+
      "<html>denying you these rights or asking you to surrender the<P>"+
      "<html>rights. Therefore, you have certain responsibilities if<P>"+
      "<html>you distribute copies of the software, or if you modify<P>"+
      "<html>it: responsibilities to respect the freedom of others.<P>"+"<html> <P>"+
      "<html>For example, if you distribute copies of such a program,<P>"+
      "<html>whether gratis or for a fee, you must pass on to the<P>"+ 
      "<html>recipients the same freedoms that you received. You must<P>"+
      "<html>make sure that they, too, receive or can get the source<P>"+ 
	  "<html>code. And you must show them these terms so they know <P>"+
	  "<html>their rights.<P>"+"<html> <P>"+
	  "<html>Developers that use the GNU GPL protect your rights with<P>"+
	  "<html>two steps: (1) assert copyright on the software, and (2)<P>"+
	  "<html>offer you this License giving you legal permission to<P>"+
	  "<html>copy, distribute and/or modify it.<P>"+"<html> <P>"+
	  "<html> For the developers' and authors' protection, the GPL<P>"+ 
	  "<html>clearly explains that there is no warranty for this free<P>"+
	  "<html>software. For both users' and authors' sake, the GPL <P>"+
	  "<html>requires that modified versions be marked as changed, so<P>"+
	  "<html>that their problems will not be attributed erroneously to<P>"+
	  "<html>authors of previous versions.<P>";
	  return t;
  }
}
