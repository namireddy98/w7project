/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carsshowroom;


public class Cars implements Observe,State{
    
    
    //Declaring Variables
    private String name;
    private double number;
    private double model;
    private String city;
    private String color;

    //No Parameterized Constructor
    public Cars() {
    }

    //Fully Parameterized Constructor
    public Cars(String name, double number, double model, String city, String color) {
        this.name = name;
        this.number = number;
        this.model = model;
        this.city = city;
        this.color = color;
    }

    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double getModel() {
        return model;
    }

    public void setModel(double model) {
        this.model = model;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //Overriding method for the usage of sub classes
    @Override
    public double calculateAmount() {
       return 0;
    }

    @Override
    public void Avialable() {
    
    }

    @Override
    public void Not_Available() {
    
    }

    
    
}
