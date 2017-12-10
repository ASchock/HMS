/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    /**************************Contains logic for all room method**************************/
package hms;

import java.util.Scanner;

/**
 *
 * @author Deep Patel
 */
public class Room 
{
    
    
    
    public String[] singleList;
    public int[] singleListA; //For Availability :  0= Occupied, 1= Not Occupied
    public double priceS;
    public int countS;
    public int capacityS;
    
    public String[] doubleList;
    public int[] doubleListA;
    public double priceD;
    public int countD;
    public  int capacityD;
    
    public String[] kingList;
    public int[] kingListA;
    public int countK;
    public double priceK;
    public int capacityK;

    private static Scanner sc = new Scanner(System.in);
    
    //accessor methods
    
    
    public String getRoomNo(int type,int index)
    {
        String name3="NULL";
        if(type ==1 )
        {
            for (int i=0;i<countS;i++)
            {
                name3 = singleList[index];
                System.out.println("Yo:"+singleList[index]);
        
            }
        }
        if(type ==2 )
        {
            for (int i=0;i<countD;i++)
            {
                name3 = doubleList[index];
            }
        }
        if(type ==3 )
        {
            for (int i=0;i<countK;i++)
            {
                name3 = kingList[index];
        
            }
        }
        return name3;
    }
    public void showRoomU()
    {
        System.out.println(" Please select the room type");
            System.out.println("1. Single");
            System.out.println("2. Double");
            System.out.println("3. King");  
            System.out.print("Enter your choice -> ");
            int choice = sc.nextInt();
       
        if(choice == 1)
        {
            
            System.out.println("\n ****** List of all Unoccupied Rooms ********\n");
            int temp =0;
            for (int i=0;i<countS;i++)
            {
                
                if(singleListA[i] == 1)
                {
                  System.out.println(singleList[i]+singleListA[i]);  
                  temp=1;
                }        
            }
            if(countS == 0)
            {
                System.out.println("No rooms are present. Please add a room first.");
                temp=1;
            }
            if(temp != 1)
            {
                System.out.println("\n \tSorry....All rooms are occupied.");
            }
            
            System.out.println("\n");
        }
        
        if(choice == 2)
        {
            System.out.println("\n ****** List of all Unoccupied Rooms ********\n");
            int temp =0;
            for (int i=0;i<countD;i++)
            {
                if(doubleListA[i] == 1)
                {
                  System.out.println(doubleList[i]);  
                  temp=1;
                }        
            }
            if(countD == 0)
            {
                System.out.println("No rooms are present. Please add a room first.");
                temp=1;
            }
            if(temp != 1)
            {
                System.out.println("\n \tSorry....All rooms are occupied.");
            }
            
            System.out.println("\n");
        }
        
        if(choice == 3)
        {
            System.out.println("\n ****** List of all Unoccupied Rooms ********\n");
            int temp =0;
            for (int i=0;i<countK;i++)
            {
                if(kingListA[i] == 1)
                {
                  System.out.println(kingList[i]);  
                  temp=1;
                }        
            }
            if(countK == 0)
            {
                System.out.println("No rooms are present. Please add a room first.");
                temp=1;
            }
            if(temp != 1)
            {
                System.out.println("\n \tSorry....All rooms are occupied.");
            }
            
            System.out.println("\n");
        }
    }
    
    
    public void showRoomO(int ch3)
    {
        
        if(ch3 == 1)
        {
            System.out.println("\n ****** List of all Occupied Rooms ********\n");
            int temp =0;
            for (int i=0;i<countS;i++)
            {
                if(singleListA[i] == 0)
                {
                  System.out.println(singleList[i]); 
                  temp=1;
                }           
            }
            if(countS == 0)
            {
                System.out.println("No rooms are present. Please add a room first.");
                temp=1;
            }
            if(temp != 1)
            {
                System.out.println("\n \tSorry....All rooms are Available.");
            }
            
            System.out.println("\n");
        }
        
        if(ch3 == 2)
        {
            System.out.println("\n ****** List of all Occupied Rooms ********\n");
            int temp =0;
            for (int i=0;i<countS;i++)
            {
                if(doubleListA[i] == 0)
                {
                  System.out.println(doubleList[i]); 
                  temp=1;
                }           
            }
            if(countD == 0)
            {
                System.out.println("No rooms are present. Please add a room first.");
                temp=1;
            }
            if(temp != 1)
            {
                System.out.println("\n \tSorry....All rooms are Available.");
            }
            
            System.out.println("\n");
        }
        
        if(ch3 == 3)
        {
            System.out.println("\n ****** List of all Occupied Rooms ********\n");
            int temp =0;
            for (int i=0;i<countK;i++)
            {
                if(kingListA[i] == 0)
                {
                  System.out.println(kingList[i]); 
                  temp=1;
                }           
            }
            if(countK == 0)
            {
                System.out.println("No rooms are present. Please add a room first.");
                temp=1;
            }
            if(temp != 1)
            {
                System.out.println("\n \tSorry....All rooms are Available.");
            }
            
            System.out.println("\n");
        }
    }
    
    
    public void findRoom(String name) 
    {
        int loc = -1;
        int temp1 =0;
        String a = "Occupied";
        
        for (int index = 0; index < countS; index++) 
        {
            if (name.equalsIgnoreCase(singleList[index])) 
            {
                loc = index;
                if(singleListA[loc] == 1)
                {
                    a="Available";
                }
                System.out.println("\n\t***Room Found***");
                System.out.println("\nRoom No: "+singleList[loc]+"\tPrice: "+priceS+"$/Night"+"\tAvalability: "+a+"\n");
                temp1=1;
                break;
            }
        }
        if(temp1 != 1)
        {
            for (int index = 0; index < countD; index++) 
            {
                if (name.equalsIgnoreCase(doubleList[index])) 
                {
                    loc = index;
                    if(doubleListA[loc] == 1)
                    {
                        a="Available";
                    }
                    System.out.println("***Room Found***");
                    System.out.println("\n\nRoom No: "+doubleList[loc]+"\tPrice: "+priceD+"$/Night"+"\tAvalability: "+a);
                    temp1=1;
                    break;
                }
            }
            
        }
        if(temp1 != 1)
        {
            for (int index = 0; index < countK; index++) 
            {
            if (name.equalsIgnoreCase(kingList[index])) 
                {
                    loc = index;
                    if(kingListA[loc] == 1)
                    {
                        a="Available";
                    }
                    System.out.println("***Room Found***");
                    System.out.println("\n\nRoom No: "+kingList[loc]+"\tPrice: "+priceK+"$/Night"+"\tAvalability: "+a);
                    temp1=1;
                    break;
                }
            }
            
        }
        if(temp1 != 1)
        {
            System.out.println("\t No Room Found");
            
        }
        
    }
    
    public int getAvailability1(int type)
    {
            int ind=-1;
            if(type==1)
            {
                
                for(int i =0;i<countS;i++)
                {
                    if(singleListA[i]==1)
                    {
                        ind=i;
                    }
                }
            }
            return ind;
    }
    
    public int getCountS()
    {
        
        return countS;
    }
    public void setCountS(int s)
    {
        this.countS=s;
        
    }
    
    
    //Mutator Methods
    
    public boolean setRoom(String name) 
    {
        boolean added1 = false;
        
            System.out.println(" Please select the room type");
            System.out.println("1. Single");
            System.out.println("2. Double");
            System.out.println("3. King");  
            System.out.print("Enter your choice -> ");
            int choice = sc.nextInt();
       
        if(choice == 1)
        {
                if (countS < capacityS) 
                {
                    singleList[countS] = name;
                    //singleListA[countS] = 1;
                    setAvailability(1,choice,countS);
                    setCountS(countS);
                    countS ++;
                    added1 = true;
                    
                    
                }
                
        }
        else if(choice == 2)
        {
                if (countD < capacityD) 
                {
                    doubleList[countD] = name;
                    //doubleListA[countD] = 1;
                    setAvailability(1,choice,countD);
                    added1 = true;
                    countD++;
                }
                
        }
        
        else if(choice == 3)
        {
                if (countK < capacityK) 
                {
                    kingList[countK] = name;
                    //doubleListA[countK] = 1;
                    setAvailability(1,choice,countK);
                    added1 = true;
                    countK++;
                }
                
        }
        return added1;
    }
    
    public void setAvailability(int newAvail,int type,int count2 )
    {
        if(type == 1)
        {
            singleListA[count2] = newAvail;
        }
        if(type == 2)
        {
            doubleListA[count2] = newAvail;
        }
        if(type == 3)
        {
            kingListA[count2] = newAvail;
        }
        
    }
   
    
    
    
//*********Constructors**********
    
    public Room()
    {
        this(10,10,5);  
    }
    
    public Room(int capacityS,int capacityD,int capacityK) 
    {
        this.capacityS = capacityS;
        
        this.priceS=200;
        singleList = new String[capacityS];
        singleListA = new int[capacityS];
        
        this.capacityD = capacityD;
        this.countD = 0;
        this.priceD=250;
        doubleList = new String[capacityD];
        doubleListA = new int[capacityD];
        
        this.capacityK = capacityK;
        this.countK = 0;
        this.priceK=400;
        kingList = new String[capacityK];
        kingListA = new int[capacityK];
     }
    
}
