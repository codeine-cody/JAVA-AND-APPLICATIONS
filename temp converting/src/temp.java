
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class temp extends JFrame{
	
	//Variables
	JButton converter;
	JLabel Clabel;
	JLabel Flabel;
	JTextField Celcius;
	JTextField Fahrenheit;
	JPanel panel;
	double celcius = 0;
	double Fahren = 0;
	double result = 0;
	
	public temp(){
		setTitle("Temperature Converter");
		setPreferredSize(new Dimension(500,100)); 
		panel = new JPanel(); 
		converter = new JButton("Convert"); 
		
		//Labels
		Clabel = new JLabel("Celcius:");
		Flabel = new JLabel ("fahrenheit:");
		
		//TextFields
		Celcius = new JTextField(celcius + "");
		Fahrenheit = new JTextField("0.0");
		
		Fahrenheit.setEnabled(false);
		
		converter.addActionListener(new Listener());
		
		//Add Components
		add(panel);
		
		panel.add(Clabel);
		panel.add(Celcius);
		panel.add(Flabel);
		panel.add(Fahrenheit);
		panel.add(converter);
		pack();
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public class Listener implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
			result = Double.parseDouble(Celcius.getText());
			Fahren =   9.0 / 5 * result + 32;
			Fahrenheit.setText(Fahren +"");
			System.out.println(e.getActionCommand());
			
		}
	}

	public static void main(String[] args){
		new temp();
		
	}

}