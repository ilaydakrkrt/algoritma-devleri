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
public class euzerix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        double x,T=1,F=1;
        Scanner input=new Scanner (System.in);
        System.out.print("terim sayısı giriniz:");
        N=input.nextInt();
        System.out.print("hesaplanacak x değeri giriniz:");
        x=input.nextDouble();
        for(int i=1; i<N; i++){
            F*=i;
            T+=Math.pow(x, i)/F;}
        
        System.out.printf("\nSeriaçılımı ile e üzeri x değeri: %.5f\n",T);
        System.out.printf("Komutla e üzeri x değeri: %.5f\n", Math.exp(x));
        }
       }
    

