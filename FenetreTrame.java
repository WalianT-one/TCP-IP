import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FenetreTrame extends JFrame {
	private JButton correction = new JButton("Correction");
	
	public FenetreTrame() {
		this.setTitle("Visualisation de la trame");
		this.setSize(1400, 780);

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		PanneauImage pan = new PanneauImage();
		
		pan.setLayout(new BorderLayout());
		
		pan.add(correction, BorderLayout.EAST);
		
		
		
		

		
		

		this.setBackground(Color.WHITE);

		this.setContentPane(pan);
		
		correction.addActionListener(new ActionListener(){
			//On affiche la correction de l'exercice sur la Trame

		      public void actionPerformed(ActionEvent event){

		       FenetreCorrection correct = new FenetreCorrection();
		       

		      }

		    });
	}
}
