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
public class bağdaşıksayilar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("lütfen a sayısı giriniz");
     int a=input.nextInt();
     System.out.println("lütfen b sayısı giriniz");
     int b=input.nextInt();
     int a1=(a/10);
     int a0=(a%10);
     int b1=(b/10);
     int b0=(b%10);
     if(a1==b1 && a0+b0==10){
         System.out.println("bağdaşık sayılar");
     }
     else{
         System.out.println("bağdaşık sayılar değil");
     }
    }



}

