/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse3.pkg1;


class User1 {
  private int id;
    private String name, occupation,phone,email,date;
   private double amount_of_donation;

   public User1(int id, String name, String occupation, String phone, double amount_of_donation,String date) {
         //To change body of generated methods, choose Tools | Templates.
        this.id=id;
        this.name=name;
        this.occupation=occupation;
        this.phone=phone;
        this.email=email;
        this.amount_of_donation=amount_of_donation;
        this.date=date;
        
        
        
    }
    public int id()
    {
        return id;
    }
    public String name()
    {
        return name;
    }
    public String occupation()
    {
        return occupation;
    }
    public String phone()
    {
        return phone;
    }
    public String email()
    {
        return email;
    }
    public double amount_of_donation()
    {
        return amount_of_donation;
    }
    public String date()
    {
        return date;
    }
    
}


