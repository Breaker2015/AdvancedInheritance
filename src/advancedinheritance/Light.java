/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedinheritance;

/**
 *
 * @author Ronan
 */
public abstract class Light implements Switchable, Dimmable {
    
    private Status status;
    
    public void turnOn(){
        status = Status.ON;
    }
    
    public void turnOff(){
        status = Status.OFF;
    }
    
    
    public void dim(){
        System.out.println("Dimm the light");
    }
    
    public abstract void changeBulb();

    @Override
    public String toString() {
        
        String className = this.getClass().getName();
        return "The " + className + " is turned "
                + status.toString().toLowerCase();
    }
    
    
    
    
    
}
