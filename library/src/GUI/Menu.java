package GUI;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;



public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 649, 600);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblLibraryTitle = new JLabel("Yelahanka public library");
		lblLibraryTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblLibraryTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblLibraryTitle.setBounds(0, 69, 613, 59);
		contentPane.add(lblLibraryTitle);
		
		
		JButton btnBorrowBook = new JButton("Borrow Book");
		btnBorrowBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!GUIForm.borrowBook.isVisible())
			{
				GUIForm.borrowBook.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
			}
				
				
			}
			
		});
		btnBorrowBook.setBounds(217,170, 194, 32);
		contentPane.add(btnBorrowBook);
		
		JButton btnViewShoppingCart = new JButton("Shopping Basket");
		btnViewShoppingCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.cart.isVisible())
				{
					GUIForm.cart.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
		btnViewShoppingCart.setBounds(217, 213, 194, 33);
		contentPane.add(btnViewShoppingCart);
		
		JButton btnAcctDashboard = new JButton("Account Dashboard");
		btnAcctDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.acctDash.isVisible())
				{
					GUIForm.acctDash.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
				
			}
			
		});
		btnAcctDashboard.setBounds(217, 256, 194, 33);
		contentPane.add(btnAcctDashboard);
		
		JButton btnOnTheWay = new JButton("On the way");
		btnOnTheWay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(!GUIForm.ordersList.isVisible())
				{
					GUIForm.ordersList.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
		btnOnTheWay.setBounds(217, 300, 194, 32);
		contentPane.add(btnOnTheWay);
		
	
		//
		JButton btnMembershipRenewal = new JButton("Renew membership");
		btnMembershipRenewal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!GUIForm.membershipRenewal.isVisible())
			{
				GUIForm.membershipRenewal.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
			}
				
				
			}
		
		
		
		});
		
		//
		btnMembershipRenewal.setBounds(217, 343, 194, 36);
		contentPane.add(btnMembershipRenewal);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(getComponent(0), "Thanks For Using") ;

				System.exit(0);
			}
		});
		btnExit.setBounds(217, 386, 194, 33);
		contentPane.add(btnExit);
		

		
		JLabel lblNewLabel = new JLabel("Online portal");
		lblNewLabel.setFont(new Font("Tahoma",Font.ITALIC,14));
	
		lblNewLabel.setBounds(397, 19, 216, 213);
		contentPane.add(lblNewLabel);
		
		
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
}
