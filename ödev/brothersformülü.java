/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class brothersformülü {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input=new Scanner ( System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        double toplam=0;
        for(int k=0; k<=n; k++)
        {
            int temp=2*k+1; // temp geçici değişken olarak kullandık
            double fakt=1;
            for(int j=1; j<=temp; j++){
                fakt*=j;
            }
            toplam+=(double)(temp+1)/fakt;
        }
        System.out.println(toplam);
    }
    
}

    
    

