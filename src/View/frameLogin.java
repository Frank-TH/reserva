package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Models.Paciente;
import Service.PacienteService;
import Service.PacienteServiceImp;

public class frameLogin extends JFrame implements ActionListener {

	JLabel lblUser, lblPass;
	JTextField txtUser, txtPass;
	JButton ingresar;

	JPanel panel;

	frameCita v2;

	PacienteService pser = new PacienteServiceImp();
	Paciente p;
	int intento = 0;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public frameLogin() {

		setSize(400, 200);
		setTitle("AUTENTICACION");
		setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		this.getContentPane().add(panel);

		panel.setLayout(null);

		initComponents();
	}

	public void initComponents() {

		lblUser = new JLabel("Username", SwingConstants.CENTER);
		lblUser.setBounds(30, 20, 100, 30);
		lblUser.setForeground(Color.white);
		lblUser.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(lblUser);

		txtUser = new JTextField();
		txtUser.setBounds(150, 25, 150, 20);
		txtUser.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(txtUser);

		lblPass = new JLabel("Password", SwingConstants.CENTER);
		lblPass.setBounds(30, 45, 100, 50);
		lblPass.setForeground(Color.white);
		lblPass.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(lblPass);

		txtPass = new JTextField();
		txtPass.setBounds(150, 55, 150, 20);
		txtPass.setFont(new Font("Arial", Font.PLAIN, 15));
		panel.add(txtPass);

		ingresar = new JButton("INICIAR SESSION");
		ingresar.setFont(new Font("Arial", Font.BOLD, 15));
		ingresar.setBounds(80, 100, 200, 20);
		ingresar.addActionListener(this);
		panel.add(ingresar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ingresar) {
			if (txtUser.getText().equals("") || txtUser.getText().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Campo Username Obligatorio");
			} else if (txtPass.getText().equals("") || txtPass.getText().length() <= 1) {
				JOptionPane.showMessageDialog(null, "Campo Password Obligatorio");
			} else {

				p = pser.validar(txtUser.getText(), txtPass.getText());
				if (p != null) {
					JOptionPane.showMessageDialog(null, "Bienvenido ".concat(p.getName()));
					v2 = new frameCita();
					v2.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Datos no registrado");
					intento ++;
					if (intento == 3) {
						dispose();
					}
					
				}
			}

		}

	}

}
