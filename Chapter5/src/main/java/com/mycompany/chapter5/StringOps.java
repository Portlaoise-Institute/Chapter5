package com.mycompany.chapter5;


/**
 * A program to conduct string operations 
 * @author    Darren Stones
 */

public class StringOps {
    // Comment this code
    static char getFirstCharacter(String txt) {
        
//        return txt.charAt(0);
        
        char initChar = txt.charAt(0);
        
        return initChar;
        
    } //end method 

    //Comment this method 
    static char getLastCharacter(String txt) {
    
        //Borrocudo 9 characters index range 0-8  (9-1)=8
        char lastChar = txt.charAt(txt.length()-1);
    
        return lastChar;
        
    } //end method 

   /**
   * Get the specified character from the String
   * <p> Example getAnyCharacter("Borrocudo",2)  returns 'r'
   * @param txt string supplied
   * @param i index value of character required
   * @exception IndexOutOfBoundsException  
   * @return Value of Specified Character
   */ 
    
    public static char getAnyCharacter(String txt, int i) {
    
        char chosenChar = txt.charAt(i);
        
        return chosenChar;
    
    } //end method 
    
    
} //end class
