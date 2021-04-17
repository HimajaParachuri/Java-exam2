/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HIMAJA PARACHURI
 */
public class Array1D {

    /**
     * @param list
     * @param args the command line arguments
     */
    public static void removeDuplicate(ArrayList<Integer> list) {

        ArrayList<Integer> ListWithoutDuplicate = new ArrayList<>();

        for (Integer i : list) {
            
            if (!ListWithoutDuplicate.contains(i)) {
                ListWithoutDuplicate.add(i);
            }
        }
    
        System.out.print("The distinct integers are " );
        for(int i =0; i< ListWithoutDuplicate.size();i++){
            System.out.print(ListWithoutDuplicate.get(i) + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) throws IOException {
        
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();
   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
       
        String line = br.readLine(); 
        
        String[] strs = line.trim().split("\\s+");
        
      
        for (int i = 0; i <strs.length; i++) {
            int a = Integer.parseInt(strs[i]);
            list.add(a);
        }
        
        removeDuplicate(list);
        
    }
}