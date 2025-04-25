import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class DrinksPanelInfo extends JPanel{
	private final String BASE = "DRINKS";
	private HashMap<String, Double> drinksPrices;
	private String selectedDrink = "";
	private int drinkNum = 0;
	private double totalPrice = 0.0;
	
	public DrinksPanelInfo() {
		drinksPrices = new HashMap<>();
		drinksPrices.put("Coke", 3.00);
		drinksPrices.put("Pepsi", 3.00);
		drinksPrices.put("Dr. Pepper", 3.00);
		drinksPrices.put("Sweet Tea", 2.00);
		drinksPrices.put("Lemonade", 2.50);
		
		
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
		
        DrinkListener listener = new DrinkListener();
        DrinkQuantityListener dQListener = new DrinkQuantityListener();
        coke.addActionListener(listener);
        pepsi.addActionListener(listener);
        drPepper.addActionListener(listener);
        sweetTea.addActionListener(listener);
        lemonade.addActionListener(listener);
        spinner.addChangeListener(dQListener);
		
		add(coke);
		add(pepsi);
		add(drPepper);
		add(sweetTea);
		add(lemonade);
		add(spinner);
	}
	
	public void setTotalPrice() {totalPrice = drinksPrices.get(selectedDrink) * getDrinkNum();}
	
	public double getTotalPrice() {return totalPrice;}
	
	public int getDrinkNum() {return drinkNum; }
	
	private class DrinkListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton selectedButton = (JRadioButton) e.getSource();
			String drinksText = selectedButton.getText();
			
			if (drinksPrices.containsKey(drinksText)) {
				selectedDrink = drinksText;
			}
		}
	}
	private class DrinkQuantityListener implements ChangeListener {
		@Override
		public void stateChanged(ChangeEvent e) {
			JSpinner selectedQuantity = (JSpinner) e.getSource();
			drinkNum = (Integer) selectedQuantity.getValue();
		}
	}
}
