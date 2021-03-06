package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ReplaceCurrentAddresse extends JFrame{
	
	Integer[] options = {1,2,3,4,5,6,7,8,9,10};
	JPanel contentPane;
	ReplaceCurrentAddresse(){
		contentPane = new JPanel();
		setContentPane(contentPane);
		setResizable(false);
		setBounds(100, 100, 550, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Replace Current Addresse");
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(196, 174, 120));
		JLabel label = new JLabel("Replace current addresse With Saved Addresse");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(70, 11, 400, 41);
		contentPane.add(label);
		
		JLabel lblLoginScreen = new JLabel("Enter id of saved addresse you would like to use");
		lblLoginScreen.setFont(new Font("Tahoma", Font.PLAIN,15));
		lblLoginScreen.setBounds(110, 80, 330, 23);
		contentPane.add(lblLoginScreen);
		
		JLabel lblUsername = new JLabel("Addresse-id");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(170, 155, 90, 23);
		contentPane.add(lblUsername);
		
		JComboBox<Integer> comboBox = new JComboBox<>(options);
		comboBox.setBounds(305,155,50,23);
		contentPane.add(comboBox);
		
		JButton submit = new JButton("Submit");
		submit.setBounds(155,220,100,20);
		contentPane.add(submit);
		
		JButton doReturn = new JButton("Return");
		doReturn.setBounds(280,220,100,20);
		contentPane.add(doReturn);
		
		doReturn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(getComponent(0), "Current addresse has been changed");
				dispose();
			}
		});
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
}
