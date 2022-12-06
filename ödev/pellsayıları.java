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
public class pellsayıları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       System.out.println("lütfen bir n sayısı giriniz");
       int n=input.nextInt();
       int p1=0;
       int p2=1;
       System.out.println(p1);
       System.out.println(p2);
       for(int k=1; k<=n-2; k++){
           int p3=2*p2+p1;
           System.out.println(p3);
           p1=p2;
           p2=p3;
       }
    }
    
}
