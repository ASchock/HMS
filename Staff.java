/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author Deep Patel
 */
public class Staff 
{
    String sname,sid_no,designation,s_status,category;
    
    //accessor methods
    public String getSname()
    {
        return sname;
    }
    public String getSid_no()
    {
        return sid_no;
    }
    public String getDesignation()
    {
        return designation;
    }
    public String getS_status()
    {
        return s_status;
    }
    public String getCategory()
    {
        return category;
    }
    
    //Mutator Methods
    public void setSname(String newSname)
    {
        sname=newSname;
    }
    public void setSid_no(String newSnid_no)
    {
        sid_no=newSnid_no;
    }
    public void setS_status(String newS_status)
    {
        s_status=newS_status;
    }
    public void setDesignation(String newDesignation)
    {
        designation=newDesignation;
    }
    public void setCategory(String newCategory)
    {
        category=newCategory;
    }
    
    //Constructor
    public Staff()
    {
        sname="John";
        sid_no="K0123";
        category="Kitchen";
        designation="Head Chef";
        s_status="Full time";
        
    }
    
}
