package com.revature.projectdept2.Services;

import java.sql.SQLException;
import java.util.Scanner;



public class Start {
 
	static Scanner scanner = new Scanner(System.in);	

	public static void welcome() throws Exception {	
		
		System.out.println("****** WELCOME TO THE CHARITY  ****** \n "
				+ "1 REGISTER  \n"
				+ " 2 LOGIN     \n"
				+ " 3 LOG OUT");
		int a = scanner.nextInt();
		
		switch(a) {
		case 1:{
		
		try {
			Registration.register();
		} 
		catch (SQLException e)
		{
		e.printStackTrace();
			throw new Exception("Invalid Registration Details");
		}
		
		}
		welcome();
		break;
		
		case 2:{
		try {
			LoginCredits.login();
		} 
		catch(SQLException e) 
        { 
			e.printStackTrace();
            System.out.println("Exception in Login"); 
        } 
          
        finally
        { 
            System.out.println("INVALID USERNAME"); 
        } 
		welcome();
		break;
		
}
		}
	}

	
}


