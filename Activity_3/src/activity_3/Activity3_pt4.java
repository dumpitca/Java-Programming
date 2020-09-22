/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity_3;


public class Activity3_pt4 {
   // Create a method highestNumber(X, Y, Z): int that accepts 
   //integer parameters and returns the highest number from the input
   //However, if all inputs are equal, return the sum of all the inputs
   public static int highestNumber(int num1, int num2, int num3) {
       int a = num1 + num2 + num3;
       int sum = a;
       
       
       if (num1 > num2) {
          
           if (num1 > num3)
               return num1; //num1 is the highest number
           else
               return num3; //num3 is the highest number
       }
       
         else if (num1 == num2) { //if inputs are equals
             
               if (num1 == num3)
                   return sum;
               
               else 
                   return 0;
               
       }
       
        else {
              if (num2 > num3) 
                return num2; //num2 is the highest number
              
              else 
                  return num3; //num3 is the highest number        
       
    }
}
   
   
   public static void main(String [] args) {
      int numbers = highestNumber(29, 29, 1999);
        System.out.println(numbers);
   
   
   }
    
    
    
    
}
