package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MemberRegistration extends JFrame{

	
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JPasswordField reenteredPasswordField;
	private JTextField emailField;
	private JTextField stateField;
	private JTextField cityField;
	private JTextField districtField;
	private JTextField landmarkField;
	private JTextField phNumField;
	private JTextField altPhNumField;
	
	
	private JButton submit;
	private JCheckBox isRoboCheckbox;
	private JCheckBox notifsCheckbox;
	
	private JLabel usernameLabel;
	private JLabel passwordLabel;
	private JLabel reenteredPasswordLabel;
	private JLabel emailLabel;
	private JLabel stateLabel;
	private JLabel cityLabel;
	private JLabel districtLabel;
	private JLabel landmarkLabel;
	private JLabel phNoLabel;
	private JLabel altPhNumLabel;
	
	private String username;
	private String password;
	private String reenteredpass;
	private String email;
	private String state;
	private String city;
	private String district;
	private String landmark;
	private String phno;
	private String altphno;
	private Boolean recieveNews;
	private Boolean isRobot;
	private JButton returntologin;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
//	 */
//	public static void main(String[] args) 
//	{
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login window = new Login();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */


	/**
	 * Initialize the contents of the frame.
	 */
	MemberRegistration() {
		contentPane = new JPanel();
		
		int width = 150,height = 25, x_pos_tb=330,y_pos_tb=171,offset = 42;
		int widthtf = 100,heighttf=25,x_pos_tf=185,y_pos_tf=169;
		contentPane.setBackground(new Color(196, 174, 120));
		contentPane.setForeground(new Color(196, 174, 120));
		setResizable(false);
		setBounds(50,0, 700, 850);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("New Member Registration");
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("Yelahanka Public Library New Account Registration");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(80, 20,550, 41);
		contentPane.add(label);
		
		JLabel lblLoginScreen = new JLabel("Enter Account Details");
		lblLoginScreen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLoginScreen.setBounds(250,80, 200, 23);
		contentPane.add(lblLoginScreen);
		
		usernameField = new JTextField();
		usernameField.setBounds(x_pos_tb, y_pos_tb, width, height);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		usernameField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(x_pos_tb, y_pos_tb+offset, width, height);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		passwordField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		reenteredPasswordField = new JPasswordField();
		reenteredPasswordField.setBounds(x_pos_tb, y_pos_tb+2*offset, width, height);
		contentPane.add(reenteredPasswordField);
		reenteredPasswordField.setColumns(10);
		reenteredPasswordField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		emailField = new JTextField();
		emailField.setBounds(x_pos_tb, y_pos_tb+3*offset, width, height);
		contentPane.add(emailField);
		emailField.setColumns(10);
		emailField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		stateField = new JTextField();
		stateField.setBounds(x_pos_tb, y_pos_tb+4*offset, width, height);
		contentPane.add(stateField);
		stateField.setColumns(10);
		stateField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		cityField = new JTextField();
		cityField.setBounds(x_pos_tb, y_pos_tb+5*offset, width, height);
		contentPane.add(cityField);
		cityField.setColumns(10);
		cityField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		districtField = new JTextField();
		districtField.setBounds(x_pos_tb, y_pos_tb+6*offset, width, height);
		contentPane.add(districtField);
		districtField.setColumns(10);
		districtField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		landmarkField = new JTextField();
		landmarkField.setBounds(x_pos_tb, y_pos_tb+7*offset, width, height);
		contentPane.add(landmarkField);
		landmarkField.setColumns(10);
		landmarkField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		phNumField = new JTextField();
		phNumField.setBounds(x_pos_tb, y_pos_tb+8*offset, width, height);
		contentPane.add(phNumField);
		phNumField.setColumns(10);
		phNumField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		altPhNumField = new JTextField();
		altPhNumField.setBounds(x_pos_tb, y_pos_tb+9*offset, width, height);
		contentPane.add(altPhNumField);
		altPhNumField.setColumns(10);
		altPhNumField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		
		usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usernameLabel.setBounds(x_pos_tf, y_pos_tf, widthtf, heighttf);
		contentPane.add(usernameLabel);
		
		passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordLabel.setBounds(x_pos_tf, y_pos_tf+offset, widthtf, heighttf);
		contentPane.add(passwordLabel);
	
		reenteredPasswordLabel = new JLabel("Reenter Password:");
		reenteredPasswordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		reenteredPasswordLabel.setBounds(x_pos_tf, y_pos_tf+offset*2, widthtf+20, heighttf);
		contentPane.add(reenteredPasswordLabel);
		
		emailLabel = new JLabel("email:");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		emailLabel.setBounds(x_pos_tf, y_pos_tf+offset*3, widthtf, heighttf);
		contentPane.add(emailLabel);
		
		stateLabel = new JLabel("State:");
		stateLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		stateLabel.setBounds(x_pos_tf, y_pos_tf+offset*4, widthtf, heighttf);
		contentPane.add(stateLabel);
		
		cityLabel = new JLabel("City:");
		cityLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cityLabel.setBounds(x_pos_tf, y_pos_tf+offset*5, widthtf, heighttf);
		contentPane.add(cityLabel);
		
		districtLabel = new JLabel("District:");
		districtLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		districtLabel.setBounds(x_pos_tf, y_pos_tf+offset*6, widthtf, heighttf);
		contentPane.add(districtLabel);
		
		landmarkLabel = new JLabel("Landmark:");
		landmarkLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		landmarkLabel.setBounds(x_pos_tf, y_pos_tf+offset*7, widthtf, heighttf);
		contentPane.add(landmarkLabel);

		phNoLabel = new JLabel("Phone Number:");
		phNoLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phNoLabel.setBounds(x_pos_tf, y_pos_tf+offset*8, widthtf, heighttf);
		contentPane.add(phNoLabel);
		
		altPhNumLabel = new JLabel("alternate ph:");
		altPhNumLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		altPhNumLabel.setBounds(x_pos_tf, y_pos_tf+offset*9, widthtf, heighttf);
		contentPane.add(altPhNumLabel);
		
		notifsCheckbox = new JCheckBox("Subscribe to news and email offers");
		notifsCheckbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		notifsCheckbox.setBounds(200,y_pos_tb+offset*10,300,50);
		notifsCheckbox.setBackground(new Color(196, 174, 120));
		contentPane.add(notifsCheckbox);
		
		isRoboCheckbox = new JCheckBox("I am not a robot");
		isRoboCheckbox.setBackground(new Color(196, 174, 120));
		isRoboCheckbox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		isRoboCheckbox.setBounds(200,y_pos_tb+offset*11,300,50);
		contentPane.add(isRoboCheckbox);
		
		submit = new JButton("Submit");
		submit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		submit.setBounds(260,y_pos_tb+offset*13-10,width,height);
	
		contentPane.add(submit);
		
		returntologin = new JButton("Return to login");
		returntologin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		returntologin.setBounds(260,y_pos_tb+offset*14-10,width,height);
		contentPane.add(returntologin);
		
		returntologin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username = usernameField.getText();
				password = passwordField.getText();
				reenteredpass = reenteredPasswordField.getText();
				email = emailField.getText();
				state = stateField.getText();
				city = cityField.getText();
				district = districtField.getText();
				landmark = landmarkField.getText();
				phno = phNumField.getText();
				altphno = altPhNumField.getText();
				System.out.println(password);
				System.out.println(reenteredpass);
				//
				if(username.isEmpty()||password.isEmpty()||reenteredpass.isEmpty()||email.isEmpty()||state.isEmpty()||city.isEmpty()||district.isEmpty()||landmark.isEmpty()||phno.isEmpty()||altphno.isEmpty()) {
					JOptionPane.showMessageDialog(null,"One or more fields are empty","Fields Incomplete", JOptionPane.ERROR_MESSAGE);					
				}
				else if(!password.equals(reenteredpass)) {
					JOptionPane.showMessageDialog(null,"password and reentered password do not match,please try again","Password reentered incorrectly", JOptionPane.ERROR_MESSAGE);
				}
				else if(!isRoboCheckbox.isSelected()) {
					JOptionPane.showMessageDialog(null,"Robot detected","Captcha failed", JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"Account Succesfully Created","Congratulations", JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
			}
		});
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
	
}