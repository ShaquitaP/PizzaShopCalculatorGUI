import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DiscountPanel extends JPanel{
	public DiscountPanel() {
		JLabel discountWarning = new JLabel("Must Show ID at Pickup");

		JRadioButton senior = new JRadioButton("65+");
		JRadioButton hero = new JRadioButton("Military & First Responder");
		JRadioButton student = new JRadioButton("Student");
		
		senior.setPreferredSize(new Dimension(70,100));
		ButtonGroup discountsGroup = new ButtonGroup();
		discountsGroup.add(senior);
		discountsGroup.add(hero);
		discountsGroup.add(student);
		
		add(discountWarning);
		add(senior);
		add(hero);
		add(student);
	}
}
