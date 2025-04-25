import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DiscountPanel extends JPanel{
	private boolean isDiscounted = false;
	private Font font;
	private InputStream is;
	
	public DiscountPanel() {
		setLayout(new GridLayout(2,1));
		
		JPanel firstPanel = new JPanel();
		firstPanel.setLayout(new GridLayout(2,1));
		//***********************CREATES LABEL FONT***************************//
		JLabel discountLabel = new JLabel("DISCOUNTS", JLabel.CENTER);
		try {
			is = new FileInputStream(".//res//DynaPuff-SemiBold.ttf");
			font = Font.createFont(Font.TRUETYPE_FONT, is);
			discountLabel.setFont(font.deriveFont(Font.BOLD, 20f));
		} catch (IOException | FontFormatException e) {
			discountLabel.setFont(new Font("Arial", Font.BOLD, 48));
			e.printStackTrace();
		}
		JLabel discountWarning = new JLabel("Must Show ID at Pickup", JLabel.CENTER);
		//*******************************************************************//

		firstPanel.add(discountLabel);
		firstPanel.add(discountWarning);

		JPanel secondPanel = new JPanel();
		JRadioButton senior = new JRadioButton("65+");
		JRadioButton hero = new JRadioButton("Military & First Responder");
		JRadioButton student = new JRadioButton("Student");
		
		ButtonGroup discountsGroup = new ButtonGroup();
		discountsGroup.add(senior);
		discountsGroup.add(hero);
		discountsGroup.add(student);
		secondPanel.add(senior);
		secondPanel.add(hero);
		secondPanel.add(student);
		
		DiscountListener listener = new DiscountListener();
		senior.addActionListener(listener);
		hero.addActionListener(listener);
		student.addActionListener(listener);
		
		add(firstPanel);
		add(secondPanel);

	}
	
	public boolean getIsDiscounted() {return isDiscounted;}
	
	private class DiscountListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			isDiscounted = true;
		}
	}
}
