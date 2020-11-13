
package com.mycompany.chapter5;

//Class declaration
public class Power {

 
    public static void main(String[] args) {
        //declare and initialise an int
        //variable from a passed command
        //line argument 
        int num = Integer.parseInt(args[0]);
        
        //Perform mathematical caluclations
        //cast the results as int varaibles 
        int square = (int) Math.pow(num, 2);
        int cube = (int) Math.pow(num, 3);
        int sqrt = (int) Math.sqrt(num);
        
        //Output the results of the calculations
        System.out.println(num + " squared is "+ square);
        System.out.println(num + " cubed is "+  cube);
        System.out.println("Square root of "+num +" is "+sqrt);
    } //End main
    
} //End Online
