package com.hsbc.insurance.views;

import java.io.IOException;
import java.util.Scanner;

public class PolicyHolderApp {

	
	private static void menu()
	{
		 
		System.out.println("Policy Holder Admin Menu");
		System.out.println("-----------------------------------------");
		System.out.println("1.Add Policy Holder");
		System.out.println("2.Update Policy Holder");
		System.out.println("3.Delete Policy Holder");
		System.out.println("4.Read All Policy Holder Information");
		System.out.println("5.Show Policy Holder By Id");
		System.out.println("6.Show Sorted Policy Holders Information");
		System.out.println("99.Exit");		
	}
	
	public static void choiceImpl(int option)
	{
		switch(option)
		{
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		
		}
		
	}
	
	
	
	public static void cls() 
	  {
	        try {
				new ProcessBuilder("cmd", "", "cls").inheritIO().start().waitFor();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		
		Scanner scanner = new Scanner(System.in);
		do
		{
			//cls();
          menu();
                 
          
          System.out.println("Do you want to continue(1..98)");
          choice=scanner.nextInt();
          scanner.nextLine();
          choiceImpl(choice);
		}
		while(choice!=99);
	}

}
