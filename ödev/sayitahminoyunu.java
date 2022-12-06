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
public class sayitahminoyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int BS, tahmin ,s=0;
       Scanner input=new Scanner (System.in);
       BS=(int)(Math.random()*98)+1; // rastagele sayı üretir.
       do {
           System.out.print("Tahmininiz:");
           tahmin=input.nextInt();
           s++;
           if (tahmin>BS)
               System.out.println("daha küçük sayı giriniz");
           if(tahmin<BS)
               System.out.println("daha büyük sayı giriniz");
           System.out.println("");
       }
       while (tahmin!=BS);
       System.out.println(s+"tahminde buldunuz");
       }
    }
    

