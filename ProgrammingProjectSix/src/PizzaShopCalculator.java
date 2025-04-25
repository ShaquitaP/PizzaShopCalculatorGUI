import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

public class PizzaShopCalculator extends JFrame {
	private static final int WIDTH = 700;
	private static final int HEIGHT = 500;
	private static final long serialVersionUID = 1L;
	private ImageIcon logo;
	private WelcomeBannerBuild welcomePanel;
	private PizzaInfoPanel pizzaInfoPanel;
	private DiscountPanel discountPanel;
	private InputStream is;
	private Font font;
	private JPanel buttonPanel;
	
	PizzaShopCalculator() {
		super();
		setSize(WIDTH, HEIGHT);
		setTitle("Pizza Sop Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,0,0,2));
		logo = new ImageIcon(".//res//pizza.png");
		setIconImage(logo.getImage());
		
		welcomePanel = new WelcomeBannerBuild();
		add(welcomePanel);
		
		pizzaInfoPanel = new PizzaInfoPanel();
		add(pizzaInfoPanel);
		
		discountPanel = new DiscountPanel();
		add(discountPanel);
		
		buildButtonPanel();
		add(buttonPanel);
		
	}

	
	public void buildButtonPanel() {
		JButton calculateButton = new JButton("CALCULATE");
		JButton exitButton = new JButton("EXIT");
		buttonPanel = new JPanel();
		
		buttonPanel.add(calculateButton);
		buttonPanel.add(exitButton);
	}
	
	public static void main(String[] args) throws FontFormatException, IOException {
		PizzaShopCalculator ps = new PizzaShopCalculator();
		ps.setVisible(true);
	}
}
