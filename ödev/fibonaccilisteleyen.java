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
public class fibonaccilisteleyen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
      
        for(int i=0; i<=9; i++){
            for(int j=0; j<=9; j++){
               int s=i+j;
                if((s==1)|| (s==2)|| (s==3)|| (s==5)|| (s==8) || (s==13)){
                System.out.println(10*i+j);
            }
                
            }
        }
    }
}
