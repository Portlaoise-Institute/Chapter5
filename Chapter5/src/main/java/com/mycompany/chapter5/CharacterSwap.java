package com.mycompany.chapter5;

public class CharacterSwap {
  
    public static void main(String[] args) {

        //Declare and initialise an empty String variable
        String txt = "";
        
        //Assign some characters to the String variable
        //if it is indeed empty, with both leading & trailing spaces
        if (txt.isEmpty()) txt = "     Borrocudo     ";
        
        //Output the String value and the number of characters 
        //it contains
        System.out.println("String: "+txt);
        System.out.println("Original String Length: " +txt.length());
        
        //Remove the leading and trailing spaces, then output the
        //String value and its size
        txt = txt.trim();
        System.out.println("String: "+txt);
        System.out.println("Trimmed String Length: " +txt.length());
        
        //Output the first character in the String
        char initial = StringOps.getFirstCharacter(txt);
        System.out.println("First Letter: "+initial);
        
        //Output the last character in the String
        initial = StringOps.getLastCharacter(txt);
        System.out.println("Last Letter: "+initial);
        
        //Output any chosen character in  the String
        // Borrocudo - character 3 'r' - index = 2
        initial = StringOps.getAnyCharacter(txt, 2);
        System.out.println("Chosen Character: "+initial);
        
        //Replace all occurances of the letter 'o' with the letter 'a'
        txt = txt.replace('o','a');
        System.out.println("String: "+txt);
        
    } //end main
    
} //end class 
