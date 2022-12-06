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
public class sayıbulmaoyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int bs= (int)(Math.random ()*98)+1;
       int s=0;
       int tahmin;
       do{
       System.out.println("lütfen tahmininizi giriniz");
       tahmin=input.nextInt();
       s=s+1;
       if(tahmin>bs)
           System.out.println("daha küçük sayı giriniz");
       
       if(tahmin<bs)
           System.out.println("daha büyük sayı giriniz");
       System.out.println("");
       }
       while(tahmin!=bs);
       System.out.println(s+"tahminde bulundunuz");
    }
    
}
