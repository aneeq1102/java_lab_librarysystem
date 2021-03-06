package GUI;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.time.LocalDate;
import library.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class BorrowBook extends JFrame {
	private String title;
	private JPanel contentPane;
	private JTextField search;
	public BorrowBook() {
		setResizable(false);
		setTitle("Borrow Book");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 649, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblTitle = new JLabel("Search for book to borrow");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitle.setBounds(0, 69, 613, 59);
		contentPane.add(lblTitle);
		
		search = new JTextField();
		search.setBounds(215,200,200,30);
		contentPane.add(search);
		
		
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(260,270,120,30);
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				title = search.getText().toString();
				
				if(title.equals("Moby Dick") || title.equals("Philosophers stone") || title.equals("waffle iron")) {
					System.out.println(title);
					JOptionPane.showMessageDialog(getComponent(0), "Book Added To Shopping Cart");
					search.setText("");
					GUIForm.account.basket.add(new Book(title,"isbn"));
					System.out.println("adding"+title+"to basket");
				}
				else {
					System.out.println(title);
					JOptionPane.showMessageDialog(getComponent(0), "Book not found","Error",0);
					search.setText("");
				}
			}
		});
		
		contentPane.add(searchButton);
		
		JButton exit = new JButton("Exit");
		exit.setBounds(260,320,120,30);
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		contentPane.add(exit);
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
}
