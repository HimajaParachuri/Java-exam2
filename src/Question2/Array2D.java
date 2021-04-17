/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Array2D {

    public static boolean equals(int[][] m1, int[][] m2) {
       
        for (int i = 0; i < 3; i++) {
          
            for (int j = 0; j < 3; j++) {
               
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
      
        int m = 3;

        int array1[][] = new int[m][m];
        int array2[][] = new int[m][m];

        System.out.print("Enter list1: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter list2: ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        boolean eq = equals(array1, array2);
        
        if (eq == true) {
            System.out.print("The two arrays are strictly identical");
        } 
      
        else if (eq == false) {
            System.out.print("The two arrays are not strictly identical");
        }
    }
}
