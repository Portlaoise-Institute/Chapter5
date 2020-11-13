package com.mycompany.chapter5;

public class Random {
  
    public static void main(String[] args) {
      
        //Generate a random number in the 
        //range 1-10 
        
        //generateRandomNumber No input, Return Type int 
        int randomInt = MyMethods.generateRandomNumber();
      
        System.out.println("Random Integer: "+randomInt);
        
        System.out.println("\n\n");
        //Call the different types of methods 
        
        //Call no input, no return method 
        MyMethods.noInputNoReturn();
        
        
        //Call yes input, no return method
        System.out.println("\n");
        int menuChoice = 3;
        MyMethods.yesInputNoReturn(menuChoice);
        
        
        //Call no input, yes return method 
        
        System.out.println("\n"+MyMethods.noInputYesReturn());
        
        String str = MyMethods.noInputYesReturn();
        System.out.println("Displaying variable: "+str);
        
        
        //Call method to calculate the area of a rectangle 
        // Call input, yes return method
        int height = 9;  
        int width = 7;
        System.out.println("\nArea of the rectangle is: "+
                MyMethods.yesInputYesReturn(height, width));
        
        int area = MyMethods.yesInputYesReturn(height, width);
        System.out.println("\n Area is: "+area);
        
        
   } //end main 
          
} //end class 
