
package com.mycompany.chapter5;

/**
 * A program to generate 6 lucky lottery numbers 
 * in the range 1-59
 * @author    Darren Stones
 */

public class Lottery {
    /**
   * Prints out "6 Random Lucky Numbers" 
   * @param args A string array containing 
   * the command line arguments.
   */ 
 
    public static void main(String[] args) {
    
    //Declare constants 
    final int START = 1;
    final int MAX = 60;
    final int LUCKY_NUMS = 6;
    
    //  Create an int array of 60 elements 
    int[] nums = new int[MAX];
    
    //fill the array with integers 1-59
    MyLotteryOps.populateArray(nums, START, MAX);
    
    //Display Populated Array
    System.out.println("\n Populated Array: \n");
    MyLotteryOps.displayArray(nums);
    
    
    //shuffle the values in elements 1-59
    MyLotteryOps.shuffleArray(nums);
    
    //Display Shuffled Array
    System.out.println("\n\n Shuffled Array: \n");
    MyLotteryOps.displayArray(nums);
    
    //Display the values contained in elements 1-6 
    MyLotteryOps.display6LuckyNums(nums, START, LUCKY_NUMS);
    
          
    } //end main 
    
    
    // All methods here -> moved to MyLotteryOps class 
    
    
} //end class 
