/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    /*****************Main Method File******************/
package hms;

import java.util.Scanner;

/**
 *
 * @author Deep Patel
 */
public class HMS 
{

    /**
     * @param args the command line arguments
     */
    private static Room room1 = new Room();
    private static RoomListManager room2 = new RoomListManager();
    private static Guests guest1 =new Guests();
    private static GuestListManager guest2 = new GuestListManager();
    private static BookRoom book1 = new BookRoom();
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        
         System.out.print("**************************************************");
        System.out.print("\n\t HOTEL MANAGEMENT SYSTEM \n");
        System.out.println("**************************************************");
        System.out.println("\nThis is a basic Console Menu Driven Application\n");
        Scanner sc = new Scanner(System.in);
        boolean ask = true;
        int a=0;
    while(ask)
    {
        if(a == 0 )
        {
        System.out.println("\nPlease select one of the following options below. "
                + "\nTO make selection use the INDEX VALUE\n");
        System.out.println("1 = Make Reservation \n2 = Rooms \n3 = Staff \n4 = Guests \n5 = Checkout\n");
        System.out.print("You have selected --> ");
        int choice = sc.nextInt();
        switch (choice) 
            {
                case 1: if(book1.bookRoom1())
                        {
                            System.out.println("\n \t Congratulations....Room is Booked Successfully");
                        }
                        else
                        {
                             System.err.println("Booking Unsuccessful..");
                        }
                        break;
                    
                    
                case 2:
                room2.selectOption();
                int temp=1;
                while(temp==1)
                {
                    System.out.println("\nExit Rooms and return to main menu?");
                    System.out.println("1 = YES \t2 = NO");
                    System.out.print("\nYou have selected --> ");
                    int choiceR = sc.nextInt();
                    if(choiceR== 2)
                    {
                        room2.selectOption();
                    }
                    else if(choiceR== 1)
                    {
                        temp=0;
                    }
                    else
                    {
                        System.out.println("\t INVALID CHOICE");
                        temp=0;
                    }
                }
                /*System.out.println("\n\t************************");
                System.out.println("\t\tROOMS");
                System.out.println("\t************************");
                System.out.println("Room NO\t\t Type\t\tPrice\t\t Available?");
                // call static method
                rooms();*/
                break;

                case 3:
                System.out.println("\n\t************************");
                System.out.println("\t\tUnder Maintenance");
                System.out.println("\t************************");
                // call static method
                //staff();
                break;

                case 4:
                System.out.println("\n\t\t\t************************");
                System.out.println("\t\t\t\tGUESTS");
                System.out.println("\t\t\t************************");
                // call static method
                //guests();
                guest2.selectOption();
                break;

                case 5:
                System.out.println("Under Maintenance");
                break;
                
                default:
                System.out.println("\nInvalid Choice.\nPlease make a valid choice.\n ");
                break;
            }
        }
        System.out.print("\n\n DO YOU WANT TO CONTINUE?");
        System.out.print("\n 1 = YES 2 = NO");
        System.out.print("\nYou have entered --> ");
        int a1= sc.nextInt();
        switch(a1)
        {
            case 2: System.out.println("\nGood Bye!");
                    ask = false;
                    a=0;
                    break;
            
            case 1: a = 0;
                    break;
            
            default:System.out.println("\nIINVALID CHOICE.\nPLEASE MAKE A VALID CHOICE.\n");
                    a=1;
                    break;
        }
        
    }          
    }
    
     private static  void staff()
    { 
      System.out.println("Please select a category..");
      System.out.println("\n 1 = Kitchen\n 2 = Guest services \n 3 = Administration");
      System.out.print("\n You have selected --> ");
    
    }
    
}

