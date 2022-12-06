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
public class floyducgeni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n , s =1;
        Scanner input=new Scanner (System.in);
        System.out.print("Satır sayısı:");
        n=input.nextInt();
        System.out.print("FLOYD ÜÇGENİ");
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++ ){
                System.out.printf("%d\t",s);
                s++;
               }
            System.out.println();
        }
        
    }
    
}
