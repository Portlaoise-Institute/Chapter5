package com.mycompany.chapter5;
public class LotteryV1 {
   
    public static void main(String[] args) {
        
        /*
         * Generate a sequence of six non-repeating random 
         * numbers in the range 1-59
        */
        
        /* 
         * Create an int array of 60 elements
         * Then fill elements 1-59 with integers 1-59
        */
        int[] nums = new int[60];
                
        //Output the contents of the array prior to population
        
        for (int i=0; i<60; i++)
        {
            if (i%10==0){
                System.out.print("\n"+nums[i]+" ");
            }
            else
            {
                System.out.print(nums[i]+" ");
            }
            
        } //end for 
        
        
        //Then fill elements 1-59 with integers 1-59
                
        for (int i=1; i<60; i++)
        {
            nums[i]=i;
        } //end for 
        
        
        
        //Display array
        
        System.out.println("\n Populated Array: \n");
        
        for (int i=1; i<60; i++)
        {
            if (i%10==0){
                System.out.print("\n"+nums[i]+" ");
            }
            else
            {
                System.out.print(nums[i]+" ");
            }
            
        } //end for 
        
        
        
        //Fisher-Yates Shuffle Algorithm 
        //Shuffle the values in elements 1-59
        for (int i=1; i<60; i++)
        {
            int r = (int) Math.ceil(Math.random() * 59); //random num 1-59
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
            
        } //end for 
        
        
        
                
        //Display array
        
        System.out.println("\n\n Shuffled Array: \n");
        
        for (int i=1; i<60; i++)
        {
            if (i%10==0){
                System.out.print("\n"+nums[i]+"\t");
            }
            else
            {
                System.out.print(nums[i]+"\t");
            }
            
        } //end for 
        
        
       
        //Output only those values contained in elements 1-6 
        
        System.out.println("\n\n*** Lucky Numbers *** \n");
        
        for (int i=1; i<7; i++) {
            System.out.print(Integer.toString(nums[i])+ " ");
        } //end for
        
        
    } //end main  
    
} //end class 
