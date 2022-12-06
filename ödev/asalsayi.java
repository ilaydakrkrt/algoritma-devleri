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
public class asalsayi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n ,s ;
        Scanner input=new Scanner (System.in);
        System.out.println("Belirtilen aralıktaki asal sayılar");
        System.out.print("\nÜst sınır:");
        n=input.nextInt();
        System.out.print("\n+++ Asal Sayılar +++\n\n");
        for (int i=2; i<=n; i++){
            s=0;
            for(int j=1; j<=i; j++)
                if (i%j==0)
                    s++;
            if(s==2)
                System.out.print(i+"\t");
          }
        }
      }
