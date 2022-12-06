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
public class dostsayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen a sayısı giriniz");
        int a=input.nextInt();
        System.out.println("lütfen b sayısı giriniz");
        int b =input.nextInt();
        int ta=0;
        int tb=0;
        for(int i=1; i<=a-1; i++){
           if(a%i==0){
             ta=ta+i;
          }
        }
        for(int i=1; i<=b-1; i++){
            if(b%i==0){
                tb=tb+i;
            }
        }
        if(ta==b && tb==a){
            System.out.println("dost sayılar ");
        }
        else{
            System.out.println("dost sayılar değil");
        }
           
                
    }
    
}
