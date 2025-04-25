import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class BasePanelInfo extends JPanel {
	private double totalPrice = 0.0;
	private HashMap<String, Double> basePrices;
	private String selectedCrust = "";
 	
	public BasePanelInfo() {
		basePrices = new HashMap<>();
		basePrices.put("Thin Crust", 8.00);
		basePrices.put("Regular Crust", 10.00);
		basePrices.put("Thick Crust", 12.00);
		
		final String BASE = "BASE";
		TitledBorder baseTitle = new TitledBorder(BASE);
		baseTitle.setTitleJustification(TitledBorder.CENTER);
		setBorder(baseTitle);
		setLayout(new GridLayout(3,1,0,1));
		
		JRadioButton thinCrust = new JRadioButton("Thin Crust");
		JRadioButton thickCrust = new JRadioButton("Thick Crust");
		JRadioButton regCrust = new JRadioButton("Regular Crust");
		
		ButtonGroup crustGroup = new ButtonGroup();
        crustGroup.add(thinCrust);
        crustGroup.add(thickCrust);
        crustGroup.add(regCrust);
        
        CrustListener listener = new CrustListener();
        thinCrust.addActionListener(listener);
        thickCrust.addActionListener(listener);
        regCrust.addActionListener(listener);
        
        add(thinCrust);
		add(thickCrust);
		add(regCrust);
		
	}
	
	public void setTotalPrice() {totalPrice = basePrices.get(selectedCrust);}
	
	public double getTotalPrice() {return totalPrice;}
	
	private class CrustListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JRadioButton selectedButton = (JRadioButton) e.getSource();
			String crustText = selectedButton.getText();
			
	        if (basePrices.containsKey(crustText)) {
	        	selectedCrust = crustText;
	        }
		}
	}

	
}
