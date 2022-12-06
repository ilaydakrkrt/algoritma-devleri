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
public class markovsayıları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for(int x=1; x<=50; x++){
            for (int y=x; y<=50; y++){
                for (int z=y; z<=50; z++){
                    if(x*x+y*y+z*z==3*x*y*z){
                        System.out.println(x+y+z);
                    }
                }
            }
        }
        }
    
}
