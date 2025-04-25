import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class ToppingsPanelInfo extends JPanel{
	private final String BASE = "TOPPINGS";
	private HashMap<String, Double> toppingsPrices;
	private double totalPrice = 0.0;
	private ArrayList<String> selectedToppings;
 
	
	public ToppingsPanelInfo() {
		toppingsPrices = new HashMap<>();
		toppingsPrices.put("Pepperoni", 1.00);
		toppingsPrices.put("Cheese", 1.00);
		toppingsPrices.put("Mushrooms", 0.50);
		toppingsPrices.put("Jalepenos", 0.50);
		toppingsPrices.put("Anchovies", 0.75);
		toppingsPrices.put("Pineapple", 0.75);
		
		selectedToppings = new ArrayList<>();
		
		TitledBorder toppingsTitle = new TitledBorder(BASE);
		toppingsTitle.setTitleJustification(TitledBorder.CENTER);		
		setBorder(toppingsTitle);
		setLayout(new GridLayout(6,1,0,0));
		
		JCheckBox pep = new JCheckBox("Pepperoni");
		JCheckBox cheese = new JCheckBox("Cheese");
		JCheckBox mushrooms = new JCheckBox("Mushrooms");
		JCheckBox jalepenos = new JCheckBox("Jalepenos");
		JCheckBox anchovies = new JCheckBox("Anchovies");
		JCheckBox pineapple = new JCheckBox("Pineapple");
		
		CheckBoxListener listener = new CheckBoxListener();
		pep.addActionListener(listener);
		cheese.addActionListener(listener);
		mushrooms.addActionListener(listener);
		jalepenos.addActionListener(listener);
		anchovies.addActionListener(listener);
		pineapple.addActionListener(listener);
		
		add(pep);
		add(cheese);
		add(mushrooms);
		add(jalepenos);
		add(anchovies);
		add(pineapple);
	}
	

	public void setTotalPrice( ) {
		for (String i : selectedToppings) {
			totalPrice += toppingsPrices.get(i);
		}
	}
	public double getTotalPrice() {return totalPrice;};

	private class CheckBoxListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JCheckBox ingredientsBox = (JCheckBox) e.getSource();
			String topping = ingredientsBox.getText();
			
			if (ingredientsBox.isSelected()) {
				if (!selectedToppings.contains(topping)) {
					selectedToppings.add(topping);
				}
				else {
					selectedToppings.remove(topping);
				}
			}
		}
	}
}
