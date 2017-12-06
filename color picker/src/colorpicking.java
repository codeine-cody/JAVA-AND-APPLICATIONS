import java.awt.Color;
import java.awt.event.*;


import javax.swing.*;

public class colorpicking extends JFrame{


		private JPanel panel;
		
		int r;  
		int g;
		int b;

		public colorpicking(){
			
			setTitle("Color Picker");
			setLayout(null);
			setSize(200, 200);

			panel = new JPanel();
			panel.setSize(300, 300);
			panel.addMouseListener(new Listener());
			

			add(panel);

			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		}

		public class Listener implements MouseListener {
			public void mouseClicked(MouseEvent e) {
				
			}

			public void mouseEntered(MouseEvent e) {
				
				 r = e.getX();
				 g = e.getY();
				 b = (int) Math.sqrt((r*r) + (g*g));
				 panel.setBackground(new Color(r,g,b));
				 panel.repaint();
				 System.out.println("Mouse at the coordinates X:" + r+ "and Y:"+ g);
				
			}

			public void mouseExited(MouseEvent e) {
				
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}
		}

		public static void main(String args[]) {
			new colorpicking();
		}
}