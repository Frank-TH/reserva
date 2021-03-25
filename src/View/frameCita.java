package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class frameCita extends JFrame implements ActionListener {

	
	frameLogin v1;
	
	
	JLabel user;
	JPanel panel;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public frameCita () {
		
		
	setSize(500,500);
	setTitle("Reserva Cita");
	setLocationRelativeTo(null);
	
	
	panel = new JPanel();
	panel.setBackground(Color.BLACK);
	this.getContentPane().add(panel);
	
	panel.setLayout(null);
		
	initComponents();	
		
	
	}
	
	public void initComponents() {
		
		
		user = new JLabel("Bienvenido ", SwingConstants.LEFT);
		user.setBounds(10, 10, 80, 20);
		user.setForeground(Color.white);
		panel.add(user);
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
