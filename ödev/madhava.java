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
public class madhava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        int t=0;
        for(int k=0; k<=n-1; k++){
            t+=Math.pow((-1),k)/((double)(2*k+1)*Math.pow(3,k));
           
                    
        }
        System.out.println(Math.pow ((12),(1/2)*t));
    }
    
}
