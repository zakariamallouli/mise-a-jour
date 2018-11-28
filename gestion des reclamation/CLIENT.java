import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class CLIENT extends JFrame {

	private JPanel contentPane;
	private JTextField objet;
	private JTextField content;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CLIENT frame = new CLIENT();
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
	public CLIENT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 678);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(30, 57, 806, 561);
		panel.add(tabbedPane);
		
		JPanel Nrecla = new JPanel();
		Nrecla.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Nrecla.setBackground(Color.LIGHT_GRAY);
		JLabel lblNewLabel_1 = new JLabel("Nouveau reclamation");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(411, 28, 367, 44);
		Nrecla.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Type de reclamation :");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_2.setBounds(436, 102, 192, 24);
		Nrecla.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Object :");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_3.setBounds(438, 195, 65, 21);
		Nrecla.add(lblNewLabel_3);
		
		objet = new JTextField();
		objet.setBounds(449, 245, 301, 24);
		Nrecla.add(objet);
		objet.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Description :");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_4.setBounds(438, 303, 111, 23);
		Nrecla.add(lblNewLabel_4);
		
		content = new JTextField();
		content.setBounds(449, 344, 301, 100);
		Nrecla.add(content);
		content.setColumns(10);
		
		JButton btnNewButton = new JButton("Envoyer");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.setBounds(476, 467, 111, 40);
		Nrecla.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mat\u00E9riel", "Syst\u00E8me", "Service", "r\u00E9ception", ""}));
		comboBox.setBounds(448, 150, 302, 20);
		Nrecla.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Quitter");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Mon compte", null, panel_1, null);
		
		DefaultListModel<String> l1 = new DefaultListModel<>();
		 l1.addElement("Item1");  
         l1.addElement("Item2");  
         l1.addElement("Item3");  
         l1.addElement("Item4"); 
         for(int i=0;i<20;i++)  l1.addElement(i+"");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("Mais reclamtion", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 56, 209, 410);
		panel_3.add(scrollPane);
		JList<String> list = new JList<>(l1);
		scrollPane.setViewportView(list);
		
		textField = new JTextField();
		textField.setBounds(264, 136, 496, 330);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumReclamation = new JLabel("Num Reclamation :");
		lblNumReclamation.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNumReclamation.setBounds(10, 28, 125, 14);
		panel_3.add(lblNumReclamation);
		
		JLabel lblNewLabel = new JLabel("objet :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(264, 57, 81, 14);
		panel_3.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(313, 55, 188, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblReclamation = new JLabel("Reclamation :");
		lblReclamation.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblReclamation.setBounds(264, 111, 95, 14);
		panel_3.add(lblReclamation);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.setBounds(608, 467, 111, 40);
		
		Nrecla.add(btnNewButton_1);
		 
		
		tabbedPane.addTab("nouveau reclamation", null, Nrecla, null);
		Nrecla.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(0, 0, 388, 533);
		Nrecla.add(panel_2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(CLIENT.class.getResource("/images/image/images (3).jpg")));
		panel_2.add(lblNewLabel_5);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBackground(Color.LIGHT_GRAY);
		tabbedPane.addTab("afficher l'aide", null, panel_4, null);
		
		JLabel lblBienvenueChreClient = new JLabel("Bienvenue ch\u00E8re client noux somme la pour vous !!!");
		lblBienvenueChreClient.setForeground(Color.RED);
		lblBienvenueChreClient.setBackground(Color.WHITE);
		lblBienvenueChreClient.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		panel_4.add(lblBienvenueChreClient);
		
		
	}
}
