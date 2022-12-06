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
public class aritmetiksayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir a sayısı giriniz");
        double a=input.nextDouble();
        double t=0;
        double s=0;
        for(int i=1; i<=a; i++){
            if(a%i==0){
                t=t+i;
                s=s+1;
            }
        }
            
           if(t/s==Math.round(t/s)){ //Math.round yuvarlamak için kullanılır.
               System.out.println("Aritmetik sayıdır");
            }
           
           else{
               System.out.println("Aritmetik sayı değildir");
            }
  }   
}
