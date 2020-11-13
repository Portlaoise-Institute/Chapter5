
package com.mycompany.chapter5;


public class Round {

  
    public static void main(String[] args) {
        
        float num = 7.25f; 
        
        //output the rounded float value as an int value
        System.out.println(num + " rounded is "+Math.round(num));
        
        //Output the rounded value as double values
        System.out.println(num + " floored is "+Math.floor(num));
        System.out.println(num + " ceiling is "+Math.ceil(num));
        
    } //end main 
    
} //end class 
