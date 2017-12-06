import java.awt.*;

import javax.swing.*;

public class figure extends JPanel {
		
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.drawOval(20, 90, 100, 60);
		
		g.setColor(Color.BLUE);
		g.drawRect(145, 10, 100, 60);

		g.setColor(Color.BLUE);
		g.fillRect(145, 90, 100, 60);

		g.setColor(Color.RED);
		g.drawRoundRect(265, 10, 100, 60, 50, 50);

		g.setColor(Color.RED);
		g.fillRoundRect(265, 90, 100, 60, 50, 50);
		
		g.setColor(Color.BLACK);
		g.drawLine(60, 10, 75, 75);
		g.drawLine(75, 10, 60, 75);
	}
	
	public static void main(String[] args){
		JFrame j = new JFrame("FigurePanel");
		j.add(new figure());
		j.setSize(400, 250);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}

}