/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author USER
 */import java.util.Scanner;
public class altınüçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir a sayısı giriniz");
        double a =input.nextDouble();
        double b;
        b=a*(1+Math.pow(5,(1/2))/2);
        System.out.println(a+","+b+","+b);
        
                
    }
    
}
