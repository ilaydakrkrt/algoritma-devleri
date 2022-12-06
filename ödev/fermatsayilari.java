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
public class fermatsayilari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        for(int i=0; i<n; i++){
            System.out.println(Math.pow(2, Math.pow(2,i))+1);
        }
    }
    
}
