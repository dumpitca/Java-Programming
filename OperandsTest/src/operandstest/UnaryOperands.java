/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operandstest;

/**
 *
 * @author kevin
 */
public class UnaryOperands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a= 10;
      int c = a++ + ++a;
      System.out.println(c + " " + a);// TODO code application logic here
    }
    
}
