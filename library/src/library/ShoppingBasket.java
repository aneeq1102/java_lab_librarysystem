package library;
import java.time.LocalDate;
import java.util.*;

import javax.swing.DefaultListModel;

import GUI.GUIForm;
public class ShoppingBasket {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	ShoppingBasket() {
		books.add(new Book("moby dick","12345"));
		books.add(new Book("gullivers travels","1678"));	
	}
	
	public void add(Book b) {
		System.out.println("added to array"+b.title);
		GUIForm.cart.generateArray();
		books.add(b);
	}
	

	public DefaultListModel<String> display()
	{

		DefaultListModel<String> list=new DefaultListModel<String>();
		int i;
//		String type=null;
		System.out.println("printing out books");
		for(Book x:books) {
			System.out.println(x.title);
		}
		for(i=0;i<books.size();i++)
		{
			
//			if(getAccounts()[i].getClass().toString().equals("class Bank.SavingsAccount"))
//			{
//				type="Type: Savings Account";
//			}
//			
//			else if(getAccounts()[i].getClass().toString().equals("class Bank.CurrentAccount"))
//			{
//				type="Type: Current Account";
//			}
//			
//			else if(getAccounts()[i].getClass().toString().equals("class Bank.StudentAccount"))
//			{
//				type="Type: Student Account";
//			}
			
			list.addElement(books.get(i).title.toString());
			
			
		}
		return list;
	
	}
}
