
package com.mycompany.chapter5;


public class Pi {

 
    public static void main(String[] args) {
      
        //Declare and initialise a float variable
        float radius = 5.0f; 
        
        //Math.PI -> 3.141592653589793 (Double)
        //Shortened version of PI
        float shortPi = (float) Math.PI;    // 3.1415927 
        
        //Perform mathematical calculations
        //circumference of circle = Pi *2r
        float circ = shortPi * (radius + radius);
        //area of circle = Pi * r * r 
        float area = shortPi * (radius * radius); 
        
        //Display some info
        System.out.println("With Pi commuted from " +Math.PI);
        System.out.println(" to "+ shortPi +"...");
        
        System.out.println("A circle of radius "+radius+ " cm");
        System.out.println("has a circumference of "+circ+ "cm");
        System.out.println("and an area of "+area + " sq.cm");
        
    } //end main 
    
} //end class 
