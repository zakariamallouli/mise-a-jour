import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Home {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(-13, 0, 452, 659);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Home.class.getResource("/images/Capture_d_e_cran_2015-11-30_a_17_23_48.png")));
		label.setBounds(-134, -55, 735, 399);
		panel.add(label);
		
		JLabel lblNewLabel_6 = new JLabel("INSCRIPTION");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.ITALIC, 40));
		lblNewLabel_6.setBounds(124, 374, 245, 83);
		panel.add(lblNewLabel_6);
		
		Button button = new Button("SignUp");
		button.setFont(new Font("Dialog", Font.BOLD, 12));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.RED);
		button.setBounds(488, 458, 223, 33);
		frame.getContentPane().add(button);
		
		textField = new JTextField();
		textField.setBounds(488, 38, 220, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(488, 24, 100, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("EMAIL :\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(488, 243, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(488, 82, 223, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(488, 69, 100, 14);
		frame.getContentPane().add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(488, 126, 223, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblRepeatpassword = new JLabel("Repeat Password :");
		lblRepeatpassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRepeatpassword.setBounds(488, 113, 111, 14);
		frame.getContentPane().add(lblRepeatpassword);
		
		JLabel lblTel = new JLabel("TEL :");
		lblTel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTel.setBounds(488, 287, 46, 14);
		frame.getContentPane().add(lblTel);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(488, 169, 223, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(488, 212, 223, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblAdresse = new JLabel("CIN :");
		lblAdresse.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdresse.setBounds(488, 375, 100, 14);
		frame.getContentPane().add(lblAdresse);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(488, 256, 223, 20);
		frame.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_2 = new JLabel("Nom :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(488, 157, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pr\u00E9nom :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(488, 200, 66, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(488, 301, 223, 20);
		frame.getContentPane().add(textField_6);
		
		JLabel lblNewLabel_4 = new JLabel("Date Naissance :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(488, 332, 100, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(488, 344, 223, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(488, 388, 223, 20);
		frame.getContentPane().add(textField_8);
		
		JLabel lblNewLabel_5 = new JLabel("Adresse :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(488, 419, 66, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(488, 432, 223, 20);
		frame.getContentPane().add(textField_9);
		
		Button button_1 = new Button("Quitter");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Dialog", Font.BOLD, 12));
		button_1.setBackground(Color.RED);
		button_1.setBounds(488, 497, 223, 33);
		frame.getContentPane().add(button_1);
		frame.setBounds(100, 100, 782, 577);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
