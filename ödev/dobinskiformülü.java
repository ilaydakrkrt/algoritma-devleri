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
public class dobinskiformülü {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        for(int i=1; i<=n; i++){
        double t=0;
        double f=1;
        for(int j=1; j<=100; j++){
            f=f*j;
            t=t+Math.pow(j,i)/f;
            

        }
        double e=2.71828;
        System.out.println(t/e);
    }
    
}
}
