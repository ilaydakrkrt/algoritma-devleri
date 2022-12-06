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
public class kök3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            double t=1;
        Scanner input =new Scanner (System.in);
        System.out.println("Bölme sayısı:");
        int n= input.nextInt();
        for (int i=0; i<=n; i++)
            t=1+1/(2+1/t);
        System.out.printf("Karekök(3)=%f\n",1+1/t); // %f kesirli sayıya çevirmek için kullanılır.
        
            
    }
    
}
