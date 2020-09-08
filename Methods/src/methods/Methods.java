/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author kevin
 */
public class Methods {

    //no paramter and no return
    public static void display() {
        System.out.println("this is a method");
        System.out.println("print me");
    
    }
    
    //with parameter but no return
    public static void displayName(String name) {
        System.out.println("My name is: " + name);
    
    }
    //with parameter and return
    public static int addNumbers(int number1, int number2) {
        int sum = 1;
        sum = number1 + number2;
        return sum;

    }
    
    public static void main(String [] args){
        display();
        displayName("Cassandra");
        
        int total = addNumbers(5, 2);
        System.out.println("the sum is: " + total);
                
        
    }

}