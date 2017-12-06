import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FontCOm extends JFrame {
	
	private JPanel bottom;
	private JCheckBox bold; 
	private JPanel top;
	private JTextField inputedText;
	private JCheckBox redCheckBox;
	private JRadioButton Verdana; 
	private JRadioButton Arial;  
	private JRadioButton Times;   
	private final int WINDOW_WIDTH = 500; 
	private final int WINDOW_HEIGHT = 200; 
	
	

	 Font a = new Font("Arial", Font.BOLD, 20);
	 Font b = new Font ("Arial", Font.PLAIN,12);
	 Font c = new Font ("Times New Roman", Font.PLAIN,12);
	 Font d = new Font ("Verdana", Font.PLAIN,12);

	public FontCOm() {

		setTitle("Font Customizer");

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		setLayout(new GridLayout(3,1));
		
		top = new JPanel();
		
		bottom = new JPanel();
		bottom.setLayout(new GridLayout(2,3,5,10));
		
		inputedText = new JTextField();
		inputedText.setPreferredSize(new Dimension(300, 30));
		inputedText.setLocation(50, 50);
		
		Arial = new JRadioButton("Arial");
		Times = new JRadioButton("Times");
		Verdana = new JRadioButton("Verdana");
		
		bold = new JCheckBox("bold");
		redCheckBox = new JCheckBox("red");
		
		Arial.addActionListener(new RadioButtonListener());
	    Times.addActionListener(new RadioButtonListener());
	    Verdana.addActionListener(new RadioButtonListener());
	    
	    bold.addItemListener(new Listener());
	    redCheckBox.addItemListener(new Listener());
		
		add(top);
		top.add(inputedText);
		add(bottom);
		bottom.add(Arial);
		bottom.add(Times);
		bottom.add(Verdana);
		bottom.add(bold);
		bottom.add(redCheckBox);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	 private class RadioButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      { 
	         if (e.getSource() == Arial)
	         {
	            inputedText.setFont(b);   
	         }
	         else if (e.getSource() == Times)
	         {
	            inputedText.setFont(c); 
	         }
	         else if (e.getSource() == Verdana)
	         {
	            inputedText.setFont(d);
	            
	         }

	      }
	   }
	      
	      private class Listener implements ItemListener {
	  		public void itemStateChanged(ItemEvent e) {  			
	  			if (e.getSource() == bold) {
	  				if (bold.isSelected()) {
	  					inputedText.setFont(a);
	  				} else {
	  					inputedText.setFont(b);
	  				}
	  			} else if (e.getSource() == redCheckBox) {
	  				if (redCheckBox.isSelected()) {
	  					inputedText.setForeground(Color.RED);
	  				} else {
	  					inputedText.setForeground(Color.BLACK);
	  				}
	  			}
	  		}
	  	}

	   
public static void main(String[] args){
	new FontCOm();
}

}