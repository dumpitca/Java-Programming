/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity_3;

/**
 *
 * @author kevin
 */


public class Activity3_pt2 {
//Create a method convert(A) that accepts a numerical parameter A. 
//Assuming A represents inches (i.e unit of length), 
//the method must display the converted value of inches to centimeters
    public static int inch(int num1) {
    int number1 = (int) (num1 * 2.54);
    return number1;
      
    }
    
    public static double second_inch (double num2) {
    double number2 = num2 * 2.54;
    return number2;
    
    }
    
    public static int third_inch (int num3) {
    int number3 = (int) (num3 * 2.54);
    return number3;
    
    }
    
public static void main(String[] args) {
    double a = inch(30);
    double b = second_inch(101.12);
    double c = third_inch(2500);
   
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);


}
    
    
    
    
    
}
