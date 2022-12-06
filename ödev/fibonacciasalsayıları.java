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
public class fibonacciasalsayıları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        int f1=1;
        int f2=1;
        int s2=0;
        int f3=f1+f2;
        f1=f2;
        f2=f3;
        int s1=0;
        for(int i=2; i<=f3-1; i++){
            if(f3%i==0){
                s1=s1+1;
            }
        }
        if (s1==0){
        s2=s2+1;
        System.out.println(f3);
        }
        else if(s2<n){
            
        }
    }
    
}
