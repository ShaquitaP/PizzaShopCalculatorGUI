import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ToppingsPanelInfo extends JPanel{
	private final String BASE = "TOPPINGS";
	
	
	public ToppingsPanelInfo() {
		
		TitledBorder toppingsTitle = new TitledBorder(BASE);
		toppingsTitle.setTitleJustification(TitledBorder.CENTER);		
		setBorder(toppingsTitle);
		setLayout(new GridLayout(6,1,0,0));
		
		JCheckBox pep = new JCheckBox("Pepporoni");
		JCheckBox cheese = new JCheckBox("Cheese");
		JCheckBox mushrooms = new JCheckBox("Mushrooms");
		JCheckBox jalepenos = new JCheckBox("Jalepenos");
		JCheckBox anchovies = new JCheckBox("Anchovies");
		JCheckBox pineapple = new JCheckBox("Pineapple");
		
		add(pep);
		add(cheese);
		add(mushrooms);
		add(jalepenos);
		add(anchovies);
		add(pineapple);
		
	}
	
}
