import java.awt.GridLayout;

import javax.swing.JPanel;

public class PizzaInfoPanel extends JPanel{
	
	public PizzaInfoPanel() {
		setLayout(new GridLayout(1,3,5,0));
		
		BasePanelInfo basePanel = new BasePanelInfo();
		add(basePanel);
		
		ToppingsPanelInfo toppingsPanel = new ToppingsPanelInfo();
		add(toppingsPanel);
		
		DrinksPanelInfo drinksPanel = new DrinksPanelInfo();
		add(drinksPanel);
	}
}
