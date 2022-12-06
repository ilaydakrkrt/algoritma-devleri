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
public class chenasalı {

    public static boolean asalmi(int x){
        {
            for(int i=2; i<x; i++){
                if(x%i==0){
                    return false; //return döndürmek için kullanılır
                }
            }
            return true;
        }
    }
            
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        if(asalmi(n)){
            System.out.println("asaldır");
        }
        if (asalmi(n+2)){
            System.out.println("chen asalıdır");
        }
        else {
            System.out.println("chen asalı değildir");
        }
       
    }
    
}
