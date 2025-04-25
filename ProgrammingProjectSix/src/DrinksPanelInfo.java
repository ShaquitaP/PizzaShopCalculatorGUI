import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

public class DrinksPanelInfo extends JPanel{
	private final String BASE = "DRINKS";
	
	public DrinksPanelInfo() {
		TitledBorder drinksTitle = new TitledBorder(BASE);
		drinksTitle.setTitleJustification(TitledBorder.CENTER);
		setBorder(drinksTitle);
		setLayout(new GridLayout(6,1,0,0));
		
		JRadioButton coke = new JRadioButton("Coke");
		JRadioButton pepsi = new JRadioButton("Pepsi");
		JRadioButton drPepper = new JRadioButton("Dr. Pepper");
		JRadioButton sweetTea = new JRadioButton("Sweet Tea");
		JRadioButton lemonade = new JRadioButton("Lemonade");
		
		ButtonGroup drinksGroup = new ButtonGroup();
		drinksGroup.add(coke);
		drinksGroup.add(pepsi);
		drinksGroup.add(drPepper);
		drinksGroup.add(sweetTea);
		drinksGroup.add(lemonade);
		
		JSpinner spinner = new JSpinner(new SpinnerNumberModel(0,0,10,1));
		
		add(coke);
		add(pepsi);
		add(drPepper);
		add(sweetTea);
		add(lemonade);
		add(spinner);
	}
}
