/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    /**************************Contains logic for all guest method**************************/
package hms;

import java.util.Scanner;

/**
 *
 * @author Deep Patel
 */
public class Guests extends Room
{
    
    private static Room room2 =new Room();
    
   //String name,id_type,id_no,check_in,check_out,room_no;
    
    boolean newcustomer=true; 
    private String[] singleGuest;
    private int countSG;
    private int capacitySG;
    
    private String[] doubleGuest;
    private int countDG;
    private  int capacityDG;
    
    private String[] kingGuest;
    private int countKG;
    private int capacityKG;

    private static Scanner sc = new Scanner(System.in);
    

    
    //accessor methods
    
    /*public String getCheck_in()
    {    
        return check_in;
    }
    public String getCheck_out()
    {    
        return check_out;
    }*/
    
    
    public void findGuest(String gname)
    {
        int loc = -1;
        int temp1 =0;
        
        
        for (int index = 0; index < countS; index++) 
        {
            if (gname.equalsIgnoreCase(singleGuest[index])) 
            {
                loc = index;
                System.out.println("***Guest Found***");
                String room4= room2.getRoomNo(1, index);
                System.out.println("\t Guest Name: "+gname+"Room No: "+room4);
                temp1=1;
                break;
            }
        }
        if(temp1 != 1)
        {
            for (int index = 0; index < countD; index++) 
            {
                if (gname.equalsIgnoreCase(doubleGuest[index])) 
                {
                    loc = index;
                    System.out.println("***Guest Found***");
                    String room4= room2.getRoomNo(1, index);
                    System.out.println("\t Guest Name: "+gname+"Room No: "+room4);
                    temp1=1;
                    break;
                }
            }
            
        }
        if(temp1 != 1)
        {
            for (int index = 0; index < countK; index++) 
            {
                if (gname.equalsIgnoreCase(doubleGuest[index])) 
                {
                    loc = index;
                    System.out.println("***Guest Found***");
                    String room4= room2.getRoomNo(1, index);
                    System.out.println("\t Guest Name: "+gname+"Room No: "+room4);
                    temp1=1;
                    break;
                }
                
            }
            
        }
        if(temp1 != 1)
        {
            System.out.println("\t No record  Found for "+gname);
            
        }
    }
    
    
    public void showGuest()
    {    
       
        System.out.println("\t List of all Guests");
        System.out.println("\t Room Type: Single");
        for (int i=0;i<countS;i++)
        {
            if(singleListA[i] == 0)
            {
                System.out.println("Room No: "+singleList[i]+"  Guest Name: "+singleGuest[i]);  
            }           
        }
        
        System.out.println("\t Room Type: Double");
        for (int i=0;i<countD;i++)
        {
            if(doubleListA[i] == 0)
            {
                System.out.println("Room No: "+doubleList[i]+"  Guest Name: "+doubleGuest[i]);  
            }           
        }
        
        System.out.println("\t Room Type: King");
        for (int i=0;i<countK;i++)
        {
            if(kingListA[i] == 0)
            {
                System.out.println("Room No: "+kingList[i]+"  Guest Name: "+kingGuest[i]);  
            }           
        }
    }    
        
    
    
    //Mutator Methods
   
    public void setGuestName(int index,int type,String name)
    {
            if(type ==1)
            {
                singleGuest[index]=name;
                room2.setAvailability(0, type, index);  // Set room to occupied.
            }
            if(type ==2)
            {
                doubleGuest[index]=name;
                room2.setAvailability(0, type, index);  // Set room to occupied.
            }
            if(type ==3)
            {
                kingGuest[index]=name;
                room2.setAvailability(0, type, index);  // Set room to occupied.
            }
    }

     
    //*********Constructors**********
    
    public Guests()
    {
        this(10,10,5);
        
    }
    
    public Guests(int capacityS,int capacityD,int capacityK) 
    {
        this.capacitySG = capacityS;
        this.countSG = 0;
        singleGuest = new String[capacityS];
        
        
        this.capacityDG = capacityD;
        this.countDG = 0;
        doubleGuest = new String[capacityD];
        
        
        this.capacityKG = capacityK;
        this.countKG = 0;
        kingGuest = new String[capacityK];
        
     }


}

