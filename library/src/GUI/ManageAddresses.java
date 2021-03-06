package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class ManageAddresses extends JFrame {
	JPanel contentPane;
	JScrollPane scrollPane;
	JScrollPane scrollPane_2;
	ManageAddresses(){
		setResizable(false);
		setTitle("Library System");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(116, 158, 178));
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblBankingSystem = new JLabel("Manage Addresses");
		lblBankingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBankingSystem.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblBankingSystem.setBounds(20, 30, 613, 59);
		contentPane.add(lblBankingSystem);
		
		JLabel currAddr = new JLabel("Current Addresse");
		currAddr.setFont(new Font("Tahoma",Font.BOLD,15));
		currAddr.setBounds(120,105,150,40);
		contentPane.add(currAddr);
		
		JLabel savedAddresses = new JLabel("Saved Addresses");
		savedAddresses.setFont(new Font("Tahoma",Font.BOLD,15));
		savedAddresses.setBounds(440,105,150,40);
		contentPane.add(savedAddresses);
		
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(30, 140, 300, 358);
		contentPane.add(scrollPane);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(360, 140, 300, 358);
		contentPane.add(scrollPane_2);
		
		JButton replaceAddr = new JButton("Replace current addresse");
		replaceAddr.setBounds(55,550,185,30);
		contentPane.add(replaceAddr);
		
		replaceAddr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				GUIForm.replace.setVisible(true);
			}
		});
		
		JButton addAddr = new JButton("Add addresse");
		addAddr.setBounds(455,550,185,30);
		contentPane.add(addAddr);
		
		addAddr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				GUIForm.addAddresse.setVisible(true);
			}
		});
		
	
		JButton delSaved = new JButton("Delete saved Addresse");
		delSaved.setBounds(150,600,180,30);
		contentPane.add(delSaved);
		
		delSaved.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				GUIForm.deleteAddr.setVisible(true);
			}
		});
		
		JButton exit = new JButton("Exit");
		exit.setBounds(350,600,180,30);
		contentPane.add(exit);
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
}
