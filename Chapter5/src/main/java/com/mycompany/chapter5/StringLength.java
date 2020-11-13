package com.mycompany.chapter5;

public class StringLength {

    public static void main(String[] args) {
    
        //Create and initialise two String variables
        String lang = "Java";
        String series = " in easy steps";
        
        //Assign the result of the concatenation value
        //to the title variable
        String title = lang.concat(series);
        
//       title = lang + series;   // + cocatentation operator 
      
        //Output the contents of the concatenated string
        //together with its size
        System.out.print("\"" + title +"\" has ");
        System.out.println(title.length() + " characters");
        
    } //end main
    
} //end class
