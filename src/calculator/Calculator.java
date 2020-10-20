/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float a, b, hasil;
        String operator;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bilangan a = ");
        a = input.nextFloat();
        System.out.print("Operator = ");
        operator = input.next();
        System.out.print("Bilangan b = ");
        b = input.nextFloat();
        
        switch(operator){
           
            case "+":
                hasil = a + b;
                System.out.println("======================");
                 System.out.print("hasil dari : ");
                System.out.println(a +" "+ operator+" "+ b +" = "+ hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("======================");
                 System.out.print("hasil dari : ");
                System.out.println(a +" "+ operator + " "+b +" = "+ hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("======================");
                 System.out.print("hasil dari : ");
                System.out.println( a +" "+ operator +" "+ b +" = "+ hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("======================");
                 System.out.print("hasil dari : ");
                System.out.println( a +" "+ operator +" "+ b +" = "+ hasil);
        }
    }
    
}
