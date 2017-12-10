/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    /**************************Logical class for guest **************************/
package hms;

import java.util.Scanner;

/**
 *
 * @author Deep Patel
 */
public class GuestListManager {
    /** Logic for updating guest lists**/
    private static Guests guest1 = new Guests();
    public static Scanner sc = new Scanner(System.in);
   
    
    public void selectOption()
    {
            System.out.println("1. Find a Guest");
            System.out.println("2. Update details of a Guest");
            System.out.println("3. Show List of all Guests");
            System.out.print("Enter your choice -> ");
            int choice1=sc.nextInt();
            if (choice1 == 1) 
            {
                findGuest(createName());
            } 
            else if (choice1 == 1) 
            {
                updateGuest(createName());
            }
            else if (choice1 == 3) 
            {
                //showGuest();
            }
            
            else  
            {
                System.err.println("Invalid choice!!!");
            }
    }
    
    public static void findGuest(String name) 
            { 
               guest1.findGuest(name);         
            }
     public static void updateGuest(String name)
     {
         
     }
      public static void showGuest(String name)
      {
                guest1.showGuest();
      }

            public static String createName() 
            {
                System.out.print("Enter the name : ");
                String name = sc.next();
                return name;
            }
}
