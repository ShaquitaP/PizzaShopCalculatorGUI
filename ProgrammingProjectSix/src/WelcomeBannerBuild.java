import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeBannerBuild extends JPanel{

	private JLabel welcomeLabel;
	private InputStream is;
	private Font font;
	
	public WelcomeBannerBuild() {
		setLayout(new BorderLayout());
		
		welcomeLabel = new JLabel("PIZZA SHOP");
		welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
		add(welcomeLabel, BorderLayout.NORTH);
		
		try {
			is = new FileInputStream(".//res//DynaPuff-SemiBold.ttf");
			font = Font.createFont(Font.TRUETYPE_FONT, is);
			welcomeLabel.setFont(font.deriveFont(Font.BOLD, 48f));
		} catch (IOException | FontFormatException e) {
			// TODO Auto-generated catch block
			welcomeLabel.setFont(new Font("Arial", Font.BOLD, 48));
			e.printStackTrace();
		}

	}
}
