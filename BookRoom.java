/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



    /**************************Contains logic to book a room **************************/

package hms;

import java.util.Scanner;

/**
 *
 * @author Deep Patel
 */
public class BookRoom 
{
    private static Scanner sc= new Scanner(System.in);
    private static Room room2 =new Room();
    private static Guests guest1 =new Guests();
    
    public boolean bookRoom1()
    {
        
        boolean added1 = false;
        
            System.out.println(" Please select the room type");
            System.out.println("1. Single");
            System.out.println("2. Double");
            System.out.println("3. King");  
            System.out.print("Enter your choice -> ");
            int choice = sc.nextInt();
            String room="ABC";
       
        if(choice == 1)
        {
                int index = room2.getAvailability1(choice);
                int a =room2.countS;
                System.out.println("CountSs: "+a);
                System.out.println("Index: "+index+" choice: "+choice);
                if(index < 0)
                {
                    System.out.println("\tPlease add the room first.....");
                    added1 = false;
                }
                else
                {
                    room = room2.getRoomNo(choice, index);
                    System.out.println("\t\nRoom Available to book: "+room);
                    System.out.println("Enter the name of Guest:");
                    String gName = sc.next();
                    guest1.setGuestName(index,choice,gName);
                    added1 = true;
                }
        }
        
        if(choice == 2)
        {
                int index = room2.getAvailability1(choice);  
                if(index < 0)
                {
                    System.out.println("\tPlease add the room first.....");
                    added1 = false;
                }
                else
                {
                    room = room2.getRoomNo(choice, index);
                    System.out.println("\t\nRoom Available to book: "+room);
                    System.out.println("Enter the name of Guest:");
                    String gName = sc.next();
                    guest1.setGuestName(index,choice,gName);
                    added1 = true;
                }
        }
        if(choice == 3)
        {
                int index = room2.getAvailability1(choice);  
                if(index < 0 )
                {
                    System.out.println("\tPlease add the room first.....");
                    added1 = false;
                }
                else
                {
                    room = room2.getRoomNo(choice, index);
                    System.out.println("\t\nRoom Available to book: "+room);
                    System.out.println("Enter the name of Guest:");
                    String gName = sc.next();
                    guest1.setGuestName(index,choice,gName);
                    added1 = true;
                }
        }
        
        
        return added1;
    }
}