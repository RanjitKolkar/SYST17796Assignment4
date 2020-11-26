package passwordvalidator;



/**
 * A class to validate a user's chosen password. The password must have a length of at least 8 and at least one
 * uppercase character and at least one special character (character that is not a letter or a number). This is also our
 * class under test. Starter code for ICE 4
 *
 * @author Haki Put your name and student is as modified by
 * @date
 */

import java.util.regex.*; 
import java.util.Scanner;
public class ClassValidator
{
	public static void main(String[] args) {
	    System.out.println("Please enter a VALID password, password must have:");
            System.out.println("A length of at least 8");
            System.out.println("At least one special character");
            System.out.println("At least one uppercase letter");
            System.out.println("Please enter a password to be checked: ");

            Scanner sc = new Scanner(System.in);
            String password = sc.nextLine();
            System.out.println(isValidPassword(password)); 
	}

    public static boolean
    isValidPassword(String password) 
    { 
  
        // Regex to check valid password. 
        String pwd = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$"; 
  
        // Compile the ReGex 
        Pattern p = Pattern.compile(pwd); 
        if (password == null) { 
            return false; 
        }  
        Matcher m = p.matcher(password); 
        return m.matches(); 
    } 
}
