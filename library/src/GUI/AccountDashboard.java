package GUI;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class AccountDashboard extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AccountDashboard() {
		setResizable(false);
		setTitle("Account Dashboard");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 649, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblAcctDashboardTitle = new JLabel("Account Dashboard");
		lblAcctDashboardTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcctDashboardTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblAcctDashboardTitle.setBounds(0, 69, 613, 59);
		contentPane.add(lblAcctDashboardTitle);
		

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
		btnOnTheWay.setBounds(217,170, 194, 32);
		contentPane.add(btnOnTheWay);
		
		JButton btnOrderHistory = new JButton("Order History");
		btnOrderHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.history.isVisible())
				{
					GUIForm.history.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
		btnOrderHistory.setBounds(217, 213, 194, 33);
		contentPane.add(btnOrderHistory);
		
		JButton btnAccountSecurity = new JButton("Account Security");
		btnAccountSecurity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.security.isVisible())
				{
					GUIForm.security.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
				
			}
			
		});
		btnAccountSecurity.setBounds(217, 256, 194, 33);
		contentPane.add(btnAccountSecurity);
		
		JButton btnManageAddresses = new JButton("Manage Addresses");
		btnManageAddresses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(!GUIForm.addresses.isVisible())
				{
					GUIForm.addresses.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
		btnManageAddresses.setBounds(217, 300, 194, 32);
		contentPane.add(btnManageAddresses);
		
	
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
		
		JButton btnExit = new JButton("Return to home");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				dispose();
			}
		});
		btnExit.setBounds(217, 386, 194, 33);
		contentPane.add(btnExit);
		

		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	
		
	
	}
}
