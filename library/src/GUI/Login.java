package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Login extends JFrame {

	
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JPanel contentPane;
	private JLabel lblEnterLogin;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel newUser;
	private JButton btnLogin;

	/**
	 * Create the application.
	 */


	/**
	 * Initialize the contents of the frame.
	 */
	Login() {
		contentPane = new JPanel();
		setResizable(false);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Yelahanka Public Library System");
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel title = new JLabel("Yelahanka Public Library");
		title.setFont(new Font("Tahoma", Font.BOLD, 17));
		title.setBounds(110, 11, 300, 41);
		contentPane.add(title);
		
		contentPane.setBackground(new Color(196, 174, 120));
		
		lblEnterLogin = new JLabel("Enter login details");
		lblEnterLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterLogin.setBounds(165, 63, 150, 23);
		contentPane.add(lblEnterLogin);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsername.setBounds(55, 119, 64, 23);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(55, 159, 64, 23);
		contentPane.add(lblPassword);
		
		usernameField = new JTextField();
		usernameField.setBounds(130, 121, 86, 20);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		usernameField.setText("admin");
		
		passwordField = new JPasswordField();
		passwordField.setBounds(130, 161, 86, 20);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		newUser = new JLabel("Not a member? Click here to register");
		newUser.setFont(new Font("Tahoma", Font.PLAIN, 13));
		newUser.setBounds(110, 200, 250, 23);
		contentPane.add(newUser);
		
		newUser.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				GUIForm.newMemberRegistration.setVisible(true);
			}
		});
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String user,pass;
				usernameField.setText("admin");
				user="admin";
				//user=usernameField.getText();
				pass=passwordField.getText();
				if((user.equals("admin")&&(pass.equals("admin"))))
						{
							JOptionPane.showMessageDialog(getComponent(0), "Login Successfully");
							setVisible(false);
							
							GUIForm.menu.setVisible(true);
							
						}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Login Failed","Error",0);
				}
			}
		});
		btnLogin.setBounds(260, 138, 89, 23);
		contentPane.add(btnLogin);
		
		JLabel logoIcon = new JLabel();
		ImageIcon logoImg = new ImageIcon("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");
		logoIcon.setIcon(logoImg);
		logoIcon.setBounds(345,15,64,95);
		contentPane.add(logoIcon);
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
}