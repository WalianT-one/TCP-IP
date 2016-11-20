import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FenetreCorrection extends JFrame{
	private JLabel label = new JLabel();
	private JPanel panel = new JPanel();
	
	public FenetreCorrection(){
		this.setTitle("Correction");
		this.setSize(500, 400);
		
		label.setText("La réponse est: Bonne chance pour le module!");
		panel.add(label);

		
		this.add(panel);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
	}

}
