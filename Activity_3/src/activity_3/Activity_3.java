/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity_3;

/**
 *
 * @author Bulitog
 */
public class Activity_3 {

    //Create a method average(A, B, C) that 
    //requires 3 numerical parameter and returns the average of the numbers 
    public static double average(double num1, double num2, double num3) {
        double sum = num1 + num2 + num3;
        double quotient = sum / 3;
        return quotient;
    }
    
    
    
    public static void main(String[] args) {
        double first_number = average(81.20, .75, 3.25);
       
        System.out.println(first_number);
       
       
        
    }
    
}
