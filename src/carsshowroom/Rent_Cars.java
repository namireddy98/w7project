/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsshowroom;


public class Rent_Cars extends Cars{

    
    
    
    //Declaring Variables    
    private double perDay;
    private double Days;
    private Customer CustomerData;

    //No Parameterized Constructor
    public Rent_Cars() {
    }
        
    //Fully Parameterized Constructor
    
    public Rent_Cars(double perDay, double Days, Customer CustomerData, String name,
            double number, double model, String city, String color) {
        super(name, number, model, city, color);
        this.perDay = perDay;
        this.Days = Days;
        this.CustomerData = CustomerData;
    }

    //Setters and Getters
    public double getPerDay() {
        return perDay;
    }

    public void setPerDay(double perDay) {
        this.perDay = perDay;
    }

    public double getDays() {
        return Days;
    }

    public void setDays(double Days) {
        this.Days = Days;
    }

    public Customer getCustomerData() {
        return CustomerData;
    }

    public void setCustomerData(Customer CustomerData) {
        this.CustomerData = CustomerData;
    }

    //Overriding Method for Calculating Amount
    
    @Override
    public double calculateAmount() {
        return  Days * perDay;
    }

      @Override
    public void Avialable() {
    
        System.out.println("Available");
        
    }


    
}
