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
public class oresayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("lütfen bir n sayısı giriniz");
       int n=input.nextInt();
       int s=0;
       int t=0;
       for(int i=1; i<=n; i++){
           if(n%i==0){
               s=s+1;
               t+=1/(double)i;
           }
          }
        if(s%t==0){
           System.out.println("ore sayısıdır");
       }
       else{
           System.out.println("ore sayısı değildir");
       }
          }
    
}
