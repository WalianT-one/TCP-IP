import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JMenuBar;

public class Fenetre extends JFrame {

	private JMenuBar menuBar = new JMenuBar();
	private JMenu fichier = new JMenu("Fichier");
	private JMenuItem quit = new JMenuItem("Quitter");
	
	private JMenu edition = new JMenu("Edition");
	private JMenuItem machine = new JMenuItem("Ajouter une machine");
	private JMenuItem routeur = new JMenuItem("Ajouter un routeur");
	private JMenuItem hub = new JMenuItem("Ajouter un hub");
	private JMenuItem switch1 = new JMenuItem("Ajouter un switch");
	

	public Fenetre() {
		this.setTitle("Demonstrateur TCP/IP");
		this.setSize(1200, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);

		
		//Barre de Menu
		this.setJMenuBar(menuBar);
		this.fichier.add(quit);
		quit.addActionListener((ActionEvent arg0) -> {
			System.exit(0);
		});
		
		this.edition.add(machine);
		this.edition.add(routeur);
		this.edition.add(hub);
		this.edition.add(switch1);
		
		menuBar.add(fichier);
		menuBar.add(edition);
	}

}
