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
public class pisagorüçlemesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        for (int a=1; a<=n-1; a++){
            for(int b=a+1; b<=n-a; b++){
                int c=n-(a+b);
                if(Math.pow (a,2)+Math.pow (b,2)==Math.pow(c,2)){
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a*b*c);
                }
            }
        }
    }
    
}
