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
public class heterometriksayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir n sayısı giriniz");
        int n=input.nextInt();
        for(int a=1; a<=n; a++){
            System.out.println(a);
            System.out.println(a+1);
            System.out.println(a*(a+1));
        }
    }
    
}
