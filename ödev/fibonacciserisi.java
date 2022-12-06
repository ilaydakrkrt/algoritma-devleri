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
public class fibonacciserisi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i , n, t1 , t2 , t3 ;
       System.out.printf("Fibonacci Serisi\n\n");
       Scanner input=new Scanner (System.in);
       System.out.print("Terim sayısı:");
       n =input.nextInt();
       t1=1;
       t2=1;
       System.out.print("\n"+t1+"\t"+t2+"t");
       for(i=1; i<=n-2; i++){
           t3=t1+t2;
           System.out.print(t3+"\t");
           t1=t2;
           t2=t3;
           
       }
    }
    
}
