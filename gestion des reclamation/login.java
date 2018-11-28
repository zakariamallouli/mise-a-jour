import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(280, 100, 848, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel close = new JLabel("X");
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("<HTML>HI<br> WELCOME</HTML>");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(87, 200, 95, 88);
		contentPane.add(lblNewLabel_1);
		close.setForeground(Color.WHITE);
		close.setFont(new Font("Tahoma", Font.BOLD, 15));
		close.setHorizontalAlignment(SwingConstants.CENTER);
		close.setBounds(0, 0, 46, 14);
		contentPane.add(close);
		
		JLabel circle = new JLabel("");
		circle.setIcon(new ImageIcon(login.class.getResource("/img/circular-shape-silhouette.png")));
		circle.setBounds(72, 101, 231, 285);
		contentPane.add(circle);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setAutoscrolls(true);
		lblNewLabel.setBounds(0, 0, 373, 468);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(455, 101, 329, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(455, 171, 329, 29);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(455, 242, 329, 29);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(455, 313, 329, 29);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(455, 73, 164, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(455, 144, 164, 29);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(455, 214, 164, 29);
		contentPane.add(lblPhone);
		
		JLabel lblHowFoundIt = new JLabel("How found it ?");
		lblHowFoundIt.setBounds(455, 287, 164, 29);
		contentPane.add(lblHowFoundIt);
		
		setUndecorated(true);
	}

}
