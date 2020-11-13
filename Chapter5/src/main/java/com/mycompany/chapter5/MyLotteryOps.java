
package com.mycompany.chapter5;

class MyLotteryOps {

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
    
    
    
   /**
   * Displays array
   * @param nums The array 
   * @exception Any exception - Not applicable
   * @return No return.
   */ 
    
    
    public static void displayArray(int[] nums) {
        
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
    
    
    
    
} //End class 
