import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CalculateWindow extends JFrame implements ActionListener {
	Popup cw;
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		cw.show();
		
	}
	public static void main(String[] args) {
		CalculateWindow cw = new CalculateWindow();
	}

}
