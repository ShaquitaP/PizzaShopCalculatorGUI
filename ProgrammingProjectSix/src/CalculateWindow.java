import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridLayout;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculateWindow extends JDialog {
	private JPanel bannerPanel;
	private JPanel infoPanel;
	private JPanel buttonPanel;
	private Font font;
	private InputStream is;
	
	public CalculateWindow(JFrame parent) {
		super(parent);
		setLayout(new GridLayout(3,1));
		
		buildBannerPanel();
		add(bannerPanel);
		
	}
	
	public void buildBannerPanel() {
		JLabel bannerLabel = new JLabel("TOTAL");
		try {
			is = new FileInputStream(".//res//DynaPuff-SemiBold.ttf");
			font = Font.createFont(Font.TRUETYPE_FONT, is);
			bannerLabel.setFont(font.deriveFont(Font.BOLD, 20f));
		} catch (IOException | FontFormatException e) {
			bannerLabel.setFont(new Font("Arial", Font.BOLD, 48));
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		CalculateWindow cw = new CalculateWindow();
	}

}
