package GUI;

import java.awt.Point;
import java.time.LocalDate;

import library.Addresse;
import library.LibraryAccount;

public class GUIForm {
	public static Login login = new Login();
	public static MemberRegistration newMemberRegistration = new MemberRegistration();
	public static LibraryAccount account = new LibraryAccount(LocalDate.parse("2017-11-10"),LocalDate.parse("2023-11-10"),"123456","Jeff","Bezos",new Addresse("India","Karnataka","Bangalore","Yelahanka"));
	public static AccountDashboard acctDash= new AccountDashboard();
	public static OrdersList ordersList = new OrdersList();
	public static MakePayment makePayment = new MakePayment();
	public static MembershipRenewal membershipRenewal = new MembershipRenewal();
	public static ManageAddresses addresses = new ManageAddresses();
	public static Menu menu = new Menu();
	public static BorrowBook borrowBook = new BorrowBook();

	public static OrderHistory history = new OrderHistory();
	public static viewShoppingCart cart = new viewShoppingCart();
	public static AddAddresse addAddresse = new AddAddresse();
	public static ReplaceCurrentAddresse replace = new ReplaceCurrentAddresse();
	public static DeleteSavedAddresse deleteAddr = new DeleteSavedAddresse();
	public static AccountSecurity security = new AccountSecurity();
	public static void UpdateDisplay()
	{
		
		if(ordersList.isVisible())
		{
			Point O=ordersList.getLocation();
			ordersList.dispose();
			ordersList = new OrdersList();
			ordersList.setVisible(true);
			ordersList.setLocation(O);;
		}
		
		else {
			ordersList = new OrdersList();
		}
		
	}

}
