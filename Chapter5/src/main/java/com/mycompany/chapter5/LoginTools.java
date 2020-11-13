package com.mycompany.chapter5;
/**
 *
 * @author dstones
 */
public class LoginTools {

    /* Comment method */ 
    static void checkPassword(String[] args) {
        //Create and initialise a String variable
        //with a correct lowercase password
        
        String password = "bingo";
        
        //Page 76 - 77 Try Catch Finally Block 
       
        try {
            
            //evaluate the password argument entered by the user
            if (args[0].toLowerCase().equals(password)){
                System.out.println("Password accepted");
            } //end if 
            else {
                System.out.println("Incorrect password!");
            } //end else 
                       
        } //end try 
        
        catch(Exception e) {
                System.out.println("Password required!");
            
        } //end catch 
    
    } //end method
    
    // Insert additional methods - forgotten passwords, reset passwords
    
    
} //end class 
