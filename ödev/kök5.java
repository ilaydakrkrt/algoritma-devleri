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
public class kök5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        double n=input.nextDouble();
        double t=1;
        for(int i=1; i<n; i++){
            t=4+1/t;
        }
                    
            System.out.println(Math.sqrt(5)+(2+1/t)); //Math.sqrt kök için kullanılır.

        }
    }
    

