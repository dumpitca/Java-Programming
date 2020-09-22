/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity_3;
import java.util.Scanner;

public class Actvity3_pt3 {
  //Create a program that makes a positive number negative and
  //display whether the number is odd or even
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        int number1 = input.nextInt();
        System.out.println(0 - number1);
        
        
        if (number1 % 2 == 0) {
            System.out.println("number1 is an even number" );
        
        
        } else if (number1 % 2 != 0) {
            System.out.println("number1 is an odd number");
        
        }
    
    } 
    
}
