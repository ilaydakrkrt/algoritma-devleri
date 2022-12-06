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
public class negafibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        int f1=1;
        int f2=(-1);
        System.out.println(f1);
        System.out.println(f2);
        for(int i=1; i<=n-2; i++){
            int f3=f1-f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
        }
    }
    
}
