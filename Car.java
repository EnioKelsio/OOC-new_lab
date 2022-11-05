/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc.yoursolution;

import java.util.Map;
import ooc.enums.Month;

/**
 *
 * @author barxl
 */
public class Car implements CarInterface{
    int id;
    double rate;
    Make myMake;
    
    Map<month, boolean[]>availability;
    
    public Car(int id, int rate){
        this.id = id;
        this.myMake = myMake;
        this.rate = rate;
        this.availability = createAvailability();
    }
    
    @Override
    public Map<Month,boolean[]>createAvailability(){
        return availability;
    }
    
    @Override
    public myMake getMake(){
        return make;
    }
    
    @Override
    public void setMake(){
       this.make = myMake; 
    }
    
    @Override
    public double getRate(){
        return rate;
    }
    
    @Override
    public void setRate(double rate){
        
    }
    
    @Override
    public Map<Month, boolean[]>getAvailability(){
    return availability;
    }
    
    @Override
    public void setAvailability(Map<Month, boolean[]> availability){
        
    }
    
    @Override
    public int getId(){
        return id;
    }
    
    @Override
    public boolean isAvailable(Month, int day){
        return true;
    }
    
    @Override
    public boolean book(Month month, int day){
        return true;
    }        
}
