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
public class altınoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen ab sayısı giriniz");
        int ab=input.nextInt();
        double cb=2*ab/(1+Math.pow(5,0.5));
        double ac=ab-cb;
        System.out.println(ac);
        System.out.println(cb);
    }
    
}
