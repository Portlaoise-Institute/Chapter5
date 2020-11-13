package com.mycompany.chapter5;

public class MyMethods {

    //Name: generateRandomNumber
    //Input: No input
    //Output: Return type is an integer 
    //Purpose: Generate a number in the range 1-10 
    static int generateRandomNumber() {
    
        //Generate a random number in the range 0.0 - 0.999
        float random = (float) Math.random();
        System.out.println("Random Number: "+random);
        
        //Assign a multiplication of the random number
        //to a second float variable, and output the value
        float multiplied = random * 10;  //range: 0.0 to 9.999
        System.out.println("Multiplied Number: "+multiplied);
        
        //range 1 - 10
        //Assign a rounded integer of the multiplied random
        //number to an int variable
        int randomInt = (int) Math.ceil(multiplied);
        
        return randomInt;  //return a value in the range 1-10 
        
    } //end method 
    
    
    //4 Types of methods - input/output 
    
    // Implementation of No Input & No Return Method 
    static void noInputNoReturn() {
        //Insert code - e.g. output a menu 
        System.out.println("Output from noInputNoReturn method");
    } //end method 
    
    
    
    
    // Implementation of Yes Input & No Return 
    static void yesInputNoReturn(int choice) {
        //Insert code - e.g. processing a menu 
        System.out.println("Output from yesInputNoReturn method");
        
        System.out.println("You chose option "+choice+ " the menu");
        
    } //end method 
    
       
    
    // No Input & Return 
    // Implementation of No Input & Yes Return 
    static String noInputYesReturn() {
        
        //local variables inside your own custom methods 
        String myLocalVariable = "Hello from the noInputYesReturn Method";
        
        return myLocalVariable; 
        
    } //end method 
    
    
    // Input & Return 
    // Implementation of Yes Input & Yes Return 
    static int yesInputYesReturn(int height, int width){
        //Calculate the area of a rectangle 
        int area = height * width; 
        return area; 
//      return height*width;
    } //end method 
    
    
    
    
    
} //end class 
