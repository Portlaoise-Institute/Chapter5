package com.mycompany.chapter5;

/**
 * A program to generate 6 lucky lottery numbers 
 * in the range 1-59
 * @author    Darren Stones
 */

public class LotteryV2 {
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
    populateArray(nums, START, MAX);
    
    //Display populated Array
    System.out.println("\n Populated Array: \n");
    displayArray(nums);
    
    //shuffle the values in elements 1-59
    System.out.println("\n\n Shuffled Array: \n");
    shuffleArray(nums);
    
    //Display shuffled Array
    displayArray(nums);
        
    //Display the values contained in elements 1-6 
    display6LuckyNums(nums, START, LUCKY_NUMS);
    
          
    } //end main 
    
    
    
   /************************************************************/ 
    
    
    
   /**
   * Populates the array with values
   * @param nums 
   * @param start 
   * @param end
   * @exception Any exception - Not applicable
   * @return Populated Array.
   */ 
    
    static int[] populateArray(int[] nums, int start, int end) {
        
//        int[] x = nums.clone();
        
        for (int i=start; i <end; i++) {
            nums[i] = i;
        } //end for 
        
        return nums;  //return populated array 
        
    } //end method 

    
   /**
   * Shuffles the array 
   * @param nums The array with start and end values 
   * @exception Any exception - Not applicable
   * @return Shuffled Array.
   */ 
    
    static int[] shuffleArray(int[] nums) {
        
        for (int i=1; i<nums.length; i++)
        {
            int r = (int) Math.ceil(Math.random() * 59); //random num 1-59
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
            
        } //end for 
        
        return nums;  //return shuffled array 
        
    } //End method

    
   /**
   * Displays a list of lucky numbers 
   * @param nums The array with start and end values 
   * @exception Any exception - Not applicable
   * @return No return.
   */ 
    
    static void display6LuckyNums(int[] nums, int start, int LUCKY_NUMS) {
        
        System.out.println("\n\n*** My Lucky Lotto Numbers ***");
        System.out.println("\t");
        for (int i= start; i<=LUCKY_NUMS; i++) {
            System.out.print(Integer.toString(nums[i])+" ");
        } //end for
        
    } //end method 

    
    
    
    
    private static void displayArray(int[] nums) {
        
        for (int i=1; i<nums.length; i++)
            {
                if (i%10==0){
                    System.out.print("\n"+nums[i]+" ");
                }
                else
                {
                    System.out.print(nums[i]+" ");
                }

            } //end for 
    
    } //end method
    
    
} //end class 
