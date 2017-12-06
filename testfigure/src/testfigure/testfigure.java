package testfigure;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class testfigure extends JFrame{
	

	JPanel Leftside;
	JPanel Rightside;
	JPanel Center1;
	JPanel Center2;
	JPanel Center3;
	JPanel Center4;
	JPanel Center5;
	JPanel Center6;
	JPanel Center7;
	JPanel Center8;
	JPanel Center9;
	JPanel Center10;
	JPanel Center11;
	JPanel Center12;
	

	JLabel x;
	JLabel y;
	JLabel w;
	JLabel h;
	JLabel Filled;
	

	JTextField x_text;
	JTextField y_text;
	JTextField h_text;
	JTextField w_text;
	

	JButton drawOval;
	JButton drawRectangle;
	

	JCheckBox a;
	

	int x1 = 0;
    int y1 = 0;
    int w1 = 0;
    int h1 = 0;
    int Shape = 0;
    int Fill = 0;
	
public testfigure(){
		setTitle("Draw");
		setLayout(new GridLayout(1,2));
		setSize(600,400);
		 
		Rightside = new Rightborderside();
		Leftside =  new Leftborderside();
		
		add(Leftside);
		add(Rightside);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	
private class Leftborderside extends JPanel{
	
	public Leftborderside(){
		
		setLayout(new GridLayout(6,2));
		
		 x = new JLabel("x");
		 y = new JLabel("y");
		 w = new JLabel("w");
		 h = new JLabel("h");
		 Filled = new JLabel("Filled");
		
		Center1 = new JPanel();
		Center2 = new JPanel();
		Center3 = new JPanel();
		Center4 = new JPanel();
		Center5 = new JPanel();
		Center6 = new JPanel();
		Center7 = new JPanel();
		Center8 = new JPanel();
		Center9 = new JPanel();
		Center10 = new JPanel();
		Center11 = new JPanel();
		Center12 = new JPanel();
				
		drawOval = new JButton("Draw Oval");
		drawRectangle = new JButton("Draw Rectangle");
				
		a = new JCheckBox();
				
	    x_text = new JTextField("");
		x_text.setPreferredSize(new Dimension(40,20));
				
		y_text = new JTextField("");
		y_text.setPreferredSize(new Dimension(40,20));
			
		h_text = new JTextField("");
		h_text.setPreferredSize(new Dimension(40,20));
				
		w_text = new JTextField("");
		w_text.setPreferredSize(new Dimension(40,20));
				
		drawOval.addActionListener(new Listener());
		drawRectangle.addActionListener(new Listener());
		
		a.addItemListener(new CheckListener());
		
		add(Center1);
		Center1.add(x);
		
		add(Center2);
		Center2.add(x_text);
		
		add(Center3);
		Center3.add(y);
		
		add(Center4);
		Center4.add(y_text);
		
		add(Center5);
		Center5.add(w);
		
		add(Center6);
		Center6.add(w_text);
		
		add(Center7);
		Center7.add(h);
		
		add(Center8);
		Center8.add(h_text);
		
		add(Center9);
		Center9.add(Filled);
		
		add(Center10);
		Center10.add(a);
		
		add(Center11);
		Center11.add(drawOval);
		
		add(Center12);
		Center12.add(drawRectangle);
		
		
		
	}
	
	 private class Listener implements ActionListener {
			
			public void actionPerformed(ActionEvent e) {
				
		        
		        x1 = Integer.parseInt(x_text.getText());
		        y1 = Integer.parseInt(y_text.getText());
		        w1 = Integer.parseInt(w_text.getText());
		        h1 = Integer.parseInt(h_text.getText());

				if (e.getSource() == drawOval) {
					Shape = 1;
					Rightside.repaint();
					
					
				} else if (e.getSource() == drawRectangle) {
					Shape = 2;
					Rightside.repaint();
				
				
			}
		 }
	  }
	 
	 private class CheckListener implements ItemListener {
	  		
		 public void itemStateChanged(ItemEvent e) {
			 if (e.getSource() == a) {
	  				
	  				if (a.isSelected()) {
	  					Fill = 1; 
	  					repaint();
	  				} else {
	  					Fill = 2;
	  					repaint();
	  				}
			 
		 }
	
	  }
   }
}
	

 

 private class Rightborderside extends JPanel{
	 
	 public Rightborderside(){
		 setBackground(Color.WHITE);
		 Border newBorder = BorderFactory.createLineBorder(Color.RED, 2);
		 setBorder(newBorder);
		 
	 }
 	 
	 public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if(Shape == 1){
			g.drawOval(x1, y1, w1, h1);
			
		}
		
		if(Shape == 2){
			g.drawRect(x1, y1, w1, h1);
			
		}
		
		if(Shape == 1 && Fill == 1){
			g.fillOval(x1, y1, w1, h1);
			
		}
		
		if(Shape == 2 && Fill == 1){
			
			g.fillRect(x1, y1, w1, h1);
			
		}
		
		
	}
 }
	
 public static void main(String[] args){
	 new testfigure();
 }

}