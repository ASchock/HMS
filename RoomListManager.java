/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**************************** Logical class for room ****************************/
package hms;

import java.util.Scanner;

/**
 *
 * @author Deep Patel
 */
public class RoomListManager 
{
     private static Room room1 = new Room();
    public static Scanner sc = new Scanner(System.in);
   
    
    public void selectOption()
    {
            System.out.println("1. Find a room");
            System.out.println("2. Add a room");
            System.out.println("3. Show all unoccupied rooms");
            System.out.println("4. Show all occupied rooms");
            System.out.print("Enter your choice -> ");
            int choice1=sc.nextInt();
            if (choice1 == 2) 
            {
                addRoom(createName());
            } 
            else if (choice1 == 1) 
            {
                findRoom(createName());
            }
            else if (choice1 == 3) 
            {
                room1.showRoomU();
            }
            else if (choice1 == 4) 
            {
                showRoomO1();
                
            }
            
            else  
            {
                System.err.println("Invalid choice!!!");
            }
    }
           
    public static void showRoomO1()
    {
        System.out.println(" Please select the room type");
            System.out.println("1. Single");
            System.out.println("2. Double");
            System.out.println("3. King");  
            System.out.print("Enter your choice -> ");
            int ch3 = sc.nextInt();
            room1.showRoomO(ch3);
       
    }
    
    public static void addRoom(String name) 
            {
               if (room1.setRoom(name)) 
               {
                   System.out.println("\n\t ==> Room is added successfully");
               } 
               else 
               {
                   System.out.println("\n\t ==> Failed to add Room as the list is full");
               }
            }
            
            public static void findRoom(String name) 
            {
                room1.findRoom(name);         
            }

            public static String createName() 
            {
                System.out.print("Enter the name : ");
                String name = sc.next();
                return name;
            }
    
}
